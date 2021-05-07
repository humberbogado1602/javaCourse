package finalProject;

import java.util.Random;

/*
It should contain a field called side, encapsulation, constant variables for heads and tails,
a method called flip(), which randomly chooses heads or tails and assigns that value to side.
HEADS = true ; TAILS = false
 */
public class Coin {
    private boolean side;

    public boolean getSide() {
        return side;
    }

    public boolean flip(){
        Random value = new Random();
        this.side = value.nextBoolean();
        return this.side;
    }

    public void printResults() {
        if (this.getSide() == true)
            System.out.println("It's heads");
        else
            System.out.println("It's tails");
    }
}
