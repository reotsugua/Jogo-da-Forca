package jogoForca;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // - Escolher a palavra secreta
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a palavra secreta: ");
        String palavraSecreta = scanner.nextLine().trim().toUpperCase();

        // - Converter String em Array de Char
        char[] arrayDaPalavraSecreta = palavraSecreta.toCharArray();

        // - Criar Array da Palavra Descoberta
        Character[] arrayPalavraDescoberta = new Character[arrayDaPalavraSecreta.length];
        Arrays.fill(arrayPalavraDescoberta, '_');

        // - Chances do jogo
        Integer contador = 6;



        boolean controle = true;
        do {
            // - Escolher a letra
            System.out.println("\nChute uma letra: ");
            Character letraEscolhida = scanner.next().trim().toUpperCase().charAt(0);

            // - Ver se a letra escolhida contem na palavraSecreta
            System.out.println("achei " +letrasAchadas(arrayDaPalavraSecreta, letraEscolhida)+ " letras");

            if (letrasAchadas(arrayDaPalavraSecreta, letraEscolhida) == 0) {
                contador -= 1;
                System.out.println("vc errou");
                if (contador == 0) {
                    System.out.println("jogo acabou");
                    controle = false;
                } else {
                    System.out.println("Lhe sobrou "+contador+" chances");
                }

            } else {
                // - Inserir a letra na palavra achada
                for (int i = 0; i < arrayDaPalavraSecreta.length; i++) {
                    if (arrayDaPalavraSecreta[i] == letraEscolhida) {
                        arrayPalavraDescoberta[i] = letraEscolhida;
                    }
                }
                imprimirPalavraDescoberta(arrayPalavraDescoberta);

                // - Verifica se ganhou
                boolean ganhou = false;
                if (ganhou == false) {
                    for (Character a:arrayPalavraDescoberta
                    ) {
                        if (a == '_') {
                            System.out.println("ainda nao ganhou, continue");
                            break;
                        }
                    }
                } else if (ganhou) {
                    System.out.println("vc ganhou");
                    controle = false;
                }


            }




            // - Imprimo a palavra descoberta
            /*for (Character a:arrayPalavraDescoberta
            ) {
                System.out.print(" "+a+" ");
            }*/




        } while (controle);

    }

    public static void imprimirPalavraDescoberta(Character[] arrayPalavraDescoberta){
        for (Character a:arrayPalavraDescoberta
        ) {
            System.out.print(" "+a+" ");
        }
    }

    public static Integer letrasAchadas(char[] arrayDaPalavraSecreta, Character letraEscolhida){
        Integer letrasAchadas = 0;
        for (Character a:arrayDaPalavraSecreta
        ) {
            if (a == letraEscolhida) {
                letrasAchadas += 1;
            }
        }
        return letrasAchadas;
    }



}
