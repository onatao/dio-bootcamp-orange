package collection_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex01 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();

            notas.add(1d);
            notas.add(8.5d);
            notas.add(9.3d);
            notas.add(5d);
            notas.add(7d);
            notas.add(0d);
            notas.add(3.6d);
        
            // Exiba a posição do elemento 7d
            System.out.println(notas.indexOf(7d));

            // Insira o elemento 8 na posição 4
            notas.add(4, 8d);
            System.out.println(notas);

            // Substitua o valor da posição 3 por 6
            notas.set(2, 6d);
            System.out.println(notas);
        
            // Confira se o valor 8 está na lista
            System.out.println(notas.contains(8d));
        
            // Exiba todos os elementos da lista
            for (Double nota: notas) System.out.println(nota);

            // Exiba a terceira nota adicionada
            System.out.println("O valor que ocupa a 3a posição é: " + notas.get(2));

            // Exibir a menor nota da lista 
            System.out.println("O menor valor é: " + Collections.min(notas));

            // Exibir o maior valor da lista
            System.out.println("O maior valor é: " + Collections.max(notas));

            // Somar todos os valores da lista
            Iterator<Double> operacao = notas.iterator(); // cria um objeto tipo Iterator 
            Double soma = 0d;

                while(operacao.hasNext()) {
                    Double valor = operacao.next(); // estrutura que soma os valores e 
                    soma += valor;                  // armazena na variável soma
                }
                System.out.println(soma);
        
            // Exibir a média dos valores
            Iterator<Double> operacao2 = notas.iterator();
            Double soma2 = 0d;
            Double avg;
                while (operacao2.hasNext()) {
                    Double valor2 = operacao2.next();
                    soma2 += valor2;
                }
            avg = (soma/notas.size());
            System.out.println("A média dos valores é: " + avg);   
        
            // Remova o valor 0
            notas.remove(0d);
            System.out.println(notas);

            // Remova a nota da posição 0
            notas.remove(0);
            System.out.println(notas);

            // Remover valores menores que 7
            Iterator<Double> operacao3 = notas.iterator(); 
                while (operacao3.hasNext()) {
                    Double valor3 = operacao3.next();
                        if (valor3 < 7) operacao3.remove();
                }
                System.out.println(notas);

            // Apagar a lista
            notas.clear();

            // Conferir se a lista está vazia
            notas.isEmpty();
        }

    }

