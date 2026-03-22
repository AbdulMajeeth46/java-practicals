class MyException extends Exception {
  MyException(int age) {
    super("Invalid age: " + age);
  }
}

public class MineException {
  public static void main(String args[]) {

    int age = 200;

    try {
      if(age > 150){
        throw new MyException(age);
      }

      System.out.println("Valid age");

    } catch(MyException e){
      System.out.println(e);
    }
  }
}