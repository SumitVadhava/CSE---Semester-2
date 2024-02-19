package Lab6;
import java.util.Scanner;
class Student {
  Scanner sc = new Scanner(System.in);
  int id_no;
  int no_of_subject_registered;
  int subject_code;
  int subject_credits;
  char grade_obtained;
  String subjcet_name;
  int grade_value;
  float credit_sum = 0;
  float Total = 0;
  public Student() {
    System.out.println("Enter Student id_no=");
    id_no = sc.nextInt();
    System.out.println("Enter no_of_subject_registered=");
    no_of_subject_registered = sc.nextInt();
    sc.nextLine();
  }
}

class Spidata extends Student{

    Spidata(){
      super();
      for (int i = 0; i < no_of_subject_registered; i++) {
        System.out.println("Enter" + " " + (i + 1) + " " + "Subject name=");
        subjcet_name = sc.nextLine();
        System.out.println("Enter" + " " + (i + 1) + " " + "Subject Code= ");
        subject_code = sc.nextInt();
        System.out.println("Enter" + " " + (i + 1) + " " + "Subject credit=");
        subject_credits = sc.nextInt();
        credit_sum = credit_sum + subject_credits;
        System.out.println("Enter Grade_obtained by student=");
        grade_obtained = sc.next().charAt(0);
        System.out.println("Enter Grade Value=");
        grade_value = sc.nextInt();
        Total = Total + subject_credits * grade_value;
        sc.nextLine();
      }
  }
  
  
  public void calculate_Spi() {
    float spi = Total / credit_sum;
    System.out.println("Student SPI=" + spi);

  }
}
  public class L61 {  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter how many numbers of student data you entered=");
      int students_num = sc.nextInt();
      Spidata Stu[] = new Spidata[students_num];
      for (int i = 0; i < Stu.length; i++) {
        Stu[i] = new Spidata();
        Stu[i].calculate_Spi();
      }
    
    }
   
}

