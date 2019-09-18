import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int a = temp%10;
      int sum;
      int count=0;
      int v = 1;
      while (temp > 10)
      {temp = temp / 10;
       count++;
       v = v * 10;
      } 
      n=n/v;
      
      sum=n+a;
      System.out.println(sum);
	    // Type your code here
	}
}