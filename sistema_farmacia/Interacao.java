package sistema_farmacia;
//OQUE FALTA FAZER: A FUNÇÃO VOLTAR; ESCOLHA DO MOTOBOY (S OU N), FAZER  A ESCOLHA DE MOSTRAR AS INFOS(S OU N). 
import lerdados.LerDados;

public class Interacao{

    public static TabelaDePreco escolha(){
        TabelaDePreco preco = new TabelaDePreco();
        System.out.println("\n=)--- SISTEMA DE COMPRAS ---(=\n");
        String escolha;
        float valor = 0f;
            do{
            System.out.println("Escreva (VOLTAR) para ter acesso a tabela de preços");
            System.out.println("Escreva (SAIR) para fechar o sistema de compras");
            System.out.println("Escreva os remédios que deseja:\n");
            escolha = LerDados.lerTexto();
            escolha = escolha.toLowerCase();
            
            switch (escolha) {
                case "dipirona":
                    valor += preco.diPreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case "dorflex":
                    valor += preco.dorPreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case "omeprazol":
                    valor += preco.omPreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case "benegripe":
                    valor += preco.benPreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                        case "ozempic":
                                System.out.println("Voce tem a receita?");
                                System.out.println("Digite 1 para sim");
                                System.out.println("Digite 2 para não");
                                System.out.println("Digite 3 para voltar ao menu");
                            int escolhaOzmp = LerDados.lerInt(escolha);
                    switch(escolhaOzmp) {
                        case 1:
                            valor += preco.ozePreco;
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
                case "strepsils":
                    valor += preco.sprePreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case "rinosoro":
                    valor += preco.rinoPreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case "cimegripe":
                    valor += preco.cimPreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + valor);
                    break;
                case "prednisona":
                    valor += preco.predPreco;
                    System.out.println("compra realizada com sucesso, total:\n" + valor);
                    break;
                case "fluoxetina":
                    valor += preco.fluoPreco;
                    System.out.println("compra realizada com sucesso, total:\n" + valor);
                    break;
                case "sair":
                    System.out.println("Sistema de compras finalizado com sucesso");
                    break;
                default:
                    System.out.println(escolha + " Nome não encontrado fora da lista");
                    break;
                }
            } while (!escolha.equals("sair"));
            System.out.println("O valor total da compra é: " + valor);
                return preco;
        }
}