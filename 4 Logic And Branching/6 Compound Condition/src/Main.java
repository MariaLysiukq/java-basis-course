public class Main {
    public static void main(String[] args) {
        int balance = 1000;
        int amount = 300;
        boolean blocked = false;
        boolean operationAllowed = !blocked && amount >0 && amount <= balance;
        System.out.println(operationAllowed);
    }
}
