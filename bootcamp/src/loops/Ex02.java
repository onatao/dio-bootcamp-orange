package loops;
    import java.util.Scanner;

import javafx.scene.paint.Stop;
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor entre 1 e 10: ");
        int value = input.nextInt();
            if (value <= 10) {
                System.out.println("Obrigado! Valor digitado: " + value);
            }else{
                System.out.println("Valor inválido.. " + value + 
                " não está entre 1 e 10.");
            }
    }
}
