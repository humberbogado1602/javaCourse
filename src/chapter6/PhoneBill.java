package chapter6;

public class PhoneBill {
    //items
    private String id;
    private double baseCost;
    private double allottedMinutes;
    private double usedMinutes;

    //constructors
    public PhoneBill(){
        this.id = "0";
        this.baseCost = 79.99;
        this.allottedMinutes = 800;
        this.usedMinutes = 800;
    }

    public PhoneBill(String id){
        this.id = id;
        this.baseCost = 79.99;
        this.allottedMinutes = 800;
        this.usedMinutes = 800;
    }

    public PhoneBill(String id, double baseCost, double nOfAllottedMinutes, double nOfUsedMinutes){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = nOfAllottedMinutes;
        this.usedMinutes = nOfUsedMinutes;
    }

    //getter&setter
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id.toString();
    }

    public double getBaseCost(){
        return baseCost;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public double getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(double allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public double getUsedMinutes(){
        return usedMinutes;
    }
    public void setUsedMinutes(double usedMinutes){
        this.usedMinutes = usedMinutes;
    }

    //some methods
    public double calculateOvg(){
        if (usedMinutes > allottedMinutes) {
            double charge = .25;
            return (usedMinutes - allottedMinutes) * charge;
        }
        return 0;
    }

    public double calculateTax(){
        double tax = .15;
        return (baseCost + calculateOvg()) * tax;
    }

    public double calculateTotal(){
        return baseCost + calculateTax();
    }


    public void printBill(){
        System.out.println("Phone bill statement");
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + String.format("%.2f", calculateOvg()));
        System.out.println("Tax: $" + String.format("%.2f",calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }
}
