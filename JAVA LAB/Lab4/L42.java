import java.util.Scanner;

public class L42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   
        System.out.println("Enter Text=");
        String str=sc.nextLine();
        int consonantcount=0;
       
        int vowelcount=0;
       
        for(int i=0;i<str.length();i++){
          if(str.charAt(i) == 'A'|| str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'E'||str.charAt(i) == 'i'||str.charAt(i) == 'I'||str.charAt(i) == 'o'||str.charAt(i) == 'O'||str.charAt(i) =='u' ||str.charAt(i) == 'U'){
            vowelcount++;
          }
          else if(str.charAt(i)==' '){

          }
          else{
            consonantcount++;
          }

        


    }
    System.out.println("Total Consonants is="+consonantcount);
    System.out.println("Total Vowel is="+vowelcount);
    }
}
