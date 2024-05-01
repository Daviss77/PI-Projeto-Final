package sistema_farmacia;
import java.util.Scanner;

public class Usuario{
    String nomeCompleto;
    String dataNascimento;
    String endereco;
    String cpf;
    String email;
    String telefone;

    // Método interação Usuário
     static Usuario cadastrarUsuario() {
        Scanner scanner = new Scanner(System.in);

        Usuario novoUsuario = new Usuario();

        boolean entradaInvalida = false;
        boolean entradaInvalida2 = false;
        
        System.out.println("Cadastro de Usuário:");
        System.out.print("Nome completo: ");
        novoUsuario.nomeCompleto = scanner.nextLine();

        System.out.print("Data de nascimento: ");
        novoUsuario.dataNascimento = scanner.nextLine();
        
        while(!entradaInvalida){
            System.out.print("CPF: ");
            novoUsuario.cpf = scanner.nextLine();
            try{
               long validador = Long.parseLong(novoUsuario.cpf);
                entradaInvalida = true;
            }catch (NumberFormatException erro ){
                    System.out.println("Erro digite! Digite números inteiros");
            }
        }
        System.out.println("Correto! Pode continuar");
        
        System.out.print("Endereço: ");
        novoUsuario.endereco = scanner.nextLine();
        
        
        System.out.print("E-mail: ");
        novoUsuario.email = scanner.nextLine();

        while(!entradaInvalida2){
            System.out.print("Telefone: ");
            novoUsuario.telefone = scanner.nextLine();
            try{
               long validador = Long.parseLong(novoUsuario.telefone);
                entradaInvalida2 = true;
            }catch (NumberFormatException erro ){
                    System.out.println("Erro digite! Digite números inteiros");
            }
        }
        return novoUsuario;
    }
}