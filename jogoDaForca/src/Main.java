import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Insira uma palavra: ");
        String palavraSecreta = "renan".trim().toUpperCase();
        //String palavraSecreta = scanner.nextLine().trim().toUpperCase();
        char[] palavraArray = palavraSecreta.toCharArray();
        char[] palavraAchada = new char[palavraArray.length];
        Integer contador = 5;



        System.out.println("Insira uma letra");
        char letraInserida = scanner.next().trim().toUpperCase().charAt(0);


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
}
