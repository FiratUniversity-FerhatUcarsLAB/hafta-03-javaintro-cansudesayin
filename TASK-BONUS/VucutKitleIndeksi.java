public class BmiHesapla {
    public static void main(String[] args) {
        // BMI = kilo / (boy * boy) [cite: 250]
        // Boy metre cinsinden olmalıdır (Örn: 1.75)
        double kilo = 80.0;
        double boy = 1.75;

        double bmi = kilo / (boy * boy);

        System.out.println("Kilo (kg): " + kilo);
        System.out.println("Boy (m): " + boy);
        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f\n", bmi);
    }
}
