public class IkiIslemSonucu {
    public static void main(String[] args) {
        double pay = (9.5 * 4.5) - (2.5 * 3);
        double payda = 45.5 - 3.5;
        double sonuc = pay / payda;
        double yuvarlanmis = Math.round(sonuc * 10000.0) / 10000.0;

        System.out.println("Sonuç: " + yuvarlanmis);
    }
}
