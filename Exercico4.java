
package algoritmoifandelse;

import java.util.Scanner;

public class Exercico4 {
    public static void main(String[] args) {
        double p,a,c;
        Scanner console = new Scanner(System.in);
        System.out.println("Digite o Peso: ");
        p = console.nextDouble();
        System.out.println("Digite sua altura: ");
        a = console.nextDouble();    
        c = p/Math.pow(a,2);
        
        if(c < 26) {
            System.out.println("Seu Grau de Obesidade é Normal.");
        } else if (c >= 26 && c < 30) {
            System.out.println("Seu grau de Obesidade é Obeso.");
        } else if (c >= 30) {
            System.out.println("Seu grau é GORDELA PESADO.");
        }
    }
    
}
