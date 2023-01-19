
    import java.util.Scanner;
public class Ex02 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int consoantes = 0;
        int counter;

        String[] letras = new String[6];

        counter = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();
                
                if (letra.equalsIgnoreCase("a") |  
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) {
                    letras[counter] = letra;
                    consoantes++;
                }

            counter++;    
        }while (counter < letras.length);

        for (String elementoArray : letras) {
            if (elementoArray != null) {
                System.out.println(elementoArray);
            }
        }
        System.out.println("Quantidade de consoantes digitadas: " + consoantes);

    }
}
