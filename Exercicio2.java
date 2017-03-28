
package algoritmoifandelse;

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a,b;
        System.out.print("Digite o valor:");
        a = console.nextInt();
        if(a > 100) {
            a = a + 150;
            System.out.println("Seu resultado é: " + a);
        } else { 
            System.out.println("Seu numero é menor que 100.");
        }
    }
    
}
