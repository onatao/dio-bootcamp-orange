package collection_set_ex.ex01;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {
        Set<Cor> arcoIris = new HashSet<Cor>(){{
            add(new Cor("Vermelho"));
            add(new Cor("Laranja"));
            add(new Cor("Amarelo"));
            add(new Cor("Verde"));
            add(new Cor("Azul"));
            add(new Cor("Azul-escuro"));
            add(new Cor("Violeta"));
        }};

        // Exibir todas as cores em lista
        for (Cor cor: arcoIris) System.out.println(cor); 

        // Exibir a quantidade de cores
        System.out.println("O arco íris possui " + arcoIris.size() + " cores.");

        // Exibir em ordem alfabética
        Set<Cor> listaCor = new TreeSet<>(arcoIris);
        for (Cor cor: listaCor) System.out.println(cor);

        // Limpe o conjunto
        arcoIris.clear();

        // Verificar se está limpo
        arcoIris.isEmpty();

        


    }

}
