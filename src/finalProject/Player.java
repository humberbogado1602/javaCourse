package finalProject;

import java.util.Locale;

/*
This one will have fields called name and guess.
You'll also have encapsulation in Player, and then add a
constructor which accepts a player's name.
 */
public class Player {
    private String name;
    private boolean guess;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGuess() {
        return guess;
    }

    public void setGuess(boolean guess) {
        this.guess = guess;
    }

    public Player(String name) {
        this.name = name;
    }
}
