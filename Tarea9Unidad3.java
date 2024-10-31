import java.util.Scanner;

public class Tarea9Unidad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("write the word to analize:");
        String s = input.nextLine();

        int midWord = s.length() / 2;
        int counterS = 0;



        String firstMid = s.substring(0, midWord);
        String secondMid = s.substring(midWord);

        int countVowelsFirstMid = 0;
        int countVowelsSecondMid = 0;
        int count = 0;

            while ( count < firstMid.length()) {
                char c = Character.toLowerCase(firstMid.charAt(count));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    countVowelsFirstMid++;
                }
                count++;
            }
            count = 0;
            while ( count < secondMid.length()) {
                char c = Character.toLowerCase(secondMid.charAt(count));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o') {
                    countVowelsSecondMid++;
                }
                count++;
            }
        if (countVowelsFirstMid == countVowelsSecondMid) {
            System.out.println("Ambas mitades tienen la misma cantidad de vocales");
        }else{
            System.out.println("No contienen la misma cantidad de vocales");
        }
    }
}