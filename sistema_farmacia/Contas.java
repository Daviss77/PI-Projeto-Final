package sistema_farmacia;

import lerdados.LerDados;

public class Contas {
   static String remover;
    static void subtrair(){
        Motoboy entrega = new Motoboy();
        TabelaDePreco preco = new TabelaDePreco();
        switch (Contas.remover){
            case "dipirona":
                TabelaDePreco.total -= preco.diPreco;
                entrega.valor = TabelaDePreco.total;
                Salvar.cadastroCliente.remove(Contas.remover);
            break;
            case "omeprazol":
                TabelaDePreco.total -= preco.omPreco;
                entrega.valor = TabelaDePreco.total;
                Salvar.cadastroCliente.remove(Contas.remover);
            break;
            case "dorflex":
                TabelaDePreco.total -= preco.dorPreco;
                entrega.valor = TabelaDePreco.total;
                Salvar.cadastroCliente.remove(Contas.remover);
            
            break;
            case "benegripe":
                TabelaDePreco.total -= preco.benPreco;
                entrega.valor = TabelaDePreco.total;
                Salvar.cadastroCliente.remove(Contas.remover);
            break;
            case "ozempic":
                TabelaDePreco.total -= preco.ozePreco;
                entrega.valor = TabelaDePreco.total;
                Salvar.cadastroCliente.remove(Contas.remover);
            break;
            case "strepsils":
                TabelaDePreco.total -= preco.sprePreco;
                entrega.valor = TabelaDePreco.total;
                Salvar.cadastroCliente.remove(Contas.remover);
            break;
            case "rinosoro":
                TabelaDePreco.total -= preco.rinoPreco;
                entrega.valor = TabelaDePreco.total;
                Salvar.cadastroCliente.remove(Contas.remover);
            break;
            case "cimegripe":
                TabelaDePreco.total -= preco.cimPreco;
                entrega.valor = TabelaDePreco.total;
                Salvar.cadastroCliente.remove(Contas.remover);
            break;
            case "fluoxetina":
                TabelaDePreco.total -= preco.cimPreco;
                entrega.valor = TabelaDePreco.total;
                Salvar.cadastroCliente.remove(Contas.remover);
            break;
            case "prednisona":
                TabelaDePreco.total -= preco.predPreco;
                entrega.valor = TabelaDePreco.total;
                Salvar.cadastroCliente.remove(Contas.remover);
            break;
            case "kit universitario":
                TabelaDePreco.total -= preco.kitPreco;
                entrega.valor = TabelaDePreco.total;
                Salvar.cadastroCliente.remove(Contas.remover);
            default:
                System.out.println("Valor não encontrado");
                break;
        }
    }
}
