package chapter10;

public class Banana extends Fruit{

    public Banana() {
        setCalories();
    }

    public int getCalories(){
        return calories;
    }

    public void setCalories(){
        this.calories = 170;
    }

    @Override
    public void makeJuice() {
        System.out.println("BANANA juice is made");
    }

    public void removePeel(){
        System.out.println("Now banana is ready to be eaten");
    }
}
