
/**
 * Write a description of class Yahtzee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Yahtzee 
{
    private Die6 die;
    private Die6 die1;
    private Die6 die2;
    private Die6 die3;
    private Die6 die4;
    
    public Yahtzee() {
        die = new Die6();
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        this.roll();
    }
    
    public void roll() {
        this.die.roll();
        this.die1.roll();
        this.die2.roll();
        this.die3.roll();
        this.die4.roll();
    }
    
    public void roll(int diceNumber) {
        if (diceNumber == 1) {
            this.die.roll();
        } else if (diceNumber == 2) {
            this.die1.roll();
        } else if (diceNumber == 3) {
            this.die2.roll();
        } else if (diceNumber == 4) {
            this.die3.roll();
        } else if (diceNumber == 5) {
            this.die4.roll();
        } 
    }
    
    public String summarize() {
        int[] array = {this.die.getValue(), this.die1.getValue(), this.die2.getValue(), this.die3.getValue(), this.die4.getValue()};
        int i = 0;
    }
    
    public String toString() {
        int[] array = {this.die.getValue(), this.die1.getValue(), this.die2.getValue(), this.die3.getValue(), this.die4.getValue()};
        return "Dice values: " + array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4];
    }
}
