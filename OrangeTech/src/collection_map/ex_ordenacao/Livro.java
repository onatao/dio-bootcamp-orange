package collection_map.ex_ordenacao;

public class Livro {

    private String nome;
    private int pagina;

    public Livro (String nome, int pagina) {
        this.nome = nome;
        this.pagina = pagina;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int GetPagina() {
        return this.pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    @Override
    public String toString() {
        return "\nNome do livro: " + this.getNome() +
               "\nQuantidade de páginas: " + this.GetPagina(); 
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + pagina;
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
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (pagina != other.pagina)
            return false;
        return true;
    }

    

}
