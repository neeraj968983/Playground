import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for( int count = 1; count <=n; ++count)
         { if( n % count == 0)
           { System.out.println(count);
           }
         }
	    // Type your code here
	}
}