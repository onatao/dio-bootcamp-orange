package metodo_list;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<Double> notas2 = new ArrayList<Double>();

        notas2.add(5d);
        notas2.add(4d);
        notas2.add(7.5d);
        notas2.add(10d);
        notas2.add(6.5d);
        notas2.add(4.5d);
        notas2.add(7.8d);

            // Exibir o primeiro valor
            System.out.println("O primeiro valor da lista é: " + notas2.get(0));

            // Exibir o primeiro valor da lista e removê-lo
            System.out.println("O primeiro valor da lista é: " + notas2.get(0));
            notas2.remove(0);
                for (Double nota: notas2) System.out.println(nota);

    }
    
}
