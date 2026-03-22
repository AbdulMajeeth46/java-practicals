import java.util.*;
public class Salary {
  public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Labour");
        System.out.println("2 - Staff");
        int ch = sc.nextInt();

        System.out.print("Salary: ");
        int sal = sc.nextInt();

        if (ch == 1) {
            System.out.print("Hours worked: ");
            int hrs = sc.nextInt();
            System.out.println(sal * hrs);
        } else if (ch == 2) {
            System.out.print("HRA: ");
            int hra = sc.nextInt();
            System.out.print("DA: ");
            int da = sc.nextInt();
            System.out.print("TA: ");
            int ta = sc.nextInt();
            System.out.println(sal + hra + da + ta);
        }
    }
}