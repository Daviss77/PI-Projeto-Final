package sistema_farmacia;

import lerdados.LerDados;
import java.util.ArrayList;

public class Feedback { 
    public static void feedbacks() {
        ArrayList<String> avaliacoes = new ArrayList<String>();

        System.out.println("Agradecemos por efetuar a sua compra! \n");

        System.out.println("Para que a gente possa melhorar o nosso atendimento, gostaríamos muito de saber sobre a sua experiência com nosso atendimento. Classifique abaixo o seu nível de satisfação. \n\n=)--- NÍVEIS DE SATISFAÇÃO ---(=\n\n Muito ruim\n Ruim\n Regular\n Bom\n Muito bom\n");
        String classificacao = LerDados.lerTexto();

        String pergunta1, pergunta2, pergunta3, pergunta4, pergunta5;
        switch(classificacao) {

            case "Muito ruim":
                System.out.println("Você classificou nosso atendimento como: Muito Ruim :("); 
                System.out.println("Gostaria de contribuir com alguma sugestão de melhora? (S/N)");
                pergunta1 = LerDados.lerTexto();

                if(pergunta1.equals("S") || pergunta1.equals("s")) {
                    System.out.println("Como poderíamos melhorar o nosso atendimento? (responda com no máximo 200 caracteres) ");
                    String avaliacaoMr = LerDados.lerTexto();

                    while(avaliacaoMr.length() > 200) {
                        System.out.println("A sugestão ultrapassou 200 caracteres. Tente novamente, por favor: ");
                        avaliacaoMr = LerDados.lerTexto();
                    }

                    avaliacoes.add(avaliacaoMr);
                }
                else if(pergunta1.equals("N") || pergunta1.equals("n")) {
                    System.out.println("Entendido, agradecemos pela atenção!");
                }
                break;

            case "Ruim":
                System.out.println("Você classificou nosso atendimento como: Ruim :("); 
                System.out.println("\n\n Gostaria de contribuir com alguma sugestão de melhora? (S/N)");
                pergunta2 = LerDados.lerTexto();

                if(pergunta2.equals("S") || pergunta2.equals("s")) {
                    System.out.println("Como poderíamos melhorar nosso atendimento? (responda com no máximo 200 caracteres) ");
                    String avaliacaoRuim = LerDados.lerTexto();

                    while(avaliacaoRuim.length() > 200) {
                        System.out.println("A sugestão ultrapassou 200 caracteres. Tente novamente, por favor: ");
                        avaliacaoRuim = LerDados.lerTexto();
                    }

                    avaliacoes.add(avaliacaoRuim);
                }
                break;

            case "Regular":
                System.out.println("Você classificou nosso atendimento como: Regular :/"); 
                System.out.println("Gostaria de indicar os pontos que devemos melhorar? (S/N)");
                pergunta3 = LerDados.lerTexto();

                if(pergunta3.equals("S") || pergunta3.equals("s")) {
                    System.out.println("Perfeito! Como poderíamos melhorar o nosso atendimento? (responda com no máximo 200 caracteres) ");
                    String avaliacaoRegular = LerDados.lerTexto();

                    while(avaliacaoRegular.length() > 200) {
                        System.out.println("A sugestão ultrapassou 200 caracteres. Tente novamente, por favor: ");
                        avaliacaoRegular = LerDados.lerTexto();
                    }
                    avaliacoes.add(avaliacaoRegular);
                }   
                break;

            case "Bom":
                System.out.println("Você classificou nosso atendimento como: Bom :)");
                System.out.println("Gostaria de informar quais são os pontos que devemos melhorar? (S/N)");
                pergunta4 = LerDados.lerTexto();

                if(pergunta4.equals("S") || pergunta4.equals("s")) {
                    System.out.println("Ótimo! Como poderíamos melhorar nosso atendimento? (responda com no máximo 200 caracteres) ");
                    String avaliacaoBom = LerDados.lerTexto();

                    while(avaliacaoBom.length() > 200) {
                        System.out.println("A sugestão ultrapassou 200 caracteres. Tente novamente, por favor: ");
                        avaliacaoBom = LerDados.lerTexto();
                    }
                    avaliacoes.add(avaliacaoBom);
                }  
                break;

            case "Muito bom": 
                System.out.println("Você classificou nosso atendimento como: Muito Bom ;)");
                System.out.println("Teria alguma recomendação para melhorarmos o nosso atendimento? (S/N)");
                pergunta5 = LerDados.lerTexto();

                if(pergunta5.equals("S") || pergunta5.equals("s")) {
                    System.out.println("Qual seria sua recomendação? (responda com no máximo 200 caracteres) ");
                    String avaliacaoMb = LerDados.lerTexto();

                    while(avaliacaoMb.length() > 200) {
                        System.out.println("A sugestão ultrapassou 200 caracteres. Tente novamente, por favor: ");
                        avaliacaoMb = LerDados.lerTexto();
                    }
                    avaliacoes.add(avaliacaoMb);
                }   
                break;
            default:
             System.out.println("Opção inválida. Por favor, escolha um número entre 1 a 5.");
             break;
        }
        
        System.out.println("Agradecemos pela atenção e permanecemos à disposição!");
    
    }
}


