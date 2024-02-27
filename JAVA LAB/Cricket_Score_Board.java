import java.util.Scanner;
public class Cricket_Score_Board{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Total Match =");
        int n= sc.nextInt(); 
        int Totalruns=0;
        int TotalWhiteBall=0;
        int TotalNoBall=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter Match Number=");
            int n1= sc.nextInt(); 
             System.out.println("Enter Total Over=");
            int over= sc.nextInt();
             int match[][] = new int[over][6]; 
            for(int j=0;j<over;j++){
                System.out.println("Enter Over num=");
                int overnum= sc.nextInt();
            for(int k=0;k<6;k++){
                System.out.println("What you want for overnum = "+overnum +"  and Ball Number"+" " +(k+1));
                System.out.println(" 1 for Add Runs/ 2 for Add White Ball/ 3 for Add No Ball");
                System.out.print("Enter your choice: ");
                int choice= sc.nextInt();
                if(choice==1){
                    System.out.print("Enter run=");
                    match[j][k]= sc.nextInt();
                    Totalruns+=match[j][k];
                }
                else if(choice==2){
                    TotalWhiteBall++;
                }
                else if(choice==3){
                    TotalNoBall++;

                }
                else{
                    System.out.println("Error!(Invaild Input)");
                    break;
                
        }
    }
            System.out.println("Match No"+n1+"score:-");
            System.out.println("Total Runs="+Totalruns);
            System.out.println("Total White Ball= "+TotalWhiteBall);
            System.out.println("Total No Ball="+TotalNoBall);
            System.out.println("Total Free Hits="+TotalNoBall);
  }
 }
}
}
