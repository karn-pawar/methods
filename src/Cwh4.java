public class Cwh4 {
    public static void main(String[] args) {
        System.out.println("The full * Triangle is");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}