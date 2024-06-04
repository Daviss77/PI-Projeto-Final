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
            System.out.println("\nEscreva ( VOLTAR ) para ter acesso a tabela de preços");
            System.out.println("Escreva ( FINALIZAR ) para fechar o sistema de compras");
            System.out.println("Escreva ( CARRINHO ) para mostrar os remédios escolhidos");
            System.out.println("Escreva os remédios que deseja:");
            escolha = LerDados.lerTexto();
            escolha = escolha.toLowerCase();
            switch (escolha) {
                case "dipirona":
                Medicamento.dipirona();
                Validacao.confirmaDipirona();
                Salvar.cadastroCliente.add("dipirona");
                break;
                case "dorflex":
                    Medicamento.dorflex();
                    Validacao.confirmaDorflex();
                    Salvar.cadastroCliente.add("dorflex");
                break;
                    //prescrição médica
                case "omeprazol":
                        Medicamento.omeprazol();
                        Validacao.receitaOmeprazol();
                break;
                case "benegripe":
                        Medicamento.benegripe();
                        Validacao.confirmaBenegripe();
                        Salvar.cadastroCliente.add("benegripe");
                break;
                    //Prescrição médica
                case "ozempic":
                        Medicamento.ozempic();
                        Validacao.receitaOzempic();
                break;
                case "strepsils":
                        Medicamento.strepsils();
                        Validacao.confirmaStrepsils();
                        Salvar.cadastroCliente.add("strepsils");
                break;
                case "rinosoro":
                        Medicamento.rinosoro();
                        Validacao.confirmaRinosoro();
                        Salvar.cadastroCliente.add("rinosoro");
                break;
                case "cimegripe":
                        Medicamento.cimegripe();
                        Validacao.confirmaCimegripe();
                        Salvar.cadastroCliente.add("cimegripe");
                break;
                    //Prescrição médica
                case "prednisona":
                        Medicamento.prednisona();
                        Validacao.receitaPrednisona();
                break;
                    //Prescrição médica
                case "fluoxetina":
                        Medicamento.fluoxetina();
                        Validacao.receitaFluoxetina();
                        
                break;
                case "kit universitario":
                        Medicamento.kitUniversitario();
                        entrega.valor += preco.kitPreco;
                        Salvar.cadastroCliente.add("Kit Universitario");
                        System.out.println("Compra do kit universitário adicionada ao carrinho: " + entrega.valor);
                break;
                case "finalizar":
                        Salvar.remover();
                        System.out.println("Sistema de compras finalizado com sucesso");
                        TabelaDePreco.statusCompra();
                        String conversao = Float.toString(TabelaDePreco.total);
                        Salvar.cadastroCliente.add(conversao);
                break;
                case "voltar":
                        TabelaDePreco.dadosDePreco();
                break;
                case "carrinho":
                        System.out.println("Remédios adicionados ao carrinho  " + Salvar.cadastroCliente);
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
                        Salvar.cadastroCliente.add(regiao);
                        entrega.rotaCentro();
                        break;
                        case "sul":
                        Salvar.cadastroCliente.add(regiao);
                        entrega.rotasSul();
                        break;
                        case "leste":
                        Salvar.cadastroCliente.add(regiao);
                        entrega.rotaLeste();
                        break;
                        case "oeste":
                        Salvar.cadastroCliente.add(regiao);
                        entrega.rotaOeste();

                        break;
                        case "norte":
                        Salvar.cadastroCliente.add(regiao);
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
