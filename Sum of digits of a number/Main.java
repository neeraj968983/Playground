import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a;
      int sum = 0;
      while ( n > 0 )
      {a = n % 10;
       n=n/10;
       sum = sum + a; 
      } 
      System.out.println(sum);
	    // Type your code here
	}
}