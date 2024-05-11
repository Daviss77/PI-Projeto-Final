package sistema_farmacia;
import java.time.LocalDate;
// Validação data; Valição email.

import lerdados.LerDados;

public class Principal{
    public static void main(String[] args){
    Usuario.cadastrarUsuario();
    System.out.println("\nUSUÁRIO CADASTRADO COM SUCESSO!\n");
    TabelaDePreco.dadosDePreco();
    Interacao.escolha();
    Feedback.feedbacks();
    
}


public static class Usuario{
    String nomeCompleto;
    LocalDate dataNascimento;
    String endereco;
    String cpf;
    String email;
    String telefone;
    
    
    private static Usuario cadastrarUsuario() {
        Usuario novoUsuario = new Usuario();
        boolean entradaInvalida = false;
        boolean entradaInvalida2 = false;
        boolean validarNascimento = false;

        System.out.println("Cadastro de Usuário:");
        System.out.print("Nome completo: ");
        novoUsuario.nomeCompleto = LerDados.lerTexto();

    while(!validarNascimento){
        System.out.print("Data de nascimento: ");
        novoUsuario.dataNascimento = LerDados.lerData();
            if(validarNascimento == false){
                int anoAtual = LocalDate.now().getYear();
                    if(novoUsuario.dataNascimento.getYear() <= anoAtual){
                        validarNascimento = true;
                    }
            }
    }
        while (!entradaInvalida) {
            System.out.print("CPF: ");
            novoUsuario.cpf = LerDados.lerTexto();
    
                if(novoUsuario.cpf.length() == 11){
                try{
                    Long.parseLong(novoUsuario.cpf);
                    entradaInvalida = true;
                }catch (NumberFormatException e){
                    System.out.println("ERRO! digite números inteiros");
                }
            }
            else
                {
                System.out.println("escreva até 11 digitos");
                entradaInvalida = false;
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