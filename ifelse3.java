import java.util.Scanner;

public class ifelse3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("enter the  unit ");
        // int unit= sc.nextInt();

        // if (unit <= 100) {

        //     System.out.println("answer ="+ (unit *1));

        
            
        // }

        // else if (unit <=200) {
        //                 System.out.println("answer ="+ (unit *2));



            
        // }
        // else if(unit >=200){
        //                 System.out.println("answer ="+ (unit *3));


        // }
        
        // else {
        //     System.out.println("invalid");
        // }


        // System.out.println("cost price ");
        // int cp= sc.nextInt();

        // System.out.println("selling price ");
        // int sp= sc.nextInt();

        // if (cp<sp) {
        //     System.out.println("motta profit");
            
        // } else if (cp>sp) {

        //     System.out.println("moottta loss");
        // }

        // else {

        //     System.out.println("barabari");
        // }


        System.out.println("enter side a");

    int a=sc.nextInt();

    System.out.println("enter side b");
    int b= sc.nextInt();

    System.out.println("enter side c");
    int c= sc.nextInt();

    if (a+b>c && b+c>a && a+c>b) {

        System.out.println("traingle bolta");
        
    } else {
        System.out.println(" aukat  nhi ");
    }





        


    }
}
        