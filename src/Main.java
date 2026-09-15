public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Part A: Player");
        Player player1 = new Player("Maria", 100, 50);
        Player player2 = new Player("Lancelot", 20, 10);
        System.out.println("Initial State:");
        System.out.println(player1);
        System.out.println(player2);

        System.out.println("\nOperations on Maria:");
        player1.takeDamage(30);
        player1.heal(15);
        player1.rest(40);
        boolean mariaAttack = player1.spendEnergy(150);

        System.out.println("Operations on Lancelot:");
        player2.takeDamage(30);
        player2.heal(50);
        player2.rest(30);
        boolean lancelotAttack = player2.spendEnergy(5);

        System.out.println("\nFinal State:");
        System.out.println(player1);
        System.out.println("Maria attack success: " + mariaAttack);
        System.out.println(player2);
        System.out.println("Lancelot attack success: " + lancelotAttack);

        System.out.println("\nPart B: WaterTank");
        WaterTank tank1 = new WaterTank("Tank-A", 100, 20);
        WaterTank tank2 = new WaterTank("Tank-B", 50, 50);
        System.out.println("Initial State:");
        System.out.println(tank1);
        System.out.println(tank2);

        System.out.println("\nOperations on Tank-A:");
        boolean fillA1 = tank1.fill(90);
        boolean fillA2 = tank1.fill(30);
        boolean drainA1 = tank1.drain(60);
        boolean drainA2 = tank1.drain(10);
        System.out.println("Operations on Tank-B:");
        boolean isBFullInit = tank2.isFull();
        boolean fillB1 = tank2.fill(10);
        boolean drainB1 = tank2.drain(20);
        boolean isBFullAfter = tank2.isFull();

        System.out.println("\nFinal State:");
        System.out.println(tank1);
        System.out.println("Tank-A fill(90) success: " + fillA1);
        System.out.println("Tank-A fill(30) success: " + fillA2);
        System.out.println("Tank-A drain(60) success: " + drainA1);
        System.out.println(tank2);
        System.out.println("Tank-B was full initially: " + isBFullInit);
        System.out.println("Tank-B fill(10) success: " + fillB1);
        System.out.println("Tank-B is full now: " + isBFullAfter);
    }
}