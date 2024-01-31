import java.util.Scanner;
public class L32(1) {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number=");
        int n= sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0){
            int r=n%10;
            n=n/10;
            sum=sum*10+r;
        }
        if(sum==temp){
            System.out.println("Enter Number is Palindrome");

        }
        else{
             System.out.println("Enter Number is not  Palindrome");
        }
    }
}
