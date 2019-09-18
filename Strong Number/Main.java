import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int pro = 1, sum = 0, mod; 
      for ( int dup = num; dup > 0; dup = dup/10)
         { mod = dup % 10;
           pro = 1;
           while ( mod > 1)
              {pro = pro * mod;
               mod--;
              }
           sum = sum + pro;
         }
      if(sum == num)
        System.out.println("Yes");
      else
        System.out.println("No");
	    // Type your code here
	}
}