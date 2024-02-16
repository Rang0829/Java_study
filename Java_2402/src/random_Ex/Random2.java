package random_Ex;

  public class Random2 {
    public static void main(String[] args) {

    int num = 0;

    for (int i = 1; i <= 10; i++) {
      System.out.println((int)(Math.random()*10)+1);
      // 0 <= x < 11 (0~10)
    }
  }
}