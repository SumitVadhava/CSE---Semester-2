import java.util.Scanner;
public class L23 {
   public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
   System.out.println("Enter First Number=");
   int n1=sc.nextInt();
   System.out.println("Enter Second Number=");
   int n2=sc.nextInt();
   System.out.println("Enter Operation=");
   char ch=sc.next().charAt(0);
   switch(ch){
    case ('+'):{
        System.out.println("Ans:"+(n1+n2));
        break;
    }
    case ('-'):{
        System.out.println("Ans:"+(n1-n2));
         break;
    }
    case ('*'):{
        System.out.println("Ans:"+((double)n1*n2));
         break;
    }
    case ('/'):{
       System.out.println("Ans:"+((double)n1/n2));
         break;
        
    }
        
    }
   }
}
