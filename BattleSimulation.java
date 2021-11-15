import java.util.ArrayList;
/**
 * Write a description of class BattleSimulation here.
 *
 * @author Yixuan Sun
 * @version 2021.11.15
 */
public class BattleSimulation
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> armyOne;
    private ArrayList<Creature> armyTwo;
    //Adds the size and index counter for each army
    private int armyOneSize;
    private int armyOneIndex = 0;
    private int armyTwoSize;
    private int armyTwoIndex = 0;
    // Adds the min and max size for each army
    // Army one has a set size of 100 soldier
    private int armyOneMaxSize = 100;
    private int armyOneMinSize = 100;
    // Army two has a set max size of 50 and a set min size of 30
    private int armyTwoMaxSize = 50;
    private int armyTwoMinSize = 30;
    // Initializes the boolean of the fighting method
    private boolean fighting;

    /**
     * Constructor for objects of class BattleSimulation
     */
    public BattleSimulation()
    {
        // initialise instance variables
        armyOne = new ArrayList<Creature>();
        armyTwo = new ArrayList<Creature>();
        // Creates the size of each army
        armyOneSize = Randomizer.nextInt((armyOneMaxSize - armyOneMinSize) + armyOneMinSize);
        armyTwoSize = Randomizer.nextInt((armyTwoMaxSize - armyTwoMinSize) + armyTwoMinSize);
        // Adds each soldier to their given army
        for(int i = 0; i < armyOneSize; i++) {
            armyOne.add(addArmyOne());
        }
        for(int i = 0; i < armyTwoSize; i++) {
            armyTwo.add(addArmyTwo());
        }
        fighting = true;
        fight();
    }

     /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private Creature addArmyOne()
    {
        Creature soldier;
        if(Randomizer.nextInt(10) <=6) {
            //If random number is 1-6 add a human soldier
            soldier = new Human();
        }
        else {
            //If random number is 7-8 or 9-10 add a elf soldier            
            soldier = new Elf();
        }
        return soldier;
    }
    
    private Creature addArmyTwo()
    {
        Creature soldier;
        if(Randomizer.nextInt(25) <= 18) {
            //If random number is 1-18 add a human soldier
            soldier = new Human();
        }
        else if (Randomizer.nextInt(25) <= 24) {
            //If random number is 19-24 add a cyberdemon soldier
            soldier = new CyberDemon();
        }
        else {
            //If random number is 25 add a balrog soldier
            soldier = new Balrog();
        }
        return soldier;
    }
    
    private void fight()
    {
        while(fighting && armyOne.get(0).isAlive() && armyTwo.get(0).isAlive()) {
            armyOne.get(0).takeDamage(armyTwo.get(0).attack());
            armyTwo.get(0).takeDamage(armyOne.get(0).attack());
        
        // if a soldier is knocked out remove them from the array list
        if(armyOne.get(0).isKnockedOut()) {
            armyOne.remove(0);
        }
        if(armyTwo.get(0).isKnockedOut()) {
            armyTwo.remove(0);
        }
        // If any of the armies soldier count gets to 0 or less
        // return fight as false and end the battle simulation and declares a winner
        if(armyOne.size() <= 0) {
            fighting = false;
            System.out.println("The humans and elfs have been DEFEATED!!!");
        }
        if(armyTwo.size() <= 0) {
            fighting = false;
            System.out.println("The humans, Cyberdemons and the massive balrogs have been DEFEATED!!!");
        }
    }
    // Prints out that an army has won
    // Also prints out the size of each army array to show how close the battle was
        System.out.println("A army was declared a winner!!! \nArmy One soldier count: " + armyOne.size() + " " +
        "Army two soldier count: " + armyTwo.size());
    }
}
