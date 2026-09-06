public class Main {
    public static int sumEven(int limit) {
        //Використайте змінну суми, цикл та if
        int sum = 0;
        for (int number = 1; number <= limit; number++)
        {
            if (number % 2 == 0)
            {
                sum+=number;
            }
        }
    return sum;
    }
}
