import java.util.Scanner;
public class L31{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n[]=new int[6];
    int sum=0;
 for(int i=1;i<n.length;i++){
    System.out.println("Enter "+i+" Subject Marks=");
    n[i]=sc.nextInt();
    sum=sum+n[i];
 }
 int result=sum/5;
 if(result>=60){
    System.out.println("First Division");
 }
 else if(result>=50 && result<=59){
    System.out.println("Second Division");
 }
 else if(result>=40 && result<=49){
    System.out.println("Third Division");
 }
 else{
    System.out.println("Fail");
 }

  }
    
}