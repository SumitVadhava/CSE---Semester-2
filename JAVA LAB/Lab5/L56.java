package Lab5;
class Demo{
     static int count=0;
      Demo(){
        count++;
      }
      void printcount(){
        System.out.println(count);
      }
      

}
public class L56{
    public static void main(String []args){
      Demo s1= new Demo();
      Demo s2 = new Demo();
       s1.printcount();
    
    }
}