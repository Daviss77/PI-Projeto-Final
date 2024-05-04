package sistema_farmacia;

import java.util.Scanner;

public class Interacao {

    public static void main(String[] args) {
        TabelaDePreco.dadosDePreco();

        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n\nDigite o código do seu remédio\n");
        int escolha;
        double valor = 0;

        do {
            System.out.println("\nDigite 1 para dipirona");
            System.out.println("Digite 2 para DorFlex");
            System.out.println("Digite 3 para Omeprazol");
            System.out.println("Digite 4 para Benegripe");
            System.out.println("Digite 5 para Ozempic");
            System.out.println("Digite 6 para Strepsils");
            System.out.println("Digite 7 para Rinossoro");
            System.out.println("Digite 8 para Cimegripe");
            System.out.println("digite 9 para Prednisona");
            System.out.println("digite 10 para Fluoxetina");
            System.out.println("Digite 11 para finalizar o programa");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    valor += 2.00;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case 2:
                    valor += 5.00;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case 3:
                    valor += 4.00;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case 4:
                    valor += 5.50;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                        case 5:
                                System.out.println("Voce tem a receita?");
                                System.out.println("Digite 1 para sim");
                                System.out.println("Digite 2 para não");
                                System.out.println("Digite 3 para voltar ao menu");
                            int escolhaOzmp = scanner.nextInt();
                    switch(escolhaOzmp) {
                        case 1:
                            valor += 3.00;
                            System.out.println("Compra de Ozempic realizada com sucesso, total: " + valor);
                            break;
                        case 2:
                            System.out.println("Infelizmente a compra de Ozempic não pode ser realizada sem receita.");
                            break;
                        case 3:
                            continue;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 6:
                    valor += 4.50;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case 7:
                    valor += 2.50;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case 8:
                    valor += 7.00;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case 9:
                    valor += 7.50;
                    System.out.println("compra realizada com sucesso, total:\n" + valor);
                    break;
                case 10:
                    valor += 6.00;
                    System.out.println("compra realizada com sucesso, total:\n" + valor);
                    break;
                case 11:
                    System.out.println("Programa finalizado com sucesso");
                    break;
                default:
                    System.out.println("Código fora da lista");
                    break;
            }
        } while (escolha != 11);
        
        System.out.println("O valor total da compra é: " + valor);

        scanner.close();
    }
}