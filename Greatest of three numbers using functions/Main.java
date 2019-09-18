import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int c = compare(n1,n2);
      if (n3 > c)
        { System.out.println(n3);
        }
      else
        System.out.println(c);
      
    }
   public static int compare(int a, int b)
      {if (a > b)
        { return a;
        }
       else 
         return b;
      }
	    // Type your code here
	}
