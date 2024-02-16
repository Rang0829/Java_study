package random;

  public class Random_Ex3 {
    public static void main(String[] args) {

    int num = 0;

    for (int i = 1; i <= 10; i++) {
      System.out.println((int)(Math.random()*11)-5);
      // -5 <= x < 6 (-5~5)
    }
  }
}