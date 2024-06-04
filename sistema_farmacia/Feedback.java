package sistema_farmacia;

import java.util.ArrayList;

import lerdados.LerDados;


public class Feedback {
    private static ArrayList<String> avaliacoes = new ArrayList<String>();

    public static void feedbacks() {
    
        System.out.println("   AGRADECEMOS POR EFETUAR SUA COMPRA :) ! \n");

        System.out.println("Para que a gente possa melhorar o nosso atendimento, gostaríamos muito de saber sobre a sua experiência com nosso atendimento. Classifique abaixo o seu nível de satisfação. \n\n=)--- NÍVEIS DE SATISFAÇÃO ---(=\n\n Muito ruim\n Ruim\n Regular\n Bom\n Muito bom\n");

        String classificacao = obterClassificacao();

        switch (classificacao) {
            case "muito ruim":
                 sugerirMelhoriaMr();
                 break;
            case "ruim":
                sugerirMelhoriaR();
                break;
            case "regular":
                sugerirMelhoriaRegular();
                break;
            case "bom":
                sugerirMelhoriaB();
                break;
            case "muito bom":
                sugerirMelhoriaMb();
                break;
        }
    }

    private static String obterClassificacao(){
        String classificacao;
        do {
            classificacao = LerDados.lerTexto().toLowerCase();
            if (!validarClassificacao(classificacao)) {
                System.out.println("Opção inválida. Por favor, escolha uma das opções listadas acima:");
            }
        } while (!validarClassificacao(classificacao));
        return classificacao;
    }

    private static boolean validarClassificacao(String classificacao){
        return classificacao.equals("muito ruim") || classificacao.equals("ruim") || classificacao.equals("regular") || classificacao.equals("bom") || classificacao.equals("muito bom");
    }

    private static void sugerirMelhoriaMr(){
        System.out.println("Você classificou nosso atendimento como: Muito Ruim ou Ruim :(\n");
        System.out.println("Gostaria de contribuir com alguma sugestão de melhora? (S/N)");
        boolean resposta = LerDados.lerSimNao();
        if (resposta == true) {
            String sugestao = lerSugestao();
            avaliacoes.add(sugestao);
        }
        if(resposta == false){
            System.out.println("Entendido. Agradecemos pela atenção e pela classificação, permanecemos à disposição!");
        }
    }

    private static void sugerirMelhoriaR(){
        System.out.println("\nVocê classificou nosso atendimento como: Muito Ruim ou Ruim :(\n");
        System.out.println("Gostaria de contribuir com alguma sugestão de melhora? (S/N)");
        boolean resposta = LerDados.lerSimNao();
        if (resposta == true) {
            String sugestao = lerSugestao();
            avaliacoes.add(sugestao);
        }
        else if(resposta == false){
            System.out.println("Entendido. Agradecemos pela atenção e pela classificação, permanecemos à disposição!");
        }
    }

    private static void sugerirMelhoriaRegular(){
        System.out.println("\nVocê classificou nosso atendimento como: Regular :/\n");
        System.out.println("Gostaria de indicar os pontos que devemos melhorar? (S/N)");
        boolean resposta = LerDados.lerSimNao();
        if (resposta == true) {
            String sugestao = lerSugestao();
            avaliacoes.add(sugestao);
        }
        else if(resposta == false){
            System.out.println("Entendido. Agradecemos pela atenção e pela classificação, permanecemos à disposição!");
        }
    }

    private static void sugerirMelhoriaB(){
        System.out.println("\nVocê classificou nosso atendimento como: Bom ou Muito Bom :)\n");
        System.out.println("Teria alguma recomendação para melhorarmos o nosso atendimento? (S/N)");
        boolean resposta = LerDados.lerSimNao();
        
        if (resposta == true) {
            String sugestao = lerSugestao();
            avaliacoes.add(sugestao);
        }
        else if(resposta == false){
            System.out.println("Entendido. Agradecemos pela atenção e pela classificação, permanecemos à disposição!");
        }
    }

    private static void sugerirMelhoriaMb(){
        System.out.println("\nVocê classificou nosso atendimento como: Bom ou Muito Bom :)\n");
        System.out.println("Teria alguma recomendação para melhorarmos o nosso atendimento? (S/N)");
        boolean resposta = LerDados.lerSimNao();

        if (resposta == true) {
            String sugestao = lerSugestao();
            avaliacoes.add(sugestao);
        }
        else if(resposta == false){
            System.out.println("Entendido. Agradecemos pela atenção e pela classificação, permanecemos à disposição!");
        }
    }

    private static String lerSugestao(){
        System.out.println("Como poderíamos melhorar nosso atendimento? (responda com no máximo 200 caracteres) ");
        String sugestao = LerDados.lerTexto();
        while (sugestao.isEmpty() || sugestao.length() > 200) {
            System.out.println("Por favor, forneça uma sugestão válida com no máximo 200 caracteres: ");
            sugestao = LerDados.lerTexto();
        }
        return sugestao;
    }
}







