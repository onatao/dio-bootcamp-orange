package loops;
 
import java.util.Scanner;

public class Ex04 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int even = 0;
        int odd = 0;
        int counter = 0;

        System.out.println("Digite a quantidade de números: ");
        int number_range = input.nextInt();

            do {
                System.out.println("Digite um número: ");
                number = input.nextInt();
                    if (number%2 == 0) {
                        even++;
                    }else{
                        odd++;
                    }
                    counter++;
            }while(counter < number_range);

            System.out.println("Foram digitados " + number_range + " números.");
            System.out.println(even + " são pares e " + odd + " são ímpares.");


   } 
}
