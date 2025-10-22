public class Faktoriyel {
    public static void main(String[] args) {
        int adim1 = 5 * 4;
        int adim2 = adim1 * 3;
        int adim3 = adim2 * 2;
        int sonuc = adim3 * 1;
        
        System.out.println("5! hesaplanıyor:");
        System.out.println("5 * 4 = " + adim1);
        System.out.println("20 * 3 = " + adim2);
        System.out.println("60 * 2 = " + adim3);
        System.out.println("120 * 1 = " + sonuc);
        System.out.println("\n5! = " + sonuc);
    }
}
