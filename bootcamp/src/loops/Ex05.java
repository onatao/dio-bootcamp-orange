package loops;
    import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Informe o número que será utilizado para tabuada: ");
        number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number*i));
        }

        
    }
    
}
