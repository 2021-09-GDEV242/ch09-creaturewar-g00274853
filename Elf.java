
/**
 * Write a description of class Elf here.
 *
 * @author Yixuan Sun
 * @version 2021.11.14
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    
     /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
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
        int i = Randomizer.nextInt(10);
        if(i == 10) {
            // if the Randomizer generates the number 10 2x damage returned
            dmg = dmg * 2;
        }
        return dmg;
    }
}
