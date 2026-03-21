import java.util.*;

public class Average {
  public static void main (String args[]){
    Scanner scan = new Scanner(System.in);

    System.out.println("How many numbers : ");
    int n = scan.nextInt();

    int sum = 0;
    int min = 0;
    int max = 0;

    for(int i = 1; i <= n; i++){
      System.out.println("Enter number " + i + ":");
      int num = scan.nextInt();

      sum = sum + num;

      if(i == 1){
        min = num;
        max = num;
      } else {
        if (num < min){
          min = num;
        }
        if (num > max){
          max = num;
        }
      }
    }

    System.out.println("1 - Sum");
    System.out.println("2 - Average");
    System.out.println("3 - Min");
    System.out.println("4 - Max");
    
    System.out.println("Enter your choice : ");
    int choice = scan.nextInt();


    switch(choice){
      case 1:
        System.out.println("Sum is " + sum);
        break;

        case 2: 
        System.out.println("Average is :" + ((double)sum/n));
        break;

        case 3:
          System.out.println("Minimum is : " + min);
          break;

        case 4:
          System.out.println("Maximum is : " + max);
          break;

        default:
          System.out.println("invalid choice");
    }

  }

}

