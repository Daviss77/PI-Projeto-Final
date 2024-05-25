package sistema_farmacia;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Salvar {
    
    static ArrayList <String> cadastroCliente = new ArrayList<String>();
    static String cliente = "C:\\Users\\daviz\\OneDrive\\Documentos\\codigos\\pi\\PI-Projeto-Final\\sistema_farmacia\\CadastroCliente.txt";
    
    
public static void salvandoArray(ArrayList <String> cadastroCliente, String cliente){
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(cliente, true))){
        for(String element : cadastroCliente){
            writer.write(element);
            writer.newLine();
            System.out.println(" Cliente cadastrado com sucesso" + cliente);
        }
    } catch (IOException e) {
        System.out.println("Ocorreu um erro ao salvar o clinte no arquivo: " + e.getMessage());
    }
    
}

}