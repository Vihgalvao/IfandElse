package algoritmoifandelse;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        double w, n1, n2, n3;
        Scanner console = new Scanner(System.in);

        System.out.println("Mostre seu KWh: ");
        w = console.nextDouble();
        if (w < 150) {
            n1 = w * 0.20;
            if (n1 < 11.9) {
                System.out.print("Você ira pagar: R$ 11,90.");
            } else {
                System.out.println("Você ira pagar: R% " + n1);
            }
        } else if (w >= 150 && w < 500) {
            n2 = w * 0.25;
            if (n2 < 11.9) {
                System.out.print("Você ira pagar R$ 11,90.");
            } else {
                System.out.println("Você ira pagar: R$ " + n2);
            }
        } else if (w >= 500) {
            n3 = w * 0.30;
            if (n3 < 11.9) {
                System.out.print("Voce ira pagar R$ 11,90.");
            } else {
                System.out.println("Voce ira pagar R$ " + n3);
            }
        }
    }

}
