package chapter13;

public class DividingByZeroException {

    public static void main(String[] args) {
        try {
            int c = 30/0;
        }catch (ArithmeticException e){
            System.out.println("You cannot divide by zero dumb ass");
        }finally {
            System.out.println("Division is fun!");
        }
    }
}
