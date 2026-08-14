package Loja;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sistema {
    HashMap<String, Produto> produtos;

    public Sistema() {
        this.produtos = new HashMap<>();
    }

    public void cadastrarProduto(Scanner scanner){

        Produto produto = null;
        System.out.println("Qual produto você quer cadastrar:");
        System.out.println("1-Ração");
        System.out.println("2-Acessório");
        System.out.print("Digite: ");

        int opcaoProduto = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o código do produto?");
        String codigo = scanner.nextLine();

        System.out.println("Qual o nome do produto?");
        String nome = scanner.nextLine();

        System.out.println("Qual o preço do produto?");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual a quantidade do produto?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        if(opcaoProduto == 1){
            produto =cadastrarRacao(scanner, codigo, nome, preco, quantidade);
        } else if (opcaoProduto == 2) {
            produto =cadastrarAcessorio(scanner, codigo, nome, preco, quantidade);
        }else{
            System.out.println("Opção Inválida");
        }
        produtos.put(codigo, produto);
        System.out.println("Produto cadastrado!");
    }

    private Produto cadastrarRacao(Scanner scanner, String codigo, String nome, double preco, int quantidade){
        System.out.println("Qual a validade?");
        String validade = scanner.nextLine();

        System.out.println("Qual o sabor?");
        String sabor = scanner.nextLine();

        Produto produto = new Racao(codigo, nome, preco, quantidade, validade, sabor);
        return produto;

    }

    private Produto cadastrarAcessorio(Scanner scanner, String codigo, String nome, double preco, int quantidade){
        System.out.println("Qual o material:");
        String material = scanner.nextLine();

        System.out.println("Qual a categoria? \n1-Roupa \n2-COLEIRA \n3- Outro");
        int opcaoCategoria = scanner.nextInt();
        scanner.nextLine();
        CategoriaAcessorio categoria = null;
        if(opcaoCategoria == 1){
            categoria = CategoriaAcessorio.ROUPA;
        }else if(opcaoCategoria == 2){
            categoria = CategoriaAcessorio.COLEIRA;
        }else if(opcaoCategoria == 3){
            categoria = CategoriaAcessorio.OUTRO;
        }

        Produto produto = new Acessorio(codigo, nome, preco, quantidade, material, categoria);
        return produto;
    }


    public void listar(){
        if (produtos.isEmpty()){
            System.out.println("Não há produtos cadastrados");
        }
        for (Produto produto:produtos.values()){
            System.out.println(produto);
        }
    }

    public Produto buscar(Scanner scanner){
        System.out.println("Digite o código do produto procurado:");
        String codigoProcurado = scanner.nextLine();

        for (Map.Entry<String, Produto> entry : produtos.entrySet()) {
            if(entry.getKey().equalsIgnoreCase(codigoProcurado)){
                System.out.println("Produto Encontrado");
                System.out.println(entry.getValue());
                return entry.getValue();
            }
        }
        System.out.println("Produto não encontrado!");
        return null;
    }

    public void atualizarPreco(Scanner scanner){
        Produto produto = buscar(scanner);

        if(produto == null){
            System.out.println("Impossível Atualizar");
            return;
        }else{
            System.out.println("Informe o novo preço:");
            double novoPreco = scanner.nextDouble();
            scanner.nextLine();
            produto.setPreco(novoPreco);
            System.out.println("Produto atualizado!");
            System.out.println(produto);
        }
    }