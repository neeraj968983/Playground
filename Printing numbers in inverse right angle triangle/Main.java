import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int row = 1; row <= num; row++)
         {for (int col = 1; col <= (num-row+1); col++)
            {System.out.print(num-row+2-col);
            }
          System.out.print("\n");
         }
	    // Type your code here
	}
}