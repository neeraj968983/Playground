import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {Scanner in=new Scanner(System.in);
   int n=in.nextInt();
   int a=n%10;
   n=n/10;
   int b=n%10;
    n=n/10;
   int c=n%10;
    n=n/10;
   int res=((a*100)+(b*10)+c);
   System.out.println(res);
    //Type your code here
  }
}