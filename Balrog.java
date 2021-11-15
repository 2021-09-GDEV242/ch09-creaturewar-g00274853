
/**
 * Write a description of class Balrog here.
 *
 * @author Yixuan Sun
 * @version 2021.11.15
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;


    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        // initialise instance variables
       super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int attack()
    {
        int dmg = super.attack();
        dmg = dmg + super.attack();
        return dmg;
    }
}
