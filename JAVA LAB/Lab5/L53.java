package Lab5;
import java.util.Scanner;
public class L53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;
        int totala = 0, totale = 0, totali = 0, totalo = 0, totalu = 0;
        while (true) {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            String sentence = scanner.nextLine(); 
            
            if (sentence.equals("quit")) {
                break;
            }

            int countA = 0, countE = 0, countI = 0, countO = 0,countU = 0;
            int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;
            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);
                switch (ch) {
                    case 'A':
                        countA++;
                        totalA++;
                        break;
                    case 'a':
                        counta++;
                        totala++;
                        break;
                    case 'E':
                        countE++;
                        totalE++;
                        break;
                    case 'e':
                        counte++;
                        totale++;
                        break;
                    case 'I':
                        countI++;
                        totalI++;
                        break;
                    case 'i':
                        counti++;
                        totali++;
                        break;
                    case 'O':
                        countO++;
                        totalO++;
                        break;
                    case 'o':
                        counto++;
                        totalo++;
                        break;
                    case 'U':
                        countU++;
                        totalU++;
                        break;
                    case 'u':
                        countu++;
                        totalu++;
                        break;
                }
            }
            
            System.out.println("Count of 'A': " + countA);
            System.out.println("Count of 'E': " + countE);
            System.out.println("Count of 'I': " + countI);
            System.out.println("Count of 'O': " + countO);
            System.out.println("Count of 'U': " + countU);
            System.out.println("Count of 'a': " + counta);
            System.out.println("Count of 'e': " + counte);
            System.out.println("Count of 'i': " + counti);
            System.out.println("Count of 'o': " + counto);
            System.out.println("Count of 'u': " + countu);
          
        }
        
        System.out.println("Total count of 'A': " + totala);
        System.out.println("Total count of 'E': " + totale);
        System.out.println("Total count of 'I': " + totalI);
        System.out.println("Total count of 'O': " + totalO);
        System.out.println("Total count of 'U': " + totalU);

        System.out.println("Total count of 'a': " + totala);
        System.out.println("Total count of 'e': " + totale);
        System.out.println("Total count of 'i': " + totali);
        System.out.println("Total count of 'o': " + totalo);
        System.out.println("Total count of 'u': " + totalu);

        scanner.close();
    }
}
