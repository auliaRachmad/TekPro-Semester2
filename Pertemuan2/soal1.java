import java.math.BigInteger;
import java.util.Scanner;

public class soal1 {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            testInput();
        }
    }

    private static void testInput(){
        System.out.println();
        BigInteger angka = scan.nextBigInteger();

        int angka_bitLength = angka.bitLength();

        if (angka_bitLength > 64) {
            System.out.println(angka + " can’t be fitted anywhere");
        }else {
            System.out.println(angka+" can be fitted in:");

            long nilai = angka.longValue();

            if (nilai <= Byte.MAX_VALUE && nilai >= Byte.MIN_VALUE)
                System.out.println("* byte");
            if (nilai <= Short.MAX_VALUE && nilai >= Short.MIN_VALUE)
                System.out.println("* short");
            if (nilai <= Integer.MAX_VALUE && nilai >= Integer.MIN_VALUE)
                System.out.println("* int");
            System.out.println("* long");
        }
    }
}
