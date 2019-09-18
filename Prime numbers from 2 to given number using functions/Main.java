import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      prime_no(num);
    }
   public static void prime_no(int nu)
    { int flag = 0;
     for (int count = 2; count <= nu; count++)
        {flag = 0;
         for ( int a = 2; a < count; a++)
           { if (count % a == 0)
               {flag = 1;
                break;
               }
            }
         if (flag == 0)
           System.out.println(count);
        }
    }
        
	    // Type your code here
	
}