package sistema_farmacia;

public class InfoRemedios {
        void exibirInformacoes(){
        Medicamento dipirona = new Medicamento();
        dipirona.info= "Genérico do Dipirona: Novalgina";
        dipirona.dosagem = "500mg";
        dipirona.modoDeUSo = "Modo de uso: Via oral, a cada 8 horas.";
        dipirona.corTarja = "Amarela";
        dipirona.quantidade = 10;

        Medicamento rinosoro = new Medicamento();
        rinosoro.info = "•luidificante e descongestionante nasal, sem vasoconstritor. Útil antes das mamadas. Facilita a respiração durante o sono.\n•Anti-séptico nasal. Descongestionante e anti-séptico para nebulização nasal. No tratamento auxiliar das rinites que acompanham gripes e resfriados.\n•Gire a tampa para romper o lacre de segurança. Utilize-a para o fechamento do frasco.";
        rinosoro.dosagem = "Não possue uma dosagem específica ";
        rinosoro.modoDeUSo = "1.Retire a capa protetora do conta-gotas.\n2.Aspire o líquido pressionando a parte superior de borracha do conta-gotas e instile seu conteúdo nas narinas. Evite introduzir o conta-gotas nas narinas.\n3.Para guardar o medicamento, recoloque a tampa de plástico fechando bem o frasco. O frasco deve ser guardado no interior do cartucho. Lavar o conta gotas em água corrente e recolocar na capa protetora. Não usar sabão ou detergente. Evite deixar o conta-gotas no interior do frasco após o uso.";
        
        Medicamento cimegripe = new Medicamento();
        cimegripe.info = "Cimegripe Cloridrato Fenillefrina 4mg + Paracetamol 400mg + Maleato de Clorfeniramina 4mg 20 cápsulas";
        cimegripe.dosagem = "1 cápsula";
        cimegripe.modoDeUSo = "1 cápsula a cada 4 horas.";
        cimegripe.corTarja = "Amarela";
        cimegripe.quantidade = 20;

        Medicamento dorflex = new Medicamento();
        dorflex.info = "Via oral";
        dorflex.dosagem = "300 Mg";
        dorflex.modoDeUSo = "1 a 2 comprimidos, 3 a 4x ao dia.";
        dorflex.corTarja = "Não inclui tarja (isento de prescrição médica)";
        dorflex.quantidade = 10;

        //Prescrição médica
        Medicamento omeprazol = new Medicamento();
        omeprazol.info = "Via oral";
        omeprazol.dosagem = "20 Mg ";
        omeprazol.modoDeUSo = "1x ao dia em jejum";
        omeprazol.corTarja = "Tarja vermelha (venda sobre prescrição médica)";
        omeprazol.quantidade = 28;

        Medicamento benegripe = new Medicamento();
        benegripe.info = "Para gripe, e para resfriado.";
        benegripe.dosagem = "Dipirona Monoidratada 500 Mg - Maleto de Clorfeniramina 2Mg - Cafeina 30Mg.";
        benegripe.modoDeUSo = "Via oral, tomar 2 comprimidos (1 amarelo + 1 branco) a cada 8 horas.";
        benegripe.corTarja = "Não possui, venda livre";
        benegripe.quantidade = 20;

        //Prescrição médica
        Medicamento ozempic = new Medicamento();
        ozempic.info = "Diminui o açúcar no sangue (Para diabéticos tipo 2).";
        ozempic.dosagem = "Cada mL de solução injetável contém 1,34 mg de semaglutida. Excipientes: fosfato de sódio dibásico di-hidratado, propilenoglicol, fenol, ácido clorídrico (ajuste de pH), hidróxido de sódio (ajuste de pH) e água para injetáveis. Um sistema de aplicação preenchido contém 4 mg de semaglutida em 3 mL.";
        ozempic.modoDeUSo = "Injetar uma vez na semana durante 4 semanas.";
        ozempic.corTarja = "Tarja vermelha (Necessita de prescrição médica para ser vendida.";
        ozempic.quantidade = 3;

        Medicamento strepsils = new Medicamento();
        strepsils.info = "Alivio rápido e duradouro para as dores de garganta.";
        strepsils.dosagem = "Cada pastilha contem :Flurbiprofeno 8,75mg. Excipientes da pastilha sabor mel e limão: macrogol 300, hidróxido de potássio, essência de limão, levomentol, glicose, sacarose, mel e água purificada.";
        strepsils.modoDeUSo = "Dissolver uma pastilha lentamente na boca a cada, a cada 3-6 Horas conforme a necessidade, máximo 5 pastilhas em 24h. (Recomenda-se não usar por mais de 3 dias).";
        strepsils.corTarja = "Não possui";
        strepsils.quantidade = 16;

        //Prescrição médica
        Medicamento prednisona = new Medicamento();
        prednisona.info = "A recomendação de quantos comprimidos por dia fica sobre conduta médica.";
        prednisona.dosagem = "20 mg.";
        prednisona.modoDeUSo = "Via oral, a recomendação de quantos comprimidos por dia fica sobre conduta médica.";
        prednisona.corTarja = "Tarja vermelha (Venda sob prescrição médica).";
        prednisona.quantidade = 10;

        //Prescrição médica
        Medicamento fluoxetina = new Medicamento();
        fluoxetina.info = "Via oral.";
        fluoxetina.dosagem = "20 mg";
        fluoxetina.modoDeUSo = "A recomendação de quantos comprimidos por dia fica sobre conduta médica.";
        fluoxetina.corTarja = "Tarja vermelha (Venda sob prescrição médica).";
        fluoxetina.quantidade = 30;
        
}
}