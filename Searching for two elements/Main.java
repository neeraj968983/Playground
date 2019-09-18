import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int flag1 = 0;
      int flag2 = 0;
      for (int count = 0; count < arr_size; count++)
         { arr[count] = in.nextInt();
         }
      int search_elem_1 = in.nextInt();
      int search_elem_2 = in.nextInt();
      
      for (int count = 0; count < arr_size; count++)
         { if (arr[count] == search_elem_1)
              {System.out.println(count);
               flag1 = 1;
               break;
              }
         
         }
       for (int count = 0; count < arr_size; count++)
         { if (arr[count] == search_elem_2)
              {System.out.println(count);
               flag2 = 1;
               break;
              }
         }
      if (flag1 == 0)
        System.out.println("-1");
      else if (flag2 == 0)
        System.out.println("-1");
         }
        // Type your code here
    }
