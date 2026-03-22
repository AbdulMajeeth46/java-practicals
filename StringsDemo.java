public class StringsDemo {
  public static void main (String args[]){
    String msg = "   Hello Java World";

    System.out.println("Original String: " + msg);

    System.out.println("Length of String : " + msg.length());
    System.out.println("Uppercase String :" + msg.toUpperCase());
    System.out.println("Lowercase String :" + msg.toLowerCase());
    System.out.println("Substring from index 6: " + msg.substring(6));
    System.out.println("Substring from index 0 to 5: " + msg.substring(0, 5));
    System.out.println("Replace Java with Python: " + msg.replace("Java", "Python"));
    System.out.println("Trim : " + msg.trim());

  }
}