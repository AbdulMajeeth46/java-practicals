import java.util.*;

public class Prime{
  public static void main (String args[]){
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter number: ");
    int n = scan.nextInt();

    int count = 0;

    for(int i = 1; i <= n; i++){
      if(n % i == 0){
        count++;
      }
    }

    if(count == 2){
      System.out.println(n + " is a Prime number");
    } else {
      System.out.println(n + " is not a prime number");
    }
  }
}