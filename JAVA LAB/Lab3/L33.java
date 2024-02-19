import java.util.Scanner;
public class L33{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n[]= new int[3];
        for(int i=0;i<n.length;i++){
            System.out.println("Enter"+(i+1)+" Number=");
            n[i]= sc.nextInt();
        }
        if(n[1]>n[2]){
            if(n[1]>n[3]){
                System.out.println("Max Number is:"+n[1]);
            }
            else{
               System.out.println("Max Number is:"+n[3]); 
            }

        }
        else{
          if(n[2]>n[3]){
                System.out.println("Max Number is:"+n[2]);
            }  
            else{
                System.out.println("Max Number is:"+n[3]); 
            }
        }
    }
}
