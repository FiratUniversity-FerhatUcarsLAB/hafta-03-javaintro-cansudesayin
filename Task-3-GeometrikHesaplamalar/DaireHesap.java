public class DaireHesap {
    public static void main(String[] args) {
        double r = 5.5;
        double pi = Math.PI; // veya 3.14159

        double alan = pi * r * r;

        double cevre = 2 * pi * r;
        
        System.out.println("Yarıçap: " + r);
        System.out.printf("Alan: %.2f\n", alan);
        System.out.printf("Çevre: %.2f\n", cevre);
    }
}
