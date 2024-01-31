import java.util.Scanner;
public class Avg4 {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     float a[]= new float[4];
     float sum=0;
     for(int i=0;i<a.length;i++){
        System.out.println("Enter Number=");
        a[i]=sc.nextInt();
        
        sum=sum+a[i];
     }
     float avg=sum/4;
     System.out.println("Ans="+avg);

    }
}
