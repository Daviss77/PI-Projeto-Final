package sistema_farmacia;
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
                    Validacao.confirmaDipirona();
                break;
                case "dorflex":
                    Medicamento.dorflex();
                    Validacao.confirmaDorflex();
                break;
                    //prescrição médica
                case "omeprazol":
                        Medicamento.omeprazol();
                        Validacao.receita();
                break;
                case "benegripe":
                        Medicamento.benegripe();
                        Validacao.confirmaBenegripe();
                break;
                    //Prescrição médica
                case "ozempic":
                        Medicamento.ozempic();
                        Validacao.receita();
                break;
                case "strepsils":
                        Medicamento.strepsils();
                        Validacao.confirmaStrepsils();
                break;
                case "rinosoro":
                        Medicamento.rinosoro();
                        Validacao.confirmaRinosoro();
                break;
                case "cimegripe":
                        Medicamento.cimegripe();
                        Validacao.confirmaCimegripe();
                break;
                    //Prescrição médica
                case "prednisona":
                        Medicamento.prednisona();
                        Validacao.receita();
                break;
                    //Prescrição médica
                case "fluoxetina":
                        Medicamento.fluoxetina();
                        Validacao.receita();
                break;
                case "kit universitario":
                        Medicamento.kitUniversitario();
                        entrega.valor += preco.kitPreco;
                        System.out.println("Compra do kit universitário adicionada ao carrinho: " + entrega.valor);
                break;
                case "finalizar":
                        System.out.println("Sistema de compras finalizado com sucesso");
                        TabelaDePreco.statusCompra();
                break;
                case "voltar":
                        TabelaDePreco.dadosDePreco();
                    break;
                default:
                        System.out.println(escolha + " Nome não encontrado fora da lista");
                break;
                }
            }
        while(!escolha.equals("finalizar"));

            boolean motoBoy;

            System.out.println("O pedido vai ser via MotoBoy? digite ( S ) para entrar no sistema ou ( N ) para finalização da compra");
        do{
            motoBoy = LerDados.lerSimNao();
            if(motoBoy == true)
                {
                    System.out.println("Você é de qual região de São Paulo?\n--- DIGITE A REGIÃO CORRESPONDENTE ---\nCentro\nSul\nLeste\nOeste\nNorte\n");
                    String regiao = LerDados.lerTexto().toLowerCase();
                    switch (regiao)
                    {
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
                }
                if(motoBoy == false){
                    System.out.println("\n---( Sistema de compras fechado )---");
                    motoBoy = true;
                }
        }
                while (!motoBoy == true);

                return preco;
            }
        }
