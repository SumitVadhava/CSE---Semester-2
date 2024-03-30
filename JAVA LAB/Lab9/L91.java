
//           ----------------- Using Runnable -----------------------------

class Gratings implements Runnable{
    String msg;
    int delay;
    public Gratings(String msg, int delay){
        this.msg=msg;
        this.delay=delay;
    }
    public void run(){
        while(true){
            try{
                System.out.println(msg);
                Thread.sleep(delay);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
public class L91{
    public static void main(String[] args) {
        Runnable r1= new Gratings("Good Morning", 1000);
        Runnable r2= new Gratings("Good Afternoon", 3000);
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}

//   -------------------- Using Thread ------------------------------------


// class Gratings extends Thread{
//     String msg;
//     int delay;
//     public Gratings(String msg, int delay){
//         this.msg=msg;
//         this.delay=delay;
//     }
//     public void run(){
//         while(true){
//             try{
//                 System.out.println(msg);
//                 Thread.sleep(delay);
//             }
//             catch(Exception e){
//                 e.printStackTrace();
//             }
//         }
//     }
    
// }
// public class L91{
//     public static void main(String[] args) {
//         Thread t1= new Gratings("Good Morning", 1000);
//         Thread t2= new Gratings("Good Afternoon", 3000);
//         t1.start();
//         t2.start();
//     }
// }