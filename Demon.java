
/**
 * Write a description of class Demon here.
 *
 * @author Yixuan Sun
 * @version 2021.11.14
 */
public class Demon extends Creature 
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Demon(int hp, int str)
    {
        super(hp, str);
    }
    
    public int attack()
    {
        int dmg = super.attack();
        int i = Randomizer.nextInt(20);
        if(i == 20) {
            dmg = dmg + 50;
        }
        return dmg;
    }
}
