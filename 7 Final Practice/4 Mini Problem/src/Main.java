public class Main {
    public static int countMultiples(int from, int to, int divisor) {
        int count = 0;
        for (int number = from; number <= to; number++)
        {
            if (number % divisor == 0) {
                count += 1;
            }
        }
    return count;
    }
}
