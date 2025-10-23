public class HesapOzeti {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("         ALIŞVERİŞ LİSTESİ           ");
        System.out.println("======================================");
        System.out.println("Ürün          Miktar    Fiyat    Toplam");
        System.out.println("--------------------------------------");

        String urun1 = "Ekmek";
        int miktar1 = 2;
        double fiyat1 = 5.0;
        double toplam1 = miktar1 * fiyat1;
        System.out.printf("%-14s %4d    %6.2f    %6.2f\n", urun1, miktar1, fiyat1, toplam1);

        String urun2 = "Süt";
        int miktar2 = 3;
        double fiyat2 = 15.0;
        double toplam2 = miktar2 * fiyat2;
        System.out.printf("%-14s %4d    %6.2f    %6.2f\n", urun2, miktar2, fiyat2, toplam2);

        String urun3 = "Yumurta";
        int miktar3 = 1;
        double fiyat3 = 35.0;
        double toplam3 = miktar3 * fiyat3;
        System.out.printf("%-14s %4d    %6.2f    %6.2f\n", urun3, miktar3, fiyat3, toplam3);

        double genelToplam = toplam1 + toplam2 + toplam3;
        System.out.println("======================================");
        System.out.printf("GENEL TOPLAM:                  %6.2f\n", genelToplam);
        System.out.println("======================================");
    }
}
