
package algoritmoifandelse;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a,b, c = 0;
        
        System.out.print("A: ");
        a = console.nextInt();
        System.out.print("B: ");
        b = console.nextInt();
        
        if(a % b == c) {
            System.out.printf(" A divisão de %f por %f é exata.",a,b);   
        } else {
            System.out.println("A divisão não é EXATA.");
        }
    }
    
}
