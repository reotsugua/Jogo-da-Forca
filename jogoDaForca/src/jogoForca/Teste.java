package jogoForca;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){


        boolean controle = true;
        do {
            // - Escolher a palavra secreta
            Scanner scanner = new Scanner(System.in);
            //System.out.println("Escolha a palavra secreta: ");
            //String palavraSecreta = scanner.nextLine().trim().toUpperCase();
            String palavraSecreta = "renan".trim().toUpperCase();


            // - Converter String em Array de Char
            char[] arrayDaPalavraSecreta = palavraSecreta.toCharArray();



            // - Escolher a letra
            System.out.println("Chute uma letra: ");
            Character letraEscolhida = scanner.next().trim().toUpperCase().charAt(0);

            // - Ver se a letra escolhida contem na palavraSecreta
            Integer letrasAchadas = 0;
            for (Character a:arrayDaPalavraSecreta
            ) {
                if (a == letraEscolhida) {
                    letrasAchadas += 1;
                }
            }
            System.out.println("achei " +letrasAchadas+ " letras");

            // - Inserir a letra na palavra achada
            Character[] arrayPalavraAchada = new Character[arrayDaPalavraSecreta.length];
            for (int i = 0; i < arrayDaPalavraSecreta.length; i++) {
                if (arrayDaPalavraSecreta[i] == letraEscolhida) {
                    arrayPalavraAchada[i] = letraEscolhida;
                }
            }

            // - Imprimo a palavra descoberta
            for (Character a:arrayPalavraAchada
            ) {
                System.out.println(a);
            }

        } while (controle);

    }


}
