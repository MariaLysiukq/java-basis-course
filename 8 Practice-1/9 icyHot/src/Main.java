public class Main {
    public boolean icyHot(int temp1, int temp2) {
        if (temp1 >= 0 || temp2 <= 100)
        {
            if (temp1 <= 100)
            {
                return false;
            }
            return temp2 < 0;
        }
        else
        {
            return true;
        }
    }
}
