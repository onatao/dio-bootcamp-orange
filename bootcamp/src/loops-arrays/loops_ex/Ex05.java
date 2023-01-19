
    import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Informe o número da tabuada: ");
        numero = input.nextInt();

        for(int i =1; i <= 10; i++) {
            System.out.println(numero + " x " + i  + " = " + (numero*i));
        }  
 }
}
