package loops;
    import java.rmi.server.SocketSecurityException;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Digite um nome: ");
            String name = input.next();
                if (name.equals("0")) break;
            System.out.println("Digite a idade: ");
            int age = input.nextInt();
            System.out.println("Nome: " + name + " Idade: " + age);
        }
       
    }
}
