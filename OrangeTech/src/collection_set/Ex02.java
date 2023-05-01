package collection_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 {
    public static void main(String[] args) {
        Set<Serie> listaSerie =  new HashSet<Serie>(){{
                add(new Serie("GOT", "Fantasia", 60));
                add(new Serie("DARK", "Drama", 60));
                add(new Serie("That 70's Show", "Comédia", 25));
        }};
        //for (Serie serie: listaSerie) {
        //    System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracao());
        //}

        // Exibir de acordo com a duração do episódio (TreeSet)
        Set<Serie> listaSeries2 = new TreeSet<>(listaSerie);
        for (Serie serie: listaSeries2) {
            System.out.println(serie.getNome());
            System.out.println(serie.getGenero());
            System.out.println(serie.getDuracao());
        }

        // Exibir por ordem de Nome, Gênero e Duração do episódio
        Set<Serie> listaSerie3 = new TreeSet<>(new ComparaTot());
        listaSerie3.addAll(listaSerie);
        for (Serie serie: listaSerie3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getGenero());
        }



    }

    
}
