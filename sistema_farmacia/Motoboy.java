package sistema_farmacia;

public class Motoboy {
    float valor;
    int frete;
    int tempo;
    float contaTotal;

    public void rotasSul(){
        Motoboy entrega = new Motoboy();
        entrega.valor = TabelaDePreco.total;
        frete = 20;
        tempo = 15;
        contaTotal = entrega.valor + frete;
        String conversaoMB = Float.toString(contaTotal);
        Salvar.cadastroCliente.add(conversaoMB);
        statusEntrega();
    }
    public void rotaNorte(){
        Motoboy entrega = new Motoboy();
        entrega.valor = TabelaDePreco.total;
        frete = 30;
        tempo = 40;
        contaTotal = entrega.valor + frete;
        String conversaoMB = Float.toString(contaTotal);
        Salvar.cadastroCliente.add(conversaoMB);
        statusEntrega();
    }
    public void rotaLeste(){
        Motoboy entrega = new Motoboy();
        entrega.valor = TabelaDePreco.total;
        frete = 25;
        tempo = 30;
        contaTotal = entrega.valor + frete;
        String conversaoMB = Float.toString(contaTotal);
        Salvar.cadastroCliente.add(conversaoMB);
        statusEntrega();
    }
    public void rotaOeste(){
        Motoboy entrega = new Motoboy();
        entrega.valor = TabelaDePreco.total;
        frete = 35;
        tempo = 60;
        contaTotal = entrega.valor + frete;
        String conversaoMB = Float.toString(contaTotal);
        Salvar.cadastroCliente.add(conversaoMB);
        statusEntrega();
    }
    public void rotaCentro(){
        Motoboy entrega = new Motoboy();
        entrega.valor = TabelaDePreco.total;
        frete = 35;
        tempo = 25;
        contaTotal = entrega.valor + frete;
        String conversaoMB = Float.toString(contaTotal);
        Salvar.cadastroCliente.add(conversaoMB);
        statusEntrega();
    }
    public void statusEntrega(){
        System.out.println(" ESTIMATIVA DE ENTREGA PARA REGIÃO É DE ( " + this.tempo + " MINUTOS ).\n");
        System.out.println(" FRETE PARA REGIÃO ( " + this.frete + " REAIS ).\n");
        System.out.println(" O VALOR TOTAL DA COMPRA FOI DE ( " + this.contaTotal + " REAIS. )");
    }
}
