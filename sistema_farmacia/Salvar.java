package sistema_farmacia;
import lerdados.LerDados;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
    System.out.println("Você deseja remover algum remédio do carrinho de compras?\nDigite ( S ) --Para confirmar\nDigite ( N ) --Para cancelar-- ");
    boolean resposta = LerDados.lerSimNao();
    boolean resposta2 = false;
    do{
        if(resposta == true)
        {
            Contas.subtrair();
            
            System.out.println("\nDeseja tirar mais?\nDigite ( S ) --Para confirmar--\nDigite ( N ) --Para cancelar-- " );
                resposta2 = LerDados.lerSimNao();
                if(resposta2 == true)
                {
                    Contas.subtrair();
                } 
                    
        }   
        
    }while(!resposta == false || !resposta2 == false);
 
}

}