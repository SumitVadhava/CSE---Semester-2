import java.util.Scanner;
public class L45 {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String=");
        String str= sc.nextLine();
        int length= str.length();
        System.out.println("String length is="+length);
        for(int i=(length/2);i<length;i++){
            System.out.print(str.charAt(i));
        }
    }
}
