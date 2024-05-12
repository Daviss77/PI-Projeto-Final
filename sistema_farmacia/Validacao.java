package sistema_farmacia;

import lerdados.LerDados;

public class Validacao {

    protected static Validacao confirmaDipirona()
    {
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        String respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( X ) para cancelar."); 
        respostaCliente = LerDados.lerTexto().toLowerCase();
        respostaCliente = obterRespostaSouN();
            if(respostaCliente.equals("s"))
            {
                entrega.valor = preco.diPreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);
            }
            if(respostaCliente.equals("n"))
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaRinosoro()
    {
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        String respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( X ) para cancelar."); 
         respostaCliente = LerDados.lerTexto().toLowerCase();
         respostaCliente = obterRespostaSouN();
            if(respostaCliente.equals("s"))
            {
                entrega.valor = preco.rinoPreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente.equals("n"))
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaDorflex(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        String respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( X ) para cancelar."); 
         respostaCliente = LerDados.lerTexto().toLowerCase();
         respostaCliente = obterRespostaSouN();
            if(respostaCliente.equals("s"))
            {
                entrega.valor = preco.dorPreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente.equals("n"))
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaOmeprazol(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        String respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( X ) para cancelar."); 
         respostaCliente = LerDados.lerTexto().toLowerCase();
         respostaCliente = obterRespostaSouN();
            if(respostaCliente.equals("s"))
            {
                entrega.valor = preco.omPreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente.equals("n"))
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaBenegripe(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        String respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( X ) para cancelar."); 
         respostaCliente = LerDados.lerTexto().toLowerCase();
         respostaCliente = obterRespostaSouN();
            if(respostaCliente.equals("s"))
            {
                entrega.valor = preco.benPreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente.equals("n"))
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaOzempic(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        String respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( X ) para cancelar."); 
         respostaCliente = LerDados.lerTexto().toLowerCase();
         respostaCliente = obterRespostaSouN();
            if(respostaCliente.equals("s"))
            {
                entrega.valor = preco.ozePreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente.equals("n"))
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaStrepsils(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        String respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( X ) para cancelar."); 
         respostaCliente = LerDados.lerTexto().toLowerCase();
         respostaCliente = obterRespostaSouN();
            if(respostaCliente.equals("s"))
            {
                entrega.valor = preco.sprePreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente.equals("n"))
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaCimegripe(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        String respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( X ) para cancelar."); 
         respostaCliente = LerDados.lerTexto().toLowerCase();
         respostaCliente = obterRespostaSouN();
            if(respostaCliente.equals("s"))
            {
                entrega.valor = preco.cimPreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente.equals("n"))
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaPrednisona(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        String respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( X ) para cancelar."); 
         respostaCliente = LerDados.lerTexto().toLowerCase();
         respostaCliente = obterRespostaSouN();
            if(respostaCliente.equals("s"))
            {
                entrega.valor = preco.predPreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente.equals("n"))
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaFluoxetina(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        String respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( X ) para cancelar."); 
         respostaCliente = LerDados.lerTexto().toLowerCase();
         respostaCliente = obterRespostaSouN();
            if(respostaCliente.equals("s"))
            {
                entrega.valor = preco.fluoPreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente.equals("n"))
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    private static String obterRespostaSouN()
    {
        String resposta;
            do{
                resposta = LerDados.lerTexto().toLowerCase();
                System.out.println("");
                    if (!validarResposta(resposta))
                    {
                        System.out.println("Opção inválida. Por favor, responda com (s) para sim ou (n) para não: ");
                    }
            }
            while(!validarResposta(resposta));
    return resposta;
    }

    private static boolean validarResposta(String resposta)
    {
        return resposta.equals("s") || resposta.equals("n");
    }
}