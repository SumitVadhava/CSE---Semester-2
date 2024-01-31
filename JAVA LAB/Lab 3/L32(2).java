import java.util.Scanner;

public class L32(2) {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String=");
        String st=sc.next();
        String newst=" ";
        for(int i=st.length()-1;i>=0;i--){
          newst=newst+st.charAt(i);
        }
        if(newst.equals(st)){
            System.out.println("Enter String is palindrome");
        }

        else{
         System.out.println("Enter String is not palindrome");
        }
}
}
