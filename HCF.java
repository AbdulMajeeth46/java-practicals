import java.util.*;
public class HCF {
  public static void main (String args[]){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter number 1: ");
    int a = scan.nextInt();

    System.out.println("Enter number 2: ");
    int b = scan.nextInt();

    int hcf = 1;

    for(int i = 1; i <= a && i <=b ; i++){
      if(a % i == 0 && b % i == 0 ){
        hcf = i;
      }
    }
    
    int lcm = (a * b) / hcf;
    System.out.println("HCF: " + hcf);
    System.out.println("LCM: " + lcm);
  }

}