public class WaterTank
{
    String id;
    int capacity;
    int volume;

    public WaterTank(String id, int capacity, int volume)
    {
        this.id = id;
        this.capacity = capacity;
        this.volume = volume;
    }

    public boolean fill(int amount)
    {
        if (amount > 0 && volume + amount <= capacity) {
            volume += amount;
            return true;
        }
        return false;
    }

    public boolean drain(int amount)
    {
        if (amount > 0 && volume >= amount) {
            volume -= amount;
            return true;
        }
        return false;
    }

    public boolean isFull()
    {
        return volume == capacity;
    }

    @Override
    public String toString()
    {
        return "WaterTank{id='" + id + "', capacity=" + capacity + ", volume=" + volume + "}";
    }
}