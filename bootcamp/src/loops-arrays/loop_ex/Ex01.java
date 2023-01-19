

    import java.util.Scanner;

public class Ex01 {

    /**
     * @param args
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("Digite o nome: ");
            nome = input.next();
                if (nome.equals("0")) break;
            System.out.println("Digite a idade: ");
            idade = input.nextInt();
        }

        System.out.println("Nome inválido..");

    }
    
}
