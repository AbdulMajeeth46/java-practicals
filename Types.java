public class Types {
  public static void main (String args[]){
    int a = 10;
    double b = 1.4;
    float c = 5.3f;
    long d = 1000;

    double a_to_double = (double)a;
    int b_to_int = (int)b;
    int c_to_int = (int)c;
    byte d_to_byte = (byte)d;

    System.out.println("Original Int : " + a);
    System.out.println("Int to double : " + a_to_double);

    System.out.println("Original double: " + b);
    System.out.println("Double to int: " + b_to_int);

    System.out.println("Original float: " + c);
    System.out.println("Float to int: " + c_to_int);

    System.out.println("Original long: " + d);
    System.out.println("Long to byte: " + d_to_byte);
  }
}

