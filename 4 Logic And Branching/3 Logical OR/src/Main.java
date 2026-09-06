public class Main {
    public static void main(String[] args) {
        boolean isAdmin = false;
        boolean isOwner = true;
        boolean allowed = isAdmin == true || isOwner == true;
        System.out.println(allowed);
    }
}
