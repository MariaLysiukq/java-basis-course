public class Player
{
    String name;
    int health;
    int energy;

    public Player(String name, int health, int energy)
    {
        this.name = name;
        this.health = health;
        this.energy = energy;
    }

    public void takeDamage(int amount)
    {
        if (amount > 0)
        {
            health -= amount;
            if (health < 0)
            {
                health = 0;
            }
        }
    }

    public void heal(int amount)
    {
        if (amount > 0 && health > 0)
        {
            health += amount;
            if (health > 100)
            {
                health = 100;
            }
        }
    }

    public void rest(int amount)
    {
        if (amount > 0 && health > 0)
        {
            energy += amount;
            if (energy > 100)
            {
                energy = 100;
            }
        }
    }

    public boolean spendEnergy(int amount)
    {
        if (health > 0 && amount > 0 && energy >= amount)
        {
            energy -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Player{name='" + name + "', health=" + health + ", energy=" + energy + "}";
    }
}