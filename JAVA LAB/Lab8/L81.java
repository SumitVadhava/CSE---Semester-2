import java.util.InputMismatchException;
import java.util.Scanner;
public class L81{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        try{
            System.out.println("Enter base number=");
            double a=sc.nextDouble();
            System.out.println("Enter power of the  number=");
            double b=sc.nextDouble();
             double c=a;
             double  ans=1; 
             if(b>=0){
                for(int i=0;i<b;i++){
                    ans=ans*a;
            
                   }
             }
             else{
                for(int i=0;i>b;i--){
                    ans=ans/a;
            
                   }
             }
            System.out.println(ans);
        }
        catch(InputMismatchException e ){
          System.out.println("Enter vaild input");
        }
        catch(NumberFormatException e){
            System.out.println("Enter pure Number");
        }
        catch(ArithmeticException e){
            System.out.println("Power of the base is not zero.please enter vaild base and power input");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter the all inputs");
        }
        catch(Exception e){
            System.out.println("Enter Vaild input");
        }
    }
}