import java.util.Scanner;
public class L44 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number that how many number you enter=");
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter Number=");
            a[i]=sc.nextInt();

        }
        for(int i=a.length-1;i>=0;i--){
           System.out.println(a[i]);
            
        }
        }
}
