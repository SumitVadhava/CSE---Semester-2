class print_odd_even implements Runnable{
    int check;
      public print_odd_even(int check){
           this.check=check;
      }
      public void run(){
        if(check==1){
        for(int i=1;i<=20;i+=2){
            System.out.println(i);
        }
    }
        else{
            for(int i=2;i<=20;i+=2){
                System.out.println(i);
            }
        }   
        
      }
}
public class L92 {
    public static void main(String [] args){
        Runnable r1= new print_odd_even(1);
        Runnable r2= new print_odd_even(2);
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}
