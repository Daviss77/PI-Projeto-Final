package sistema_farmacia;

public class Motoboy {
    String entro;
    float valor;
    int frete;
    int tempo;
    float contaTotal;

    public Motoboy rotasSul(){
        Motoboy entrega = new Motoboy();
        entrega.valor = valor;
        frete = 20;
        tempo = 15;
        contaTotal = valor + frete;
        statusEntrega();
        return entrega;
    }
    public void rotaNorte(){
        Motoboy entrega = new Motoboy();
        entrega.valor = valor;
        frete = 30;
        tempo = 40;
        contaTotal = valor + frete;
        statusEntrega();
    }
    public void rotaLeste(){
        Motoboy entrega = new Motoboy();
        entrega.valor = valor;
        frete = 25;
        tempo = 30;
        contaTotal = valor + frete;
        statusEntrega();
    }
    public void rotaOeste(){
        Motoboy entrega = new Motoboy();
        entrega.valor = valor;
        frete = 35;
        tempo = 60;
        contaTotal = valor + frete;
        statusEntrega();
    }
    public void rotaCentro(){
        Motoboy entrega = new Motoboy();
        entrega.valor = valor;
        frete = 35;
        tempo = 25;
        contaTotal = valor + frete;
        statusEntrega();
    }
    public void statusEntrega(){
        System.out.println("Estimativa de entrega para região " + this.tempo + " minutos;");
        System.out.println("Frete para região " + this.frete + " reais.");
        System.out.println("O valor total da compra foi de " + this.contaTotal + " reais.");
    }
}
