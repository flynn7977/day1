public class day4 {

   public static void main(String[] args) {

         int a=22;
        int b=25;
         int c=55;
         int d=1;

         if(a>b){
          System.out.println("a is bigger than b");
             if (a>c) {
                 System.out.println("a is bigger than c");
                 

                  if (a>d) {
                System.out.println("a is bigger than d");
                System.out.println("a is largest "+ a);

                 
             } else {
                System.out.println("d is bigger than a");
                System.out.println("d is largest "+ d);
             }


                
             } else {
                 System.out.println("c is bigger than a");
                 System.out.println("c is largest "+ c);

             }

            
          
             }
             else{
                 System.out.println("b is bigger than a");
                 if (b>c) {
                    System.out.println("b is bigger than c");
                    

                      if (b>d) {
                System.out.println("b is bigger than d");
                System.out.println("b is largest "+ b);

                 
             } else {
                System.out.println("d is bigger than a");
                System.out.println("d is largest "+ d);
             }

                    
                 } else {
                    System.out.println("c is bigger than b");
                   
                     if (c>d) {
                System.out.println("c is bigger than d");
                System.out.println("c is largest "+ c);

                 
             } else {
                System.out.println("d is bigger than c");
                System.out.println("d is largest "+ d);
             }
               }
            }
        


         }


        

    }


    //there are total  4  number  find out  how is the largest  number  

    

