

    import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        
        int valor;
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Digite um valor entre 1 e 10: ");
            valor = input.nextInt();
                if (valor <= 10) {
                    System.out.println("Obrigado");
                }else{
                    System.out.println("Valor inválido");
                    continue;
                }
        }



    }
}
