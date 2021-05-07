package chapter9;

public class TasteTester {

    public static void main(String[] args) {
        Cake cake = new Cake("Strawberry");
        BirthdayCake cake1 = new BirthdayCake("Vanilla");

        System.out.println("The flavor is " + cake1.flavor);
        System.out.println("The flavor is " + cake.flavor);
    }


}
