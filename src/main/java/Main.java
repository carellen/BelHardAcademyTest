public class Main {
    public static void main(String[] args) {
        Squad squad = new Squad();
        printTotalWeight(squad.getTotalWeaponsWeight());
        printTotalPrice(squad.getTotalWeaponsPrice());
    }

    public static void printTotalPrice(int totalPrice) {
        System.out.println("Total price is: " + totalPrice/100 + "." + totalPrice%100 +  " USD");
    }
    public static void printTotalWeight(int totalWeight) {
        System.out.println("Total weight is: " + totalWeight + " kg");
    }
}
