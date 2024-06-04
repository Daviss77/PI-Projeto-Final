package sistema_farmacia;
import lerdados.LerDados;
public class Adm {
     static void usuarioAdm(){
        System.out.println("\nDeseja entrar no modo Administrativo?\nDigite ( S ) para Sim\nDigite ( N ) para Não");
        boolean resposta =  LerDados.lerSimNao();
            if(resposta == true){
                login();
            }
            System.out.println("OKAY. Fechando sistema para o próximo cliente................");
    }

    private static void poderAdm(){
        System.out.println("Deseja limpar todas as informações do Arquivo.txt?\nDigite ( S ) para Confirmar\nDigite ( N ) para Não");
        boolean resposta = LerDados.lerSimNao();
            if(resposta == true){
                Salvar.limparArquivo();
            }
            System.out.println("Okay, Por enquanto na função ADM só tem essa função.\nFechando Sistema para o próximo cliente.........");
    }
    private static void login(){
        String usuario1 = "davi_santana";
        String usuario2 = "arthur_portela";
        String usuario3 = "adriel_xavier";
        String usuario4 = "denise_xavier";
        String usuario5 = "luis_rizaro";
        System.out.print("Digite seu nickname:  ");
            String login = LerDados.lerTexto().toLowerCase();
            if(login.equals(usuario1) || login.equals(usuario2) || login.equals(usuario3) || login.equals        (usuario4) || login.equals(usuario5))
            {
                System.out.println("Usuário com permissão para modificações do sistema.");
                System.out.print("\nPor gentileza digite a senha, Você tem apenas -- 3 CHANCES --\n");
                    for(int i = 0; i < 3; i++){
                        System.out.print("\nSENHA: ");
                        int senha = LerDados.lerInt();
                            if(senha == 12209)
                            {
                                System.out.println("Senha Correta! Seja bem vindo " + login +"\n");
                                poderAdm();
                                break;
                            }
                        System.out.println("Senha Incorreta!! Digite novamente" );
                    }
                }
                System.out.print("\n-*** LOGIN NÃO EFETUADO. SAINDO DO MODO ADM ***-\n");
                usuarioAdm();
    }
}
