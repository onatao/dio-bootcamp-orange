package collection_set_ex.ex02;

import java.util.Comparator;

public class CompT implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if (ano != 0) return ano;

        return l1.getNome().compareTo(l2.getNome());   
    }
    
}
