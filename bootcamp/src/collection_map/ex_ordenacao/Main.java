package collection_map.ex_ordenacao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        // Crie um dicionário de livros em ordem aleatória
        Map<String, Livro> meusLivros = new HashMap<>();
        meusLivros.put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        meusLivros.put("Dugigg, Charles", new Livro("O Poder Do Hábito", 408));
        meusLivros.put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));

        // Exibir em ordem aleatória, porém apenas nome do autor e nome do livro
        for (Map.Entry<String, Livro> livro :meusLivros.entrySet()) {
            System.out.println("Nome do autor: " + livro.getKey()); // retorna a key (nome do autor)
            System.out.println("Nome do livro: " + livro.getValue()); // retorna value (nome do livro)
        }

        // Exibir na ordem de inserção
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>();
        meusLivros.put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        meusLivros.put("Dugigg, Charles", new Livro("O Poder Do Hábito", 408));
        meusLivros.put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet()) {
            System.out.println("Nome do autor: " + livro.getKey()); // retorna a key (nome do autor)
            System.out.println("Nome do livro: " + livro.getValue()); // retorna value (nome do livro)    
        }

        // Ordem alfabética de autores
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro: meusLivros2.entrySet()) {
            System.out.println("Nome do autor: " + livro.getKey()); // retorna a key (nome do autor)
            System.out.println("Nome do livro: " + livro.getValue()); // retorna value (nome do livro)   
        }

        // Ordem alfabética de nome dos livros
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivros3) {
            System.out.println("Nome do autor: " + livro.getKey()); // retorna a key (nome do autor)
            System.out.println("Nome do livro: " + livro.getValue()); // retorna value (nome do livro)   
        }







    }
}

// Classe que irá implementar o método Comparator para comparações
class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());  // compara por nome
    }
    
}