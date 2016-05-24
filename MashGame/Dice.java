
/**
 * A random number is generated through two die
 */
public class Dice implements RandomNumGen
{
    public Dice()
    {
    }
    public int Generate()//generates a random number with Math.random()
    {
        return ((int)(Math.random()*6+1))+((int)(Math.random()*6+1));
    }
}



