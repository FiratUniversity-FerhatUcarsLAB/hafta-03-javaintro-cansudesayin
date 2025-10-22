public class UcgenAlan {
        public static void main(String[] args) {
        
            double a = 3.0;
            double b = 4.0;
            double c = 5.0;

            double s = (a + b + c) / 2.0;

            double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Kenar a: " + a);
            System.out.println("Kenar b: " + b);
            System.out.println("Kenar c: " + c);
            System.out.println("Ucgenin Alani: " + alan);
        }
    }
