import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    int max = 0;
    int temp;
    for (int count = 0; count < n ; count++)
       { list[count] = in.nextInt();
       }
    for (int count = 0; count < n-1; count++)
       { if(list[max] > list[count+1])
          { max = max;
          }
         else
          { max = count+1;
          }
       }
    System.out.println(max);
    //Try your code here
  }
}