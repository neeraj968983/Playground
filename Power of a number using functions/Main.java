import java.util.Scanner;
class Main{
	public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    powe(base, exponent);
  }
  public static void powe(int a, int b)
  { int count, pro = 1;
    for ( count = 1; count <= b; count++)
     { pro = pro * a;
     }
    System.out.print(pro);
  }
}