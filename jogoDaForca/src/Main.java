import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Insira uma palavra: ");
        String palavraSecreta = "renan".trim().toUpperCase();
        //String palavraSecreta = scanner.nextLine().trim().toUpperCase();
        char[] palavraArray = palavraSecreta.toCharArray();
        char[] palavraAchada = new char[palavraArray.length];

        //char[] palavraAchada = [palavraArray.length];
        /*for (char c: palavraArray
        ) {
            System.out.println(c);}*/

        System.out.println("Insira uma letra");
        char letraInserida = scanner.next().trim().toUpperCase().charAt(0);


        for (int i = 0; i < palavraArray.length; i++) {
            if (((Character) palavraArray[i]).equals(letraInserida)) {
                palavraAchada[i] = letraInserida;
                System.out.println(palavraAchada.toString());
            }



            //System.out.println(((Character) palavraArray[i]).equals(letraInserida));
        }


    }
}
