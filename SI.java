import java.util.*;
public class SI {
  public static void main (String args[]){
    Scanner scan = new Scanner (System.in);

    System.out.println("Enter Principal: ");
    float p = scan.nextFloat();

    System.out.println("Enter Rate: ");
    float r = scan.nextFloat();

    System.out.println("Enter Time: ");
    float t = scan.nextFloat();

    float si = (p * r * t) / 100;
    System.out.println("Simple Interest is : " + si);
  }
}