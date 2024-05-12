package sistema_farmacia;

import lerdados.LerDados;

public class InfoRemedio{
public record Medicamento( 

    String info,
    String dosagem,
    String modoDeUSo,
    String corTarja,
    int    quantidade

) {
 
    static Medicamento dipirona(){
            Medicamento medicamento = new Medicamento( "Genérico do Dipirona: Novalgina",
            "500mg",
            "Via oral, a cada 8 horas.",
            "Amarela",
            10);
            medicamento.status();
            return medicamento;
        }
        static Medicamento rinosoro(){
            Medicamento medicamento = new Medicamento(
                "•luidificante e descongestionante nasal. Facilita a respiração durante o sono.\n•Anti-séptico nasal. Descongestionante e anti-séptico para nebulização nasal.",    
                "Não possue uma dosagem específica ",
                "1.Retire a capa protetora do conta-gotas.\n2.Aspire o líquido pressionando a parte superior de borracha do conta-gotas e instile seu conteúdo nas narinas. Evite introduzir o conta-gotas nas narinas.",
                "",
                300);
                medicamento.status();
                return medicamento;
        }
        static Medicamento dorflex(){
            Medicamento medicamento = new Medicamento(
                "Via oral",
                "300 Mg",
                "1 a 2 comprimidos, 3 a 4x ao dia.",
                "Não inclui tarja (isento de prescrição médica)",
                10);

                medicamento.status();
                return medicamento;
        }

        //Prescrição médica
        static Medicamento omeprazol(){
            Medicamento medicamento = new Medicamento(
                "Via oral",
                "20 Mg ",
                "1x ao dia em jejum",
                "Tarja vermelha (venda sobre prescrição médica)",
                28);
                
                medicamento.status();
                return medicamento;
        }
        static Medicamento benegripe(){
            Medicamento medicamento = new Medicamento(
                "Para gripe, e para resfriado.",
                "Dipirona Monoidratada 500 Mg - Maleto de Clorfeniramina 2Mg - Cafeina 30Mg.",
                "Via oral, tomar 2 comprimidos (1 amarelo + 1 branco) a cada 8 horas.",
                "Não possui, venda livre",
                20);

                medicamento.status();
                return medicamento;

        }
        //Precição médica
        static Medicamento ozempic(){
            Medicamento medicamento = new Medicamento(
                "Diminui o açúcar no sangue (Para diabéticos tipo 2).",
                "Cada mL de solução injetável contém 1,34 mg de semaglutida. Excipientes: fosfato de sódio dibásico di-hidratado, propilenoglicol, fenol, ácido clorídrico (ajuste de pH), hidróxido de sódio (ajuste de pH) e água para injetáveis. Um sistema de aplicação preenchido contém 4 mg de semaglutida em 3 mL.",
                "Injetar uma vez na semana durante 4 semanas.",
                "Tarja vermelha (Necessita de prescrição médica para ser vendida.",
                3);

                medicamento.status();
                return medicamento;
        }
        static Medicamento strepsils(){
            Medicamento medicamento = new Medicamento(
                "Alivio rápido e duradouro para as dores de garganta.",
                "Cada pastilha contem :Flurbiprofeno 8,75mg. Excipientes da pastilha sabor mel e limão: macrogol 300, hidróxido de potássio, essência de limão, levomentol, glicose, sacarose, mel e água purificada.",
                "Dissolver uma pastilha lentamente na boca a cada, a cada 3-6 Horas conforme a necessidade, máximo 5 pastilhas em 24h. (Recomenda-se não usar por mais de 3 dias).",
                "Não possui",
                16);

                medicamento.status();
                return medicamento;
        }
        static Medicamento cimegripe(){
            Medicamento medicamento = new Medicamento(
                "Cimegripe Cloridrato Fenillefrina 4mg + Paracetamol 400mg + Maleato de Clorfeniramina 4mg 20 cápsulas",
                "1 cápsula",
                "1 cápsula a cada 4 horas.",
                "Amarela",
                20);

                medicamento.status();
                return medicamento;
        }
        //Precição médica
        static Medicamento prednisona(){
            Medicamento medicamento = new Medicamento(
                "A recomendação de quantos comprimidos por dia fica sobre conduta médica.",
                "20 mg.",
                "Via oral, a recomendação de quantos comprimidos por dia fica sobre conduta médica.",
                "Tarja vermelha (Venda sob prescrição médica).",
                10);

            medicamento.status();
            return medicamento;
        }
        //Precição médica
        static Medicamento fluoxetina(){
            Medicamento medicamento = new Medicamento(
                "Via oral.",
                "20 mg",
                "A recomendação de quantos comprimidos por dia fica sobre conduta médica.",
                "Tarja vermelha (Venda sob prescrição médica).",
                30);

            medicamento.status();
            return medicamento;
        }
        
        static Medicamento kitUniversitario(){
            Medicamento medicamento = new Medicamento(null, null, null, null, 0);
        System.out.println("O kit vem acompanhado dos seguintes remédios: Dorflex ( para dor de cabeça )\nOmeprazol ( Para dor de barriga )\norfenadrina ( relaxante muscular )\n O Kit vem acompanhado com um chocolate e uma bala halls ou chiclete da sua preferência");
        return medicamento;
    }
    void status(){
        System.out.println("Dosagem do rémedio é: " + this.dosagem());
        System.out.println("Modo de uso: " + this.modoDeUSo());
        System.out.println("Cor da tarja: " + this.corTarja());
        System.out.println("Quantidade " + this.quantidade());
    }
}
}