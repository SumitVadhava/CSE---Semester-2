
class book{
   private String author_name;
   public book(String author_name){
       this.author_name=author_name;
   }
   public void print(){
       System.out.println("Book_author:"+author_name);
   }
}
class book_publication extends book{
   private String title;
   public book_publication(String author_name,String title){
     super(author_name);
     this.title=title;
   }
   public void print(){
       super.print();
       System.out.println("book_publication:"+title);
   }
}
class paper_publication extends book{
      private String title; 
      public paper_publication(String author_name,String title){
       super(author_name);
       this.title=title;
      }
      public void print(){
       super.print();
       System.out.println("paper_publication:"+title);
      }
}
public class L62_new{
       public static void main(String []args ){
         book b1= new book_publication("Sumit", "classmate publication"); 
         book p1= new paper_publication("Manish","ltc publication");

       }    
}
