public class SaatDonusturme {
    public static void main(String[] args) {
        // Örnek: 3665 saniye = 1:01:05 [cite: 248]
        int toplamSaniye = 3665;

        int saat = toplamSaniye / 3600;
        int kalanSaniye = toplamSaniye % 3600;
        int dakika = kalanSaniye / 60;
        int saniye = kalanSaniye % 60;

        System.out.println(toplamSaniye + " saniye:");
        // printf kullanarak 1:1:5 yerine 1:01:05 şeklinde yazdırıyoruz [cite: 248, 340]
        System.out.printf("%d:%02d:%02d\n", saat, dakika, saniye);
    }
}
