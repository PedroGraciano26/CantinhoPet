package Loja;

import java.util.Scanner;

public class Menu {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
        int escolha;
        System.out.println("BEM VINDO AO SISTEMA CANTINHO PET ");
        do {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto por nome");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");
            System.out.println("6 - Sair");

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
                    System.out.println("Saindo do sistema! ");
                    System.out.println("Obrigado por utilizá-lo");
                    break;
                default:
                    System.out.println("Ação inválida");
                    return;
            }
        } while (escolha > 0 && escolha < 5);
    }
}