package sistema_farmacia;
import lerdados.LerDados;


public class Principal{
    public static void main(String[] args){
    Usuario.cadastrarUsuario();
    System.out.println("\nUSUÁRIO CADASTRADO COM SUCESSO!\n");
    TabelaDePreco.dadosDePreco();
    Interacao.escolha();
    
}

public static class Usuario{
    String nomeCompleto;
    String dataNascimento;
    String endereco;
    String cpf;
    String email;
    String telefone;
        

    private static Usuario cadastrarUsuario() {

        Usuario novoUsuario = new Usuario();
        boolean entradaInvalida = false;
        boolean entradaInvalida2 = false;
        
        System.out.println("Cadastro de Usuário:");
        System.out.print("Nome completo: ");
        novoUsuario.nomeCompleto = LerDados.lerTexto();

        System.out.print("Data de nascimento: ");
        novoUsuario.dataNascimento = LerDados.lerTexto();
        
        while(!entradaInvalida){
            System.out.print("CPF: ");
            novoUsuario.cpf = LerDados.lerTexto();;
            try{
               Long.parseLong(novoUsuario.cpf);
                entradaInvalida = true;
            }catch (NumberFormatException e){
                    System.out.println("Erro! Digite números inteiros");
            }
        }
        System.out.println("Correto! Pode continuar");
        
        System.out.print("Endereço: ");
        novoUsuario.endereco = LerDados.lerTexto();
        
        
        System.out.print("E-mail: ");
        novoUsuario.email = LerDados.lerTexto();

        while(!entradaInvalida2){
            System.out.print("Telefone: ");
            novoUsuario.telefone = LerDados.lerTexto();
            try{
               Long.parseLong(novoUsuario.telefone);
                entradaInvalida2 = true;
            }catch (NumberFormatException e ){
                    System.out.println("Erro! Digite números inteiros");
            }
        }
        return novoUsuario;
    }
    
}
}