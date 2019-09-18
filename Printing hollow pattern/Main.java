import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for ( int row = 1; row <= num; row++)
         {for (int col = 1; col <= num; col++)
            { if ((row == 1)||(row == num))
              System.out.print("*");
              else if ((col == 1)||(col == num))
                System.out.print("*");
              else
                System.out.print(" ");
            }
          System.out.print("\n");
         }
	    // Type your code here
	}
}


