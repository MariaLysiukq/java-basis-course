public class Main {
    public static boolean canWithdraw(int balance, int amount, boolean blocked) {
        return !blocked && amount > 0 && amount <= balance;
    }
}
