package sistema_farmacia;
import lerdados.LerDados;
import java.io.*;
import java.util.ArrayList;

public class Salvar {
    
    static ArrayList <String> cadastroCliente = new ArrayList<String>();
    static String cliente = "C:\\Users\\daviz\\OneDrive\\Documentos\\codigos\\pi\\PI-Projeto-Final\\sistema_farmacia\\CadastroCliente.txt";
    
    
public static void salvandoArray(ArrayList <String> cadastroCliente, String cliente)
{
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(cliente, true)))
    {
        for(String elemento : cadastroCliente)
        {
            writer.write(elemento);
            writer.newLine();
            System.out.println(" Cliente cadastrado com sucesso" + cliente);
        }
    } catch (IOException e)
    {
        System.out.println("Ocorreu um erro ao salvar o clinte no arquivo: " + e.getMessage());
    }
    
}

static void remover(){
    boolean resposta;
    do{
        System.out.println("Você deseja remover algum remédio do carrinho de compras?\nDigite ( S ) --Para confirmar\nDigite ( N ) --Para cancelar-- ");
         resposta = LerDados.lerSimNao();
        if(resposta == true)
        {
            System.out.println("Digite o nome do remédio de qual predente tirar: ");
            Contas.remover = LerDados.lerTexto().toLowerCase();
            Validacao.verificarArray();

            System.out.println("\nDeseja tirar mais?\nDigite ( S ) --Para confirmar--\nDigite ( N ) --Para cancelar-- " );
            resposta = LerDados.lerSimNao();

            if(resposta == true){
                System.out.println("Digite o nome do remédio de qual predente tirar: ");
                Contas.remover = LerDados.lerTexto().toLowerCase();
                Validacao.verificarArray();
        }
        }
           
    }while(!resposta == false);
}
        static void limparArquivo(){
            try 
             {
                PrintWriter writer = new PrintWriter("C:\\Users\\daviz\\OneDrive\\Documentos\\codigos\\pi\\PI-Projeto-Final\\sistema_farmacia\\CadastroCliente.txt");
                writer.close();
                System.out.println("Efetuada a limpeza de arquivo com sucesso.");
            }
            catch (FileNotFoundException e)
            {
                System.err.println("Erro ao limpar o arquivo: " + e.getMessage());
            }
      
    }

}