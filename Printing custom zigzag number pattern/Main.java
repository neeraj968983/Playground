import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int n = 1;
      for (int row = 1; row <= num; row++)
         {for (int col = 1; col <= num; col++)
            {if (row % 2 == 1)
               {if (col == num)
                   {System.out.print(++n);
                    --n;
                   }
                else 
                  System.out.print(n);
               }
              
              if(row % 2 ==0)
                { if(col >= 2)
                     System.out.print(row);
                   else
                     System.out.print(row+1);
                  
                }
               
            }++n;
          System.out.print("\n");
         }
	   // Type your code here
	}
}