
    import java.util.Scanner;
public class Ex03 {

    /**
     * @param args
     */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int contador = 0;
        
        float numero, media;
        float soma = 0;
        float maior = 0;

        do {
            System.out.println("Digite um valor: ");
            numero = input.nextFloat();
            soma+=numero;
                if (numero > maior) maior = numero;
            contador++;
        } while(contador <= 4);

        media = (soma / 5);
        System.out.println("A média entre os valores é: " + media);
        System.out.println("O maior número digitado foi:" + maior);

    }
    
}
