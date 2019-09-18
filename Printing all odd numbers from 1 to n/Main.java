import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner op = new Scanner(System.in);
      int n = op.nextInt();
      for ( int count = 1; count <= n; count++)
      { if ( count % 2 == 1)
           System.out.println(count);
      }
	     // Type your code here
	}
}