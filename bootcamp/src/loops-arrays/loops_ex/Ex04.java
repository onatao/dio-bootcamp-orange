
    import java.util.Scanner;
public class Ex04 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        int numero;
        int counter = 0;
        int quantidadeValores;
        int pares = 0;
        int impares = 0;

        System.out.println("Informe a quantidade de valores: ");
        quantidadeValores = input.nextInt();

        do {          
           System.out.println("Digite o número: ");
           numero = input.nextInt(); 
           System.out.println("Número digitado: " + numero);
            if (numero%2 == 0) {
                pares++;
            }else{
                impares++;
            }
           counter++;
        }while(counter < quantidadeValores);
 
        System.out.println("quantidade de números pares: " + pares);
        System.out.println("quantidade de números ímpares: " + impares);
    }
    
}
