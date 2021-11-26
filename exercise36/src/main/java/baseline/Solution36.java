package baseline;

public class Solution36 {
    public static void main(String[] args) {
        StatsClass stats = new StatsClass();
        stats.inputHandling();
        stats.printList();
        System.out.println("The Average is: "+stats.average());
        System.out.println("The max is: "+stats.max());
        System.out.println("The min is: "+stats.min());
        System.out.println("The standard deviation is: "+stats.std());
    }
}
