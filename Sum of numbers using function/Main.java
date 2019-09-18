import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int sm = sum(num);
      System.out.print(sm);
    }
   public static int sum(int x)
       {int sum = 0;
        while (x > 0)
           {sum = sum + x;
            x=x-1;
           }
        return sum;
       }
	    // Type your code here
	}
