package sistema_farmacia;
//Dipirona dor de cabeça; Dorflex dor muscular; Risonoro para nariz, Omeprazol dor de barriga, Ozempic diminui o açúcar no sangue, Cimegripe para sinusite, rinite etc; benegrip diminui gripe e resfriado; sprepsils inflamação de garganta, fluxetina serve para disturbios de ansiedade e depressão, prednisona antiflamatorio, 
public class Medicamento {
        String info;
        String dosagem;
        String modoDeUSo;
        String corTarja;
        int    quantidade;

        void status(){
            System.out.println(this.info);
        }
        static class KitUniversitario{
            String dorflex;
            String chocolate;
            String remedioRelaxante;
            String remedioBarriga;
            String bala;
        }
}
        