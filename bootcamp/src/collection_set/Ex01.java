package collection_set;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex01 {
    public static void main(String[] args) {
        // Criar um conjunto de valores
        Set<Double> valores = new HashSet<>(Arrays.asList(7d, 8.5d, 9.3d, 5d, 7d, 8d, 3.6d));
        System.out.println(valores.toString());

        // Conferir se o valor 5 está no conjunto
        System.out.println(valores.contains(5d));

        // Exibir o menor valor
        System.out.println(Collections.min(valores));

        // Exibir o maior valor
        System.out.println(Collections.max(valores));
        
        // Exibir a soma dos valores
        Iterator<Double> operacao = valores.iterator();
        Double soma = 0d;
        while (operacao.hasNext()) {
            Double valor = operacao.next();
            soma += valor;
        }
        System.out.println(soma);

        // Exibir a média dos valores
        System.out.println("Média: " + soma/valores.size());

        // Remover o valor 0
        valores.remove(0d);
        System.out.println(valores);

        // Remover valores menos que 7 e exibir o conjunto
        Iterator<Double> operacao2 = valores.iterator();
        while (operacao2.hasNext()) {
            Double value = operacao2.next();
            if (value < 7) operacao2.remove();
        }
        System.out.println(valores);

        // Exibir os valores em ordem de inserção
        Set<Double> valores2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5d, 9.3d, 5d, 7d, 8d, 3.6d));
        System.out.println(valores2);

        // Exibir os valores em ordem crescente
        Set<Double> valores3 = new TreeSet<>(valores2);
        System.out.println(valores3);

        // Apagar todo conjunto
        valores.clear();
        System.out.println("O conjunto 1 está vazio? " + valores.isEmpty());

    }
    
}
