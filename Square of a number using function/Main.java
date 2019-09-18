import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int sq =  square(num);
      System.out.print(sq);
    }
    public static int square(int x)
       {int sum =0;
        for (int n = 1; n <= x; ++n)
          {sum = sum + x;
          }
         return sum;
       }
	 // Type your code here   
	} 
