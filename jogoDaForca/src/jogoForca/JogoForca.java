package jogoForca;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JogoForca {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Escolhe uma palavra secreta aleatória de um array
        String[] palavras = {"programacao", "renan", "bola", "gato", "java"};
        Random r = new Random();
        int indice = r.nextInt(palavras.length);
        String palavraSecreta = palavras[indice].trim().toUpperCase();

        /* // - Escolher a palavra secreta manualmente
        Scanner scanner = new Scanner(System.in);
        System.out.println("--JOGO DA FORCA--");
        System.out.println("Escolha a palavra secreta: ");
        String palavraSecreta = scanner.nextLine().trim().toUpperCase();*/

        // - Converter String em Array de Char
        char[] arrayDaPalavraSecreta = palavraSecreta.toCharArray();

        // - Criar Array da Palavra Descoberta
        Character[] arrayPalavraDescoberta = new Character[arrayDaPalavraSecreta.length];
        Arrays.fill(arrayPalavraDescoberta, '_');

        // - Chances do jogo
        Integer chances = 6;


        System.out.println("--JOGO DA FORCA--");
        desenhoForca(chances);
        imprimirPalavraDescoberta(arrayPalavraDescoberta);
        System.out.printf("\nVocê tem %d chances", chances);




        boolean controle = true;
        do {
            // - Escolher a letra
            System.out.println("\nChute uma letra: ");
            Character letraEscolhida = scanner.next().trim().toUpperCase().charAt(0);


            if (letrasAchadas(arrayDaPalavraSecreta, letraEscolhida) == 0) {
                chances -= 1;
                System.out.println("-- VOCÊ ERROU --");
                System.out.print("""
                        ｡ﾟ･ (>﹏<) ･ﾟ｡
                        """);
                desenhoForca(chances);
                if (chances == 0) {
                    System.out.println("Você foi enforcado");
                    System.out.println("-- JOGO ACABOU --");
                    System.out.print("""
                        ¯\\_(ツ)_/¯
                    """);
                    controle = false;
                } else {
                    imprimirPalavraDescoberta(arrayPalavraDescoberta);
                    System.out.println("\n Ainda sobrou "+ chances +" chances");
                }

            } else {
                // - Ver se a letra escolhida contem na palavraSecreta
                System.out.printf("-- ACERTOU %d --\n" ,letrasAchadas(arrayDaPalavraSecreta, letraEscolhida));
                System.out.print("""
                        (◕‿◕)♡
                        """);

                // - Inserir a letra na palavra achada
                for (int i = 0; i < arrayDaPalavraSecreta.length; i++) {
                    if (arrayDaPalavraSecreta[i] == letraEscolhida) {
                        arrayPalavraDescoberta[i] = letraEscolhida;
                    }
                }
                desenhoForca(chances);
                imprimirPalavraDescoberta(arrayPalavraDescoberta);

                // - Verifica se ganhou
                controle = verificaSeGanhou(arrayPalavraDescoberta);



            }
        } while (controle);

    }

    public static boolean verificaSeGanhou(Character[] arrayPalavraDescoberta){
        boolean ganhou = false;
        boolean controle = true;
        for (Character a:arrayPalavraDescoberta
        ) {
            if (a == '_') {
                //System.out.println("ainda nao ganhou, continue");
                ganhou = true;
                break;
            }
        }
        if (!ganhou) {
            System.out.println("\n-- VOCÊ GANHOU --");
            System.out.print("""
                        ＼(￣▽￣)／
                        """);
            controle = false;
        }
        return controle;
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

    public static void desenhoForca(Integer contador){
        switch (contador){
            case 5 ->
                    System.out.print("""
            _________________
            |               |
            |               O
            |
            |
            """);
            case 4 ->
                    System.out.print("""
            _________________
            |               |
            |               O
            |               |
            |
            """);
            case 3 ->
                    System.out.print("""
            _________________
            |               |
            |               O
            |              /|
            |
            """);
            case 2 ->
                    System.out.print("""
            _________________
            |               |
            |               O
            |              /|\\
            |
            """);
            case 1 ->
                    System.out.print("""
            _________________
            |               |
            |               O
            |              /|\\
            |              /
            """);
            case 0 ->
                    System.out.print("""
            _________________
            |               |
            |             (×﹏×)
            |              /|\\
            |              / \\
            """);
            case 6 ->
                    System.out.print("""
            _________________
            |               |
            |
            |
            |
            """);
        }
    }



}
