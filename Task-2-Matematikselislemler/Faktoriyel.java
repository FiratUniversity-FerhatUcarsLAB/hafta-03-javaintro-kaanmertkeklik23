public class Faktoriyel {
    public static void main(String[] args) {
        int sayi = 5;
        int sonuc = 1;
        System.out.print(sayi + "! = ");

        for(int i = sayi; i >= 1; --i) {
            sonuc *= i;
            System.out.print(i);
            if (i != 1) {
                System.out.print(" x ");
            }
        }

        System.out.println(" = " + sonuc);
    }
}
