public class Main {
    public static void main(String[] args) {
        System.out.println("Part A: Player");

        Player player1 = new Player("Maria", 100, 50);
        Player player2 = new Player("Lancelot", 20, 10);

        System.out.println("Initial State:");
        System.out.println(player1);
        System.out.println(player2);
        
        System.out.println("\nOperations on Maria:");
        player1.takeDamage(30);
        System.out.println("After takeDamage(30): " + player1);
        player1.heal(15);
        System.out.println("After heal(15): " + player1);
        player1.rest(40);
        System.out.println("After rest(40): " + player1);
        boolean mariaAttack = player1.spendEnergy(150);
        System.out.println("spendEnergy(150) success: " + mariaAttack + " -> " + player1);

        System.out.println("\nOperations on Lancelot:");
        player2.takeDamage(30);
        System.out.println("After takeDamage(30): " + player2);
        player2.heal(50);
        System.out.println("After heal(50) (failed - dead): " + player2);
        player2.rest(30);
        System.out.println("After rest(30) (failed - dead): " + player2);
        boolean lancelotAttack = player2.spendEnergy(5);
        System.out.println("spendEnergy(5) success: " + lancelotAttack + " -> " + player2);

        System.out.println("\nFinal State:");
        System.out.println(player1);
        System.out.println("Maria attack success: " + mariaAttack);
        System.out.println(player2);
        System.out.println("Lancelot attack success: " + lancelotAttack);

        System.out.println("\nPart B: WaterTank");

        WaterTank tank1 = new WaterTank("Tank-Alpha", 100, 20);
        WaterTank tank2 = new WaterTank("Tank-Beta", 50, 50);

        System.out.println("Initial State:");
        System.out.println(tank1);
        System.out.println(tank2);

        System.out.println("\nOperations on Tank-Alpha:");
        System.out.println("fill(90) success: " + tank1.fill(90) + " -> " + tank1);
        System.out.println("fill(30) success: " + tank1.fill(30) + " -> " + tank1);
        System.out.println("drain(60) success: " + tank1.drain(60) + " -> " + tank1);
        System.out.println("drain(10) success: " + tank1.drain(10) + " -> " + tank1);

        System.out.println("\nOperations on Tank-Beta:");
        System.out.println("Is full initially? " + tank2.isFull());
        System.out.println("fill(10) success: " + tank2.fill(10) + " -> " + tank2);
        System.out.println("drain(20) success: " + tank2.drain(20) + " -> " + tank2);
        System.out.println("Is full now? " + tank2.isFull());

        System.out.println("\nFinal State:");
        System.out.println(tank1);
        System.out.println("Tank-Alpha fill(90) success: " + fillA1);
        System.out.println("Tank-Alpha fill(30) success: " + fillA2);
        System.out.println("Tank-Alpha drain(60) success: " + drainA1);
        System.out.println("Tank-Alpha drain(10) success: " + drainA2);

        System.out.println(tank2);
        System.out.println("Tank-Beta was full initially: " + isBFullInit);
        System.out.println("Tank-Beta fill(10) success: " + fillB1);
        System.out.println("Tank-Beta drain(20) success: " + drainB1);
        System.out.println("Tank-Beta is full now: " + isBFullAfter);
    }
}
