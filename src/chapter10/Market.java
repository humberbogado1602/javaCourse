package chapter10;

public class Market {

    public static void main(String[] args) {

//        Apple apple = new Apple();
//        apple.makeJuice();
//        apple.removeSeeds();

        Fruit polymorphicFruit = new Apple();
        polymorphicFruit.makeJuice();
        ((Apple) polymorphicFruit).removeSeeds();
        System.out.println("This has " + ((Apple) polymorphicFruit).getCalories() + " calories");

        //metodo para plantar una fruta
        sow(polymorphicFruit);

        System.out.println();

        polymorphicFruit = new Banana();
        polymorphicFruit.makeJuice();
        ((Banana) polymorphicFruit).removePeel();
        System.out.println("This has " + ((Banana) polymorphicFruit).getCalories() + " calories");
        sow(polymorphicFruit);
    }

    private static void sow(Fruit fruit) {

        if (fruit instanceof Apple){
            System.out.println("Apple takes 10 months to be ready");
        }
        else if (fruit instanceof Banana){
            System.out.println("Banana takes 5 months to be ready");
        }
    }
}
