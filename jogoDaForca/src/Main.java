import java.util.Scanner;

public class Main {
        static Scanner scanner = new Scanner(System.in);
        //System.out.println("Insira uma palavra: ");
        static String palavraSecreta = "renan".trim().toUpperCase();
        //String palavraSecreta = scanner.nextLine().trim().toUpperCase();
        static char[] palavraArray = palavraSecreta.toCharArray();
        static char[] palavraAchada = new char[palavraArray.length];
        static char letraInserida;
        static Integer contador = 2;
        static boolean continuar = true;
        static int numLetraEncontrada = 0;
    public static void main(String[] args) {
        do {
            System.out.println("Jogo da forca");
            System.out.println("_ - _ - _ - _ - _");
            System.out.println("Você tem " + contador + " chances");

            System.out.println("Insira uma letra");
            letraInserida = scanner.next().trim().toUpperCase().charAt(0);



            verificaSeTemLetra();
            inserirLetraEncontra();
            verificaChances();





        } while (continuar);

    }

    public static void verificaSeTemLetra(){
        for (int i = 0; i < palavraArray.length; i++) {
            if (((Character) palavraArray[i]).equals(letraInserida)) {
                numLetraEncontrada += 1;
            }
        }
        System.out.println("Número de letras encontradas: "+numLetraEncontrada);

    }

    public static void inserirLetraEncontra(){
        if (numLetraEncontrada == 0) {
            contador -= 1;
            System.out.println("Lhe sobrou "+contador+" chances");
        } else {

            //Imprimir Array com letras inseridas
            for (int i = 0; i < palavraArray.length; i++) {
                if (((Character) palavraArray[i]).equals(letraInserida)) {
                    palavraAchada[i] = letraInserida;
                }
            }
            for (char a: palavraAchada
            ) {
                System.out.println(a);
            }
        }
        numLetraEncontrada=0;
    }

    public static void verificaChances(){
        if (contador == 0) {
            continuar = false;
            System.out.println("Jogo terminou vc perdeu");
        }

    }

    public static void verificaSeGanhou(){
        boolean vazio;
        for (int i = 0; i < palavraArray.length; i++) {
            if (((Character) palavraArray[i]).equals(null)) {
                vazio = true;
            }else {

                vazio
            }
        }
        if (vazio = false){
            System.out.println("Vc ganhou");
            continuar = false;
        }

    }


}
