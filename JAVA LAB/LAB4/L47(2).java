import java.util.Scanner;
public class L47(2){
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<=3;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=2; i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
   
}


