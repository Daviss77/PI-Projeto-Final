package sistema_farmacia;

import lerdados.LerDados;

public class Validacao {

    protected static Validacao confirmaDipirona()
    {
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        boolean respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( N ) para cancelar."); 
        respostaCliente = LerDados.lerSimNao();
        
            if(respostaCliente == true)
            {
                entrega.valor = preco.diPreco;
                preco.total += entrega.valor;
                System.out.print("Compra adicionada ao carrinho! " + entrega.valor);
            }
            if(respostaCliente == false)
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaRinosoro()
    {
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        boolean respostaCliente;
        Validacao d = new Validacao();
        System.out.println("\nConfirma compra? Digite ( S ) para sim ou ( N ) para cancelar."); 
         respostaCliente = LerDados.lerSimNao();
            if(respostaCliente == true)
            {
                entrega.valor = preco.rinoPreco;
                preco.total += entrega.valor;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente == false)
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaDorflex(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        boolean respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( N ) para cancelar."); 
         respostaCliente = LerDados.lerSimNao();
            if(respostaCliente == true)
            {
                entrega.valor = preco.dorPreco;
                preco.total += entrega.valor;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente == false)
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaOmeprazol(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        boolean respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( N ) para cancelar."); 
         respostaCliente = LerDados.lerSimNao();
            if(respostaCliente == true)
            {
                entrega.valor = preco.omPreco;
                preco.total += entrega.valor;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente == false)
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaBenegripe(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        boolean respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( N ) para cancelar."); 
         respostaCliente = LerDados.lerSimNao();
            if(respostaCliente == true)
            {
                entrega.valor = preco.benPreco;
                preco.total += entrega.valor;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente == false)
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaOzempic(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        boolean respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( N ) para cancelar."); 
         respostaCliente = LerDados.lerSimNao();
            if(respostaCliente == true)
            {
                entrega.valor = preco.ozePreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente == false)
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaStrepsils(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        boolean respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( N ) para cancelar."); 
         respostaCliente = LerDados.lerSimNao();
            if(respostaCliente == true)
            {
                entrega.valor = preco.sprePreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente == false)
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaCimegripe(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        boolean respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( N ) para cancelar."); 
         respostaCliente = LerDados.lerSimNao();
            if(respostaCliente == true)
            {
                entrega.valor = preco.cimPreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente == false)
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaPrednisona(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        boolean respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( N ) para cancelar."); 
         respostaCliente = LerDados.lerSimNao();
            if(respostaCliente == true)
            {
                entrega.valor = preco.predPreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente == false)
            {
                System.out.println("Compra cancelada");
            }
    return d;
    }

    protected static Validacao confirmaFluoxetina(){
        TabelaDePreco preco = new TabelaDePreco();
        Motoboy entrega = new Motoboy();
        boolean respostaCliente;
        Validacao d = new Validacao();
        System.out.println("Confirma compra? Digite ( S ) para sim ou ( N ) para cancelar."); 
         respostaCliente = LerDados.lerSimNao();
            if(respostaCliente == true)
            {
                entrega.valor = preco.fluoPreco;
                System.out.println("Compra adicionada ao carrinho! " + entrega.valor);            
            }
            if(respostaCliente == false)
            {
                System.out.println("Compra cancelada");
            }
            return d;
        }

        protected static Validacao receita(){
            Validacao r  = new Validacao();
            System.out.println("\nVocê tem receita?\nDigite ( 1 ) Caso Tenha\nDigite ( 2 ) Se não\nDigite ( 3 ) Para Retornar ao menu");
            int valida = LerDados.lerInt();
                if( valida == 1)
                {
                    Validacao.confirmaOmeprazol();
                }
                else if(valida == 2)
                {
                    System.out.println("Infelizmente a compra do remédio não pode ser realizada sem receita.");
                }
                else if( valida == 3)
                {
                    TabelaDePreco.dadosDePreco();
                }
                else
                {
                    System.out.println("Opção Inválida");
                }
                return r;

        }

}