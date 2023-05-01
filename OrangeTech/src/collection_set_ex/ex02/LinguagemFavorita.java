package collection_set_ex.ex02;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    
    private String nome;
    private String ide;
    private int ano;

    public LinguagemFavorita(String nome, String ide, int ano) {
        this.nome = nome;
        this.ide = ide;
        this.ano = ano;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIde() {
        return this.ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "\nNome: " + this.getNome() +
               "\nIDE: " + this.getIde() + 
               "\nAno de criação: " + this.getAno();
               
               

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((ide == null) ? 0 : ide.hashCode());
        result = prime * result + ano;
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
        LinguagemFavorita other = (LinguagemFavorita) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        if (ano != other.ano)
            return false;
        return true;
    }

    @Override
    public int compareTo(LinguagemFavorita l1) {
        int nome = this.getNome().compareTo(l1.getNome());
        if (nome != 0) return nome;

        return this.getIde().compareTo(l1.getIde());
    }

    

}
