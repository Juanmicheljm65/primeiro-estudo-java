package Desafio_1_Java;

import java.util.Scanner;

public class Sistema_Bancario {
    Scanner scanner = new Scanner(System.in);
    double saldoAtual = 100;
    int opcao = 0;

    public static void main(String[] args) {
        Sistema_Bancario sistema = new Sistema_Bancario();
        sistema.dadosCliente();
        sistema.menu();
    }

    public void dadosCliente() {
        System.out.println(String.format("""
            *****************************
            Dados iniciais do cliente:
                            
            Nome: Juan
            Tipo de conta: Corrente
            Saldo Atual: R$%.2f
            *****************************
            """, saldoAtual));
    }

    public void menu() {
        String menu = """
            *****************************
            Operações
                            
            1 - Consultar saldo
            2 - Depositar
            3 - Sacar
            4 - Sair
                        
            Digite a opção desejada: 
            *****************************
            """;
        while(opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(String.format("""
                            Seu saldo atual é: R$%.2f
                            """, saldoAtual));
                    break;
                case 2:
                    System.out.println("Informe o valor a depositar: ");
                    double valorADepositar = scanner.nextDouble();
                    if (valorADepositar > 0) {
                        System.out.println(String.format("""
                                Valor depositado!
                                Seu saldo atual é: R$%.2f
                                """, saldoAtual += valorADepositar));
                        break;
                    } else {
                        System.out.println("Valor inválido");
                        break;
                    }
                case 3:
                    System.out.println("Informe o valor a sacar: ");
                    double valorASacar = scanner.nextDouble();
                    if (valorASacar <= saldoAtual) {
                        System.out.println(String.format("""
                                Valor sacado!
                                Seu saldo atual é: R$%.2f
                                """, saldoAtual -= valorASacar));
                        break;
                    } else {
                        System.out.println("Valor de saque maior que o valor disponível na conta ou é um valor inválido.");
                        break;
                    }
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção digitada inválida");
                    break;
            }
        }
    }
}
