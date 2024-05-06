package sistema_farmacia;
//OQUE FALTA FAZER: A FUNÇÃO VOLTAR, FAZER  A ESCOLHA DE MOSTRAR AS INFOS(S OU N). ARRAYLIST PARA ARMAZENAR OS RÉMERIOS;
import lerdados.LerDados;

public class Interacao{

    public static TabelaDePreco escolha(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        System.out.println("\n=)--- SISTEMA DE COMPRAS ---(=\n");
        String escolha;
        entrega.valor = 0f;
            do{
            System.out.println("Escreva (VOLTAR) para ter acesso a tabela de preços");
            System.out.println("Escreva (SAIR) para fechar o sistema de compras");
            System.out.println("Escreva os remédios que deseja:\n");
            escolha = LerDados.lerTexto();
            escolha = escolha.toLowerCase();
            
            switch (escolha) {
                case "dipirona":
                    entrega.valor += preco.diPreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + entrega.valor);
                    break;
                case "dorflex":
                    entrega.valor += preco.dorPreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + entrega.valor);
                    break;
                    //prescrição médica
                case "omeprazol":
                        System.out.println("Voce tem a receita?");
                        System.out.println("Digite 1 para sim");
                        System.out.println("Digite 2 para não");
                        System.out.println("Digite 3 para voltar ao menu");
                        int escolhaOme = LerDados.lerInt(escolha);
                        switch(escolhaOme) {
                            case 1:
                                entrega.valor += preco.omPreco;
                                System.out.println("Compra de Omeprazol realizada com sucesso, total: " + entrega.valor);
                                break;
                            case 2:
                                System.out.println("Infelizmente a compra de Omeprazol não pode ser realizada sem receita.");
                                break;
                            case 3:
                                continue;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    break;
                case "benegripe":
                    entrega.valor += preco.benPreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + entrega.valor);
                    break;
                    //Prescrição médica
                        case "ozempic":
                                System.out.println("Voce tem a receita?");
                                System.out.println("Digite 1 para sim");
                                System.out.println("Digite 2 para não");
                                System.out.println("Digite 3 para voltar ao menu");
                            int escolhaOzmp = LerDados.lerInt(escolha);
                    switch(escolhaOzmp) {
                        case 1:
                            entrega.valor += preco.ozePreco;
                            System.out.println("Compra de Ozempic realizada com sucesso, total: " + entrega.valor);
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
                    entrega.valor += preco.sprePreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + entrega.valor);
                    break;
                case "rinosoro":
                    entrega.valor += preco.rinoPreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + entrega.valor);
                    break;
                case "cimegripe":
                    entrega.valor += preco.cimPreco;
                    System.out.println("Compra realizada com sucesso, total:\n " + entrega.valor);
                    break;
                    //Prescrição médica
                case "prednisona":
                System.out.println("Voce tem a receita?");
                System.out.println("Digite 1 para sim");
                System.out.println("Digite 2 para não");
                System.out.println("Digite 3 para voltar ao menu");
            int escolhaPred = LerDados.lerInt(escolha);
    switch(escolhaPred){
        case 1:
            entrega.valor += preco.predPreco;
            System.out.println("Compra de Prednisona realizada com sucesso, total: " + entrega.valor);
            break;
        case 2:
            System.out.println("Infelizmente a compra de Prednisona não pode ser realizada sem receita.");
            break;
        case 3:
            continue;
        default:
            System.out.println("Opção inválida");
            break;
    }
                    break;
                    //Prescrição médica
                case "fluoxetina":
                System.out.println("Voce tem a receita?");
                System.out.println("Digite 1 para sim");
                System.out.println("Digite 2 para não");
                System.out.println("Digite 3 para voltar ao menu");
            int escolhaFlux = LerDados.lerInt(escolha);
    switch(escolhaFlux) {
        case 1:
            entrega.valor += preco.fluoPreco;
            System.out.println("Compra de Fluxetina realizada com sucesso, total: " + entrega.valor);
            break;
        case 2:
            System.out.println("Infelizmente a compra de Fluxetina não pode ser realizada sem receita.");
            break;
        case 3:
            continue;
        default:
            System.out.println("Opção inválida");
            break;
    }
                    break;
                case "sair":
                    System.out.println("Sistema de compras finalizado com sucesso");
                    break;
                default:
                    System.out.println(escolha + " Nome não encontrado fora da lista");
                    break;
                }
            } while (!escolha.equals("sair"));
            
            String motoBoy;
            do{
            System.out.println("O pedido vai ser via MotoBoy? digite ( S ) para entrar no sistema ou ( X ) para finalização da compra");
            motoBoy = LerDados.lerTexto();
            motoBoy = motoBoy.toLowerCase();
            if(motoBoy.equals("s")){
                
                    System.out.println("Você é de qual região de São Paulo?\n--- DIGITE A REGIÃO CORRESPONDENTE ---\n Centro\nSul\nLeste\nOeste\nNorte\n");
                    String regiao = LerDados.lerTexto();
                    regiao = regiao.toLowerCase();
                    switch (regiao) {
                        case "centro" :
                            entrega.rotaCentro();
                            break;
                        case "sul":
                            entrega.rotasSul();
                            break;
                        case "leste":
                            entrega.rotaLeste();
                            break;
                        case "oeste":
                            entrega.rotaOeste();
                            break;
                        case "norte":
                            entrega.rotaNorte();
                            break;
                        default: 
                                System.out.println( regiao + " Valor não encontrado! Digite novamente.");
                            break;
                        }
                    }}while (!motoBoy.equals("x"));

                return preco;
        }
}