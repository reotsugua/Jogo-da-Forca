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



        boolean controle = true;
        do {
            // - Escolher a letra
            System.out.println("Chute uma letra: ");
            Character letraEscolhida = scanner.next().trim().toUpperCase().charAt(0);

            // - Ver se a letra escolhida contem na palavraSecreta
            System.out.println("achei " +letrasAchadas(arrayDaPalavraSecreta, letraEscolhida)+ " letras");

            // - Inserir a letra na palavra achada
            for (int i = 0; i < arrayDaPalavraSecreta.length; i++) {
                if (arrayDaPalavraSecreta[i] == letraEscolhida) {
                    arrayPalavraDescoberta[i] = letraEscolhida;
                }
            }

            // - Imprimo a palavra descoberta
            for (Character a:arrayPalavraDescoberta
            ) {
                System.out.println(a);
            }



        } while (true);

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