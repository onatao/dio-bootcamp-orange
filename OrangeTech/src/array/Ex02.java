package array;
    import java.util.Scanner;
public class Ex02 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vogal = 0;
        int counter = 0;

        String[] letras = new String[6];

        do {
            System.out.println("Digite uma letra: ");
            String letra = input.next();
                if (letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u") ) {
                        letras[counter] = letra;
                        vogal++;
                }
                counter++;
        }while(counter < letras.length);

        for (String letraArray: letras) {
            if (letraArray != null) {
                System.out.println(letraArray);
            }
        }
        System.out.println("Quanidade de vogais digitadas: " + vogal);
    }
}
