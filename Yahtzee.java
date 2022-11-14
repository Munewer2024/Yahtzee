
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
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                one++;
            } else if (array[i] == 2) {
                two++;
            } else if (array[i] == 3) {
                three++;
            } else if (array[i] == 4) {
                four++;
            } else if (array[i] == 5) {
                five++;
            } else if (array[i] == 6) {
                six++;
            }
        }
        return "1-" + one + " 2-" + two + " 3-" + three + " 4-" + four + " 5-" + five + " 6-" + six;
    }
    
    public String toString() {
        int[] array = {this.die.getValue(), this.die1.getValue(), this.die2.getValue(), this.die3.getValue(), this.die4.getValue()};
        return "Dice values: " + array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4];
    }
}
