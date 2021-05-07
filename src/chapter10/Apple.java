package chapter10;

public class Apple extends Fruit{

    public Apple() {
        setCalories();
    }

    public int getCalories(){
        return calories;
    }

    public void setCalories(){
        this.calories = 100;
    }


    @Override
    public void makeJuice() {
        System.out.println("APPLE juice is made");
    }

    public void removeSeeds(){
        System.out.println("All seeds have been removed");
    }
}
