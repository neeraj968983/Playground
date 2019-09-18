import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int big = arr[0];
      for( int count = 0; count < arr_size; count++)
         { arr[count] = in.nextInt();
         }
      for( int count = 0; count < arr_size - 1 ; count++)
         { if(arr[0] > arr[count+1])
            { arr[0] = arr[0];
            }
           else
            {arr[0] = arr[count+1];
            }
          big = arr[0];
         }
      System.out.println(big);
        // Type your code here
    }
}