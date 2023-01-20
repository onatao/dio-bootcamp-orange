package metodo_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Jon", "Preto", 18);
        Gato gato2 = new Gato("Simba", "Tigrado", 6);
        Gato gato3 = new Gato("Jon", "Amarelo", 12);

        List<Gato> meusGatos = new ArrayList<>();      
        
        meusGatos.add(gato1);
        meusGatos.add(gato2);
        meusGatos.add(gato3);

        class ComparadorIdade implements Comparator<Gato> {
            @Override
            public int compare(Gato g1, Gato g2) {
                return Integer.compare(g1.getIdade(), g2.getIdade());
            }
        }

        class ComparadorCor implements Comparator<Gato> {
            @Override
            public int compare(Gato g1, Gato g2) {
                return g1.getCor().compareToIgnoreCase(g2.getCor());
            }
            
        }

        class ComparadorNomeCorIdade implements Comparator<Gato> {
            @Override
            public int compare(Gato g1, Gato g2) {
                int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
                    if (nome != 0) return nome;

                int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
                    if (cor != 0) return cor;

                return Integer.compare(g1.getIdade(), g2.getIdade());
            }
        }

            // Exibe todos os gatos em ordem de inserção
            for (Gato gato: meusGatos) {
                System.out.println(gato);
            }

            // Exibe em ordem aleatória
                Collections.shuffle(meusGatos); // .shuffle randomiza
                System.out.println(meusGatos);

            // Exibe em ordem natural (Nome)
                Collections.sort(meusGatos);
                System.out.println(meusGatos);

            // Exibe em ordem de idade
                Collections.sort(meusGatos, new ComparadorIdade());
                System.out.println(meusGatos);

            // Exibir por ordem de cor
                Collections.sort(meusGatos, new ComparadorCor());
                System.out.println(meusGatos);

            // Exibir por ordem de nome, cor e idade
                Collections.sort(meusGatos, new ComparadorNomeCorIdade());
                System.out.println(meusGatos);
    }
}
