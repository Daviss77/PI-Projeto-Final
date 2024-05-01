package sistema_farmacia;
public class Principal{
    public static void main(String[] args){
        
    Usuario.cadastrarUsuario();

    System.out.println("\nUSUÁRIO CADASTRADO COM SUCESSO!\n");

    TabelaDePreco.dadosDePreco();

}
}