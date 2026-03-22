public class NestedException {
  public static void main(String args[]){
    try {
      int a = 10/1;

      try {
        int arr[] = {1, 2, 3};
        System.out.println(arr[5]);

      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index out of bounds");
      }
    }
    catch(ArithmeticException e){
      System.out.println("Cannot divide by zero");
    }
  }
}