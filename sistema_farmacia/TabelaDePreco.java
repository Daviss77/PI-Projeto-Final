package sistema_farmacia;
public class TabelaDePreco {
    
    float diPreco =   2.00f;
    float omPreco =   4.00f;
    float dorPreco =  5.00f;
    float benPreco =  5.50f;
    float ozePreco =  3.00f;
    float sprePreco = 4.50f; 
    float rinoPreco = 2.50f;
    float cimPreco =  7.00f;
    float fluoPreco = 6.00f;
    float predPreco = 7.50f;
    float kitPreco =  30.00f;
    
        static TabelaDePreco dadosDePreco(){
        TabelaDePreco tabela = new TabelaDePreco();

        System.out.println("---- TABELA DE PREÇO ----\n\nDipirona: R$ " + tabela.diPreco + "\nOmeprazol: R$ "+ tabela.omPreco + "\nDorflex: R$ "+ tabela.dorPreco + "\nBenegripe: R$ " +tabela.benPreco + "\nOzempic: R$ " + tabela.ozePreco + "\nSprepsils: R$ "+ tabela.sprePreco + "\nRinosoro: R$ " + tabela.rinoPreco + "\nCimegripe: R$ " + tabela.cimPreco + "\nFluoxetina: R$ " + tabela.fluoPreco + "\nPrednisona: R$ "+ tabela.predPreco + "\nKit Universitário: R$ " + tabela.kitPreco);

        return tabela;
    }
}
