public class Fibonacci {
  public static void main(String[] args) {
    int inputNum = Integer.parseInt(args[0]);
    if (inputNum > 46) {
      System.out.println("Bad number entry. Please make sure you enter a natural number <= 46");
      return;
    }
    System.out.println(fib(inputNum));
  }

  public static int fib(int n) { 
    if (n == 0)
      return 0;
    else if (n == 1)
      return 1;
    else
      return fib(n - 1) + fib(n - 2);
  }
}
