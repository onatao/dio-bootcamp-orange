
    import java.util.Scanner;
public class Ex06 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int fatorial;
        int mult = 1;

        System.out.println("Digite o número que será fatorado: ");
        fatorial = input.nextInt();
    
        for (int i = fatorial; i >= 1; i--) {
            mult = (mult * i);
        }

        System.out.println(fatorial + "! = " + mult);
        

    }
    
}
