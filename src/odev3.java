import java.util.Scanner;
public class odev3 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("a kenarı (1. dik kenar) : " );
        a = input.nextDouble();

        System.out.println("b kenarı (2. dik kenar) : ");
        b = input.nextDouble();

        System.out.println("c kenarı (hipotenüs) : ");
        c = input.nextDouble();

        double cevre = a + b + c;
        double alan = (a * b)/2;
        System.out.println("Üçgenin çevresi : " + cevre);
        System.out.println("Üçgenin alanı : " + alan);




    }
}
