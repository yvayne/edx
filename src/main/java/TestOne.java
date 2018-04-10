/**
 * Created by Yuri on 09/04/2018.
 */
public class TestOne {
  public static void main(String[] args) {
    int n = 93;
    double d = 1.27;
    double result = n - d;
    if (result > 0) {
      boolean b = result < 0;
      if (b) {
        System.out.println("This can not be true!");
      }
    } else {
      String s = "wow";
      if (result >= 0) {
        s = "bravo!";
        System.out.println(s);
      } else {
        System.out.println(s);
      }
    }
  }
}
