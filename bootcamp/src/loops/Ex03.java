package loops;
    import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
        int counter = 0;
        float high_number = 0;
        float total = 0;
        float number, avg;
        
        do {
            System.out.println("Digite um valor: ");
            number = input.nextFloat();
            total += number;
                if (number > high_number) high_number = number;
            counter++; 
        }while (counter <= 4);

        avg = total / 5;

        System.out.println("A média dos valores digitados é de: " + avg);
        System.out.println("O maior número digitado foi: " + high_number);

        
    }
}
