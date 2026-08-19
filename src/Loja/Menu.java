package Loja;

import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
        System.out.println("BEM VINDO AO SISTEMA CANTINHO PET ");

        int escolha;
        do {
            System.out.println("1-Cadastrar");
            System.out.println("2-Listar produtos");
            System.out.println("3-Buscar produto por código");
            System.out.println("4-Atualizar");
            System.out.println("5-Remover");
            System.out.println("6- Buscar produto pelo nome");
            System.out.println("7- Sair do sistema");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    sistema.cadastrarProduto(scanner);
                    break;
                case 2:
                    sistema.listar();
                    break;
                case 3:
                    sistema.buscar(scanner);
                    break;
                case 4:
                    sistema.atualizarInfo(scanner);
                    break;
                case 5:
                    sistema.removerProduto(scanner);
                    break;
                case 6:
                    sistema.buscarProdutosNome(scanner);
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
            }
        } while(escolha > 0 && escolha < 5);

    }
}