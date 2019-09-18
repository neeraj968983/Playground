import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int c = compare(n1,n2);
      int res;
      if (n3 > c)
        {res = c; 
        }
       else 
         res = n3;
       for(res = res; res > 0; res++)
          {if ((n3 % res == 0)&&(c % res == 0))
               {System.out.print(res);
                break;
               }
          }
	    
        
    }
   public static int compare(int a, int b)
      {int res;
       int re = 0;
        if (a > b)
        {res = b; 
        }
       else 
         res = a;
       for(res = res; res > 0; res--)
          {if ((a % res == 0)&&(b % res == 0))
               {re = res;
                break;
               }
          }
       return re;
	    // Type your code here
	}
}