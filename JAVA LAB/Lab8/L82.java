import java.util.Scanner;
class NagativeException extends Exception {
    public NagativeException(String msg) {
        super("error msg");
    }
}

class Numberisdivisiblebyten extends Exception {
    public Numberisdivisiblebyten(String msg) {
        super("error msg");
    }
}

class Numberisgrathan100andlessthan2000 extends Exception {
    public Numberisgrathan100andlessthan2000(String msg) { 
        super("error msg");
    }
}

class Numberisgraterthan7000 extends Exception {
    public Numberisgraterthan7000(String msg) {
        super("error msg");
    }
}

public class L82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers sum you want=");
        int n = sc.nextInt();
        double sum = 0;
        double num;
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the number=");
                num = sc.nextInt();
                if (num < 0) {
                    throw new NagativeException("Number is nagative");
                }
                if (num % 10 == 0) {
                    throw new Numberisdivisiblebyten("Number is divisible by 10");

                }
                if (num > 1000 && num < 2000) {
                    throw new Numberisgrathan100andlessthan2000("Number is Grater than 1000 and less than 2000");

                }
                if (num > 7000) {
                    throw new Numberisgraterthan7000("Number is grater than 7000");

                }
                sum = sum + num;
            }

            System.out.println("Final Sum is:" + sum);
        } catch (NagativeException e) {
            e.printStackTrace();
            // or e.getMeassage() for only meassage.
        } catch (Numberisdivisiblebyten e) {
            e.printStackTrace();
            // or e.getMeassage() for only meassage.
        } catch (Numberisgrathan100andlessthan2000 e) {
            e.printStackTrace();

        } catch (Numberisgraterthan7000 e) {
            e.printStackTrace();

        } catch(Exception e){
            System.out.println("Please enter vaild input");
        }

    }
}