package collection_list;

    import java.util.List;
    import java.util.ArrayList;
    import java.util.Scanner;

public class ExProp02 {
    public static void main(String[] args) {
        List<String> resp = new ArrayList<>(5);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Telefonou para vítima? S / N");
        String resp1 = input.next();
        resp.add(resp1);

        System.out.println("Esteve no local do crime? S / N");
        String resp2 = input.next();
        resp.add(resp2);

        System.out.println("Mora perto da vítima? S / N");
        String resp3 = input.next();
        resp.add(resp3);

        System.out.println("Devia para vítima? S / N");
        String resp4 = input.next();
        resp.add(resp4);

        System.out.println("Já trabalhou com a vítima? S / N");
        String resp5 = input.next();
        resp.add(resp5);
        
        for (String resposta: resp) {
            int positivo=0;
            if (resposta.equalsIgnoreCase("S")) {
                positivo++;
            }   
            if (positivo == 0) {
                System.out.println("INOCENTE");
            } else if (positivo == 5) {
                System.out.println("ASSASSINO");
            } else if (positivo == 2) {
                System.out.println("SUSPEITO");
            } else if ((positivo > 3) && (positivo < 4)) {
                System.out.println("CÚMPLICE");
            }
        }

    }
    
}
