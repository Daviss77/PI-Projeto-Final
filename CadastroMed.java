import java.util.Scanner;

public class CadastroMed {
    
    // Definição da estrutura para armazenar os dados do usuário
    static class Usuario {
        String nomeCompleto;
        String dataNascimento;
        String endereco;
        String cpf;
        String email;
        String telefone;
    }
    // Definição da estrutura para armazenar os dados de um medicamento
    static class Medicamento {
        String dipirona;
        String omeprazol;
        String dorflex;
        String benegrip;
        String ozempic;
        String sprepsils;
        String rinosoro;
        String cimegripe;
        String fluoxetina;
        String prednisona;
    }
    static class KitUniversitario{
        String chocolate;
        String dorflex;
        String remedioRelaxante;
        String remedioBarriga;
        String bala;
    }

    static class TabelaDePreco{
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
    }

    static class Informacoes {
        String dipInf = "Cartela de 10 comprimidos.\nModo de uso: Via oral, a cada 8 horas.\nTarja: Amarela.\n500 Mg.\nGenérico do Dipirona: Novalgina.";
        String omInf = "28Comprimidos\nVia oral.\nTarja vermelha (venda sobre prescrição medica)\n1x ao dia em jejum\n20 Mg ";
        String dorInf = "10Comprimidos\nVia oral\nNão inclui tarja (isento de prescrição medica)\n1 a 2 comprimidos, 3 a 4x ao dia.\n300 Mg.";
        String benInf = "teste";
        String ozeInf = "teste";
        String spreInf = "teste";
        String rinoInf = "teste";
        String cimInf = "teste";
        String fluoInf = "teste";
        String predInf = "teste";
        String kitInf = "teste";
        
    }
    
    // Função para cadastrar um novo usuário
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
        System.out.println("Correto! Pode continuar\n");
        
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
    
    static TabelaDePreco dadosRemedios(){
        TabelaDePreco tabela = new TabelaDePreco();
        System.out.println("---- TABELA DE PREÇO ----\n\nDipirona: R$ " + tabela.diPreco + "\nOmeprazol: R$ "+ tabela.omPreco + "\nDorflex: R$ "+ tabela.dorPreco + "\nBenegripe: R$ " +tabela.benPreco + "\nOzempic: R$ " + tabela.ozePreco + "\nSprepsils: R$ "+ tabela.sprePreco + "\nRinosoro: R$ " + tabela.rinoPreco + "\nCimegripe: R$ " + tabela.cimPreco + "\nFluoxetina: R$ " + tabela.fluoPreco + "\nPrednisona: R$ "+ tabela.predPreco + "\nKit Universitário: R$ " + tabela.kitPreco);
        
        return tabela;
    }
    public static void main(String[] args) {
        // Cadastro de um novo usuário
        cadastrarUsuario();
        System.out.println("\nUSUÁRIO CADASTRADO COM SUCESSO!\n");
        dadosRemedios();

        
    }
}
