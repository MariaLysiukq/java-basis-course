public class Main {
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6)
        {
            return true;
        }
        else if (a + b == 6)
        {
            return true;
        }
        else return Math.abs(a - b) == 6;
    }
}
