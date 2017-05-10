/**
 * Addison Chen
 * This is programming challenege number 9 called Ackermann's Function that can test how well a computer can perform
 * recursions by using the method called ackermann (m , n).  In this case I called the variable Ackermann as Ack for
 * short.
*/
public class Ackermann {
//calling the variables as integers name Ack, m, and n
public static int Ack(int m, int n) {
  
      //Using if statment to state m=o then returning to n+1 as was stated from the textbook
      if (m == 0) 
      {
       return n + 1;
      }
      
      {
       //Using if statment to state n=0 then returning to ackermann(m-1, 1) as stated from the textbook
       if (n == 0) 
      {
       return Ack(m - 1, 1);
      } 
       //I personally added in Otherwise if n=1 then return to 2
       else if (n == 1) 
      {
        return 2;
      } 
       //otherwise return ackermann(m-1, ackermann(m, n-1) as stated from the textbook
       else 
      {
        return Ack(m - 1, Ack(m, n - 1));
       }
      }
     }

     public static void main(String args[]) {
      System.out.println(Ack(3, 2));
      //Test this ackermann code using = ackermann(0,0) ackermann(0,1) ackermann(1,1) ackermann(1,2) ackermann(1,3) 
      //ackermann(2,2) ackermann(3,2)
     }
    }
