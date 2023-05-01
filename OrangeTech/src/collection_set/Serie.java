package collection_set;

import java.util.Comparator;
import java.util.Objects;


public class Serie implements Comparable<Serie> {

    private String nome;
    private String genero;
    private int duracao;

    public Serie(String nome, String genero, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.getNome() +
               "\nGênero: " + this.getGenero() +
               "\nDuração do episódio: " + this.getDuracao(); 

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + duracao;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (duracao != other.duracao)
            return false;
        return true;
    }
    
    // Métodos do Comparable
    @Override
    public int compareTo(Serie serie) {
        int duracao = Integer.compare(this.getDuracao(), serie.getDuracao()); // ordena por tempo de ep
        if (duracao != 0) return duracao; 
        return this.getGenero().compareTo(serie.getGenero()); // caso sejam iguais, ordena por gênero
    }
    
    public class NomeGeneroDuracao implements Comparator<Serie> {

        @Override
        public int compare(Serie s1, Serie s2) {
            int nome = s1.getNome().compareTo(s2.getNome());
            if (nome != 0) return nome;
            
            int genero = s1.getGenero().compareTo(s2.getGenero());
            if (genero != 0) return genero;

            return Integer.compare(s1.getDuracao(), s2.getDuracao());
        }

    }


}
