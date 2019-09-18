import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int a = temp%10;
      int sum;
      int count=0;
      while (temp > 100)
      {temp = temp / 10;
       count++;
      } 
      n=temp%10;
      
      System.out.println(n);
	    // Type your code here
	}
}