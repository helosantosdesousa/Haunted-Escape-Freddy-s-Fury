import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char charComando = 0;
        int menu = 1, venceu=0, jogadas = 0, contJogadas = 0,portaAleatoria=0;

        while (menu == 1) {
            System.out.println(" ");
            System.out.println("Seja bem vindo ao Haunted Escape: Freddy's Fury! =)");
            System.out.println("O que você deseja fazer?");
            System.out.println(" ");
            System.out.println("r - Ler Como jogar");
            System.out.println("h - Ler história");
            System.out.println("c - Iniciar o jogo!");
            charComando = entrada.next().charAt(0);

            //se pedir como jogar
            if (charComando == 'r') {
                System.out.println("============================== COMO JOGAR ======================================");
                System.out.println(" ");
                System.out.println("Se atente as instruções! =)");
                System.out.println(" ");
                System.out.println("1.Você deve fugir da pizzaria antes das 6 A.M. para ganhar o jogo. Se o Freddy te achar Você perde.");
                System.out.println("2.Escolha uma sala para se esconder, as opções são: ");
                System.out.println("          2.0: Sala dos funcionários;");
                System.out.println("          2.1: Cozinha;");
                System.out.println("          2.2: Refeitório;");
                System.out.println("          2.3: Banheiro de clientes;");
                System.out.println("          2.4: Banheiro dos funcionários;");
                System.out.println("          2.5: Atrás do palco;");
                System.out.println("          2.6: Sala dos entulhos;");
                System.out.println("          2.7: Salão das festas;");
                System.out.println("          2.8: Sala do segurança;");
                System.out.println("          2.9: Sala dos arcades;");
                System.out.println(" ");
                System.out.println("3. Sim, a PRIMEIRA sala é a sala nº 0 e a DÉCIMA sala é a sala nº9. Você não está maluco, você só está facilitando a vida da querida dev! =)");
                System.out.println("4. Para terminar a partida e voltar para menu, basta digitar *111*. ");
                System.out.println("5. A cada rodada uma porta de saída é aberta, você deve acertar a porta antes das 6 A.M.");
                System.out.println("6. Assim como você, o Freddy muda de sala a cada jogada.");
                System.out.println("7. Você tem 6 horas para sair da pizzaria");
                System.out.println("8. Uma hora equivale a 3 jogadas. Ou seja, você tem 18 jogadas");
                System.out.println(" ");
                System.out.println("Voltar para o menu? S/N");
                charComando = entrada.next().charAt(0);

                if (charComando == 'n' || charComando == 'N') {
                    menu = 0;
                } else {
                    menu = 1;
                    venceu=1;
                }
            }

            //LER A HISTÓRIA
            if (charComando == 'h' || charComando == 'H') {
                System.out.println("============================== LORE DO GAME ======================================");
                System.out.println(" ");
                System.out.println("Após o fechamento definitivo da Freddy Fazbear's Pizza, um lugar outrora");
                System.out.println("repleto de risos infantis agora estava mergulhado em um silêncio sinistro.");
                System.out.println("Determinado a desvendar os mistérios que envolviam o lugar, o ex-segurança");
                System.out.println("noturno, com o coração acelerado, regressou ao local sombrio. À medida que");
                System.out.println("o relógio se aproximava da meia-noite, uma atmosfera de apreensão pairava no");
                System.out.println("ar, e as lembranças assustadoras começaram a ressurgir. No entanto, à medida");
                System.out.println("que os primeiros minutos do novo dia se estabeleceram, um arrepio percorreu");
                System.out.println("sua espinha ao perceber que as portas enferrujadas haviam se fechado");
                System.out.println("abruptamente. O que era para ser uma busca por respostas transformou-se em");
                System.out.println("uma luta pela sobrevivência. No fundo do corredor mal iluminado, os olhos");
                System.out.println("brilhantes e ameaçadores de Freddy Fazbear pareciam perscrutar sua alma.");
                System.out.println("O segurança, tomado pelo pânico, agora se via numa corrida desesperada");
                System.out.println("contra o tempo, em busca de uma saída para escapar das garras letais de");
                System.out.println("Freddy antes que fosse tarde demais.");
                System.out.println(" ");
                System.out.println("Voltar para o menu? S/N");
                charComando = entrada.next().charAt(0);
                System.out.println("-------------------------------------------------------------------");
                if (charComando == 'n' || charComando == 'N') {
                    menu = 0;
                } else {
                    menu = 1;
                }
            }

            //INICIAR O GAME
            int movimento = 0;


            if (charComando == 'c' || charComando == 'C') {
                System.out.println("============================== COMEÇAR ======================================");
                System.out.println("Iniciando o jogo.....");

                String comodos[] = new String[]{"Sala dos funcionários",
                        "Cozinha",
                        "Refeitório",
                        "Banheiro de clientes",
                        "Banheiro dos funcionários",
                        "Atrás do palco",
                        "Sala dos entulhos",
                        "Salão das festas",
                        "Sala do segurança",
                        "Sala dos arcades"
                };


                jogadas = 0;

                while (jogadas < 18 && menu==1) {
                    Random aleatorio = new Random();
                    int minimo = 0, maximo = 9;

                    if (jogadas==0){
                        //DE ONDE SURGE A PORTA
                        portaAleatoria = aleatorio.nextInt(maximo - minimo) + minimo;
                    }

                    jogadas++;
                    System.out.println(" ");
                    System.out.println("---------------Lista dos cômodos: --------------------");
                    for (int c = 0; c < comodos.length; c++) {
                        System.out.print(c);
                        System.out.println(" " + comodos[c]);
                    }

                    //DE ONDE SURGE O MOB
                    Random random = new Random();
                    int min = 0, max = 9;
                    int numeroAleatorio = random.nextInt(max - min) + min;

                    while (portaAleatoria==numeroAleatorio){
                        numeroAleatorio = random.nextInt(max - min) + min;
                    }

                    //printar o monstro pra ajudar o dev :')
                    //System.out.println("Número aleatório entre " + min + " e " + max + ": " + numeroAleatorio);

                    //printar o monstro pra ajudar o dev :')
                    //System.out.println("Porta aleatória: " + minimo + " e " + maximo + ": " + portaAleatoria);

                    //PLAYER ESCOLHENDO SEU ESCONDERIJO
                    System.out.println("-------------------------");
                    System.out.println("Escolha um cômodo: ");
                    movimento = entrada.nextInt();

                    //VERIFICAR SE O PLAYER TA NO MESMO LUGAR QUE O MOB

                    if (movimento == 111) {
                        System.out.println("Você saiu do jogo.");
                        menu = 0;
                        jogadas--;
                    } else if (movimento > 9 && movimento != 111) {
                        System.out.println("Comando inválido. Por favor insira um número de sala válido.");
                        movimento = entrada.nextInt();
                    } else
                    if (movimento == portaAleatoria) {
                        jogadas--;
                        System.out.println("Você venceu. Deseja jogar novamente? s/n");
                        charComando = entrada.next().charAt(0);
                        venceu = 1;
                        //verificar se quer jogar dnv
                        if (charComando == 's' || charComando == 'S') {
                            menu = 1;
                            jogadas = 0;
                        } else {
                            menu = 0;

                        }
                    } else
                        //nao foi achado
                        if (movimento != numeroAleatorio && movimento != 111 && jogadas<18) {
                            System.out.println(" ");
                            System.out.println("Você não foi achado pelo Freddy =). Escolha outro cômodo " +
                                    "e tente achar a saída o mais rápido possível!");

                            System.out.println("Número de jogadas: " + jogadas);

                            if (jogadas == 3 || jogadas == 6 || jogadas == 9 || jogadas == 12 || jogadas == 15 || jogadas == 18) {
                                System.out.println(" ");
                                System.out.println("┏_______________________________________┑");
                                System.out.println("         HORA: " + ((contJogadas+1)) + " A.M.");
                                System.out.println("┗______________________________________┛");
                                contJogadas++;
                            }


                            venceu = 1;

                        } else if (movimento == numeroAleatorio) {
                            jogadas--;
                            System.out.println("Você morreu.");
                            venceu = 0;
                            menu = 0;

                        }
                    if (jogadas >= 18) {
                        System.out.println("O número máximo de jogadas foi atingido.");
                        venceu = 0;
                        break;
                    }

                }

                while(venceu!=1) {
                    System.out.println("____________________________________________________");
                    System.out.println("*********** MISSÃO FRACASSADA*****************");
                    System.out.println("A noite acabou e você não conseguiu escapar. Deseja jogar novamente? s/n");
                    charComando = entrada.next().charAt(0);
                    if (charComando == 's') {
                        menu = 1;
                        venceu = 1;
                    } else{
                        venceu=1;
                        menu=0;
                    }

                }

                contJogadas=0;
            }
        }
    }
}