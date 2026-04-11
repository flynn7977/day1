import java.util.Scanner;

public class ifelse2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


          System.out.println("enter the  first  number ");
          int num1 = sc.nextInt();

        System.out.print("enter the  second  number");
          int num2 = sc.nextInt();

        System.out.print("enter the  operator (+,-,*,/): ");
                   char op = sc.next().charAt(0);


                   if (op == '+'){

            System.out.println("Answer = " + (num1 + num2));
                       
                   }
                    else if(op == '-'){
                                System.out.println("Answer = " + (num1 - num2));
                   }

                   else if (op == '*'){
                    System.out.println("Answer = " + (num1 * num2));
                   }
                   else if (op == '/'){

                    System.out.println("Answer = " + (num1 / num2));
                   }
                   else{
                    System.out.println("invalid");
                   }



        



         
    }
}
