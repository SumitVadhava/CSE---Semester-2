interface Transpot{
     public void deliver();
}
abstract class Animal {

    
}
class Tigar extends Animal{

}
class Camel extends Animal implements Transpot{
   public void deliver(){
     System.out.println("Camel deliver");
  }
}
class Deer extends Animal{

}
class Donkey extends Animal implements Transpot{   
 public void deliver(){
    System.out.println("Donkey deliver");
    
  }
}
public class L73 {
    public static void main (String []args){
       Animal [] aniamls= {new Tigar(),new Camel(),new Deer(),new Donkey() };

       for(Animal a1:aniamls){
        if(a1 instanceof Transpot){
          Transpot t=(Transpot) a1;
          t.deliver();
        }
       }
     
}
}