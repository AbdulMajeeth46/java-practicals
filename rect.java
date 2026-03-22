import java.util.*;

public class rect {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter length: ");
    int l = scan.nextInt();

    System.out.print("Enter breadth: ");
    int b = scan.nextInt();

    int area = l * b;
    System.out.println("Area = " + area);

    System.out.print("Enter depth: ");
    int d = scan.nextInt();

    int volume = area * d;
    System.out.println("Volume = " + volume);
  }
}