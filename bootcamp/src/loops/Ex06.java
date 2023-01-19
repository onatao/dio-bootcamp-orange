package loops;
    import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factorial;
        int times = 1;

        System.out.println("Digite o número que será fatorado: ");
        factorial = input.nextInt();

        for (int i = factorial; i >= 1; i--) {
            times = (times*i);
        }
        System.out.println(factorial + "! = " + times);
    }
}
