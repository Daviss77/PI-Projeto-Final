package sistema_farmacia;
//OQUE FALTA FAZER:FAZER  A ESCOLHA DE MOSTRAR AS INFOS(S OU N). ARRAYLIST PARA ARMAZENAR OS RÉMERIOS, mostrar as informações e preço dos rémedios.
import lerdados.LerDados;
import sistema_farmacia.InfoRemedio.Medicamento;

public class Interacao{

    public static TabelaDePreco escolha(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        System.out.println("\n=)--- MENU DE COMPRAS ---(=");
        String escolha;
        entrega.valor = 0f; 
            do{
            System.out.println("\nEscreva (VOLTAR) para ter acesso a tabela de preços");
            System.out.println("Escreva (FINALIZAR) para fechar o sistema de compras");
            System.out.println("Escreva os remédios que deseja:\n");
            escolha = LerDados.lerTexto();
            escolha = escolha.toLowerCase();
            
            switch (escolha) {
                case "dipirona":
                    Medicamento.dipirona();
                    InteracaoCompra.confirmacao();
                        break;
                case "dorflex":
                    entrega.valor += preco.dorPreco;
                    System.out.println("Compra adicionada ao carrinho:\n " + entrega.valor);
                        break;
                    //prescrição médica
                case "omeprazol":
                        System.out.println("Voce tem a receita?");
                        System.out.println("Digite 1 para sim");
                        System.out.println("Digite 2 para não");
                        System.out.println("Digite 3 para voltar ao menu");
                        int escolhaOme = LerDados.lerInt();
                        switch(escolhaOme) {
                            case 1:
                                entrega.valor += preco.omPreco;
                                System.out.println("Compra de Omeprazol adicionada ao carrinho: " + entrega.valor);
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
                case "benegripe":
                    entrega.valor += preco.benPreco;
                    System.out.println("Compra adicionada ao carrinho:\n " + entrega.valor);
                        break;
                    //Prescrição médica
                        case "ozempic":
                                System.out.println("Voce tem a receita?");
                                System.out.println("Digite 1 para sim");
                                System.out.println("Digite 2 para não");
                                System.out.println("Digite 3 para voltar ao menu");
                            int escolhaOzmp = LerDados.lerInt();
                    switch(escolhaOzmp) {
                        case 1:
                            entrega.valor += preco.ozePreco;
                            System.out.println("Compra de Ozempic adiocionado ao carrinho: " + entrega.valor);
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
                
                case "strepsils":
                    entrega.valor += preco.sprePreco;
                    System.out.println("Compra adicionada ao carrinho:\n " + entrega.valor);
                        break;
                case "rinosoro":
                        Medicamento.rinosoro();
                    entrega.valor += preco.rinoPreco;
                    System.out.println("Compra adicionada ao carrinho:\n " + entrega.valor);
                        break;
                case "cimegripe":
                    entrega.valor += preco.cimPreco;
                    System.out.println("Compra adicionada ao carrinho:\n " + entrega.valor);
                        break;
                    //Prescrição médica
                case "prednisona":
                System.out.println("Voce tem a receita?");
                System.out.println("Digite 1 para sim");
                System.out.println("Digite 2 para não");
                System.out.println("Digite 3 para voltar ao menu");
            int escolhaPred = LerDados.lerInt();
    switch(escolhaPred){
        case 1:
            entrega.valor += preco.predPreco;
            System.out.println("Compra de Prednisona adicionada ao carrinho: " + entrega.valor);
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
                    //Prescrição médica
                case "fluoxetina":
                System.out.println("Voce tem a receita?");
                System.out.println("Digite 1 para sim");
                System.out.println("Digite 2 para não");
                System.out.println("Digite 3 para voltar ao menu");
            int escolhaFlux = LerDados.lerInt();
    switch(escolhaFlux) {
        case 1:
            entrega.valor += preco.fluoPreco;
            System.out.println("Compra de Fluxetina adicionada ao carrinho: " + entrega.valor);
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
        case "kit universitario":
            Medicamento.kitUniversitario();
            entrega.valor += preco.kitPreco;
            System.out.println("Compra do kit universitário adicionada ao carrinho: " + entrega.  valor);
                break;
        case "finalizar":
            System.out.println("Sistema de compras finalizado com sucesso");
                break;
        case "voltar":
            TabelaDePreco.dadosDePreco();
                break;
        default:
            System.out.println(escolha + " Nome não encontrado fora da lista");
                break;
                }
            } while (!escolha.equals("finalizar"));
            
            String motoBoy;

            System.out.println("O pedido vai ser via MotoBoy? digite ( S ) para entrar no sistema ou ( X ) para finalização da compra");
            do{
            motoBoy = LerDados.lerTexto();
            motoBoy = motoBoy.toLowerCase();
            if(motoBoy.equals("s")){
                    System.out.println("Você é de qual região de São Paulo?\n--- DIGITE A REGIÃO CORRESPONDENTE ---\nCentro\nSul\nLeste\nOeste\nNorte\n");
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
                    }}while (motoBoy.equals("s"));

                return preco;
        }
}