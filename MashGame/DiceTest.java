//This is to test if dice actually returns a random number between 2 and 12

public class DiceTest
{
    public static void main (String[] args)
    {
        Dice dice = new Dice();
        for (int i = 0; i<=11; i++)
            System.out.println(dice.Generate());
    }
}

