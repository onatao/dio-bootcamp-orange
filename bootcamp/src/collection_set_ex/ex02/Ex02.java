package collection_set_ex.ex02;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 {
  public static void main(String[] args) {
    Set<LinguagemFavorita> ideList = new HashSet<LinguagemFavorita>(){{
        add(new LinguagemFavorita("Java", "NetBeans", 1991));
        add(new LinguagemFavorita("Python", "IDLE", 1991));
        add(new LinguagemFavorita("COBOL", "OpenCobolIDE", 1959));
    }};

    // Exibir por ordem de inserção
    //for (LinguagemFavorita obj: ideList) System.out.println(obj);

    // Exibir por ordem de nome
    Set<LinguagemFavorita> lista = new TreeSet<>(ideList);
    for (LinguagemFavorita obj: lista) System.out.println(obj); 

    // Exibir por ordem de Ano de criação e Nome
    Set<LinguagemFavorita> lista2 = new TreeSet<>(ideList);
    for (LinguagemFavorita obj2: lista2) System.out.println(obj2);
    



  }  
}
