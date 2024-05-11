package sistema_farmacia;

import lerdados.LerDados;

// arrayList para medicamentos para arquivo txt.
public class InteracaoCompra{
    
static InteracaoCompra confirmacao(){
    TabelaDePreco preco = new TabelaDePreco();
    Motoboy entrega = new Motoboy();
    InteracaoCompra sim = new InteracaoCompra();

        System.out.println("Para confirmar a compra digite ( S ), Caso contrário ( N )");
        String respostaCliente = LerDados.lerTexto();
        respostaCliente = respostaCliente.toLowerCase();
            if(respostaCliente.equals("s")){
                entrega.valor += preco.diPreco;
                System.out.println("Compra adicionada ao carrinho:\n " + entrega.valor);
            }else{
                System.out.println("Compra cancelada");
            }
            return sim;
    } 

    
}