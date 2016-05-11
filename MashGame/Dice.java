
/**
 * Write a description of class Dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dice
{
    public Dice()
    {
    }
    public int Generate(){
        return ((int)Math.random()*6+1)+((int)Math.random()*6+1);
    }
}
