package metodo_list;

public class Gato implements Comparable<Gato> {

    private String nome, cor;
    private int idade;
    
    public Gato(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    } 

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "\nNome do gato: " + this.getNome() +
               "\nCor do gato: " + this.getCor() + 
               "\nIdade do gato: " + this.getIdade(); 
    }

    @Override  
    public int compareTo(Gato gato) { // faz parte da interface Comparable
        return this.getNome().compareToIgnoreCase(getNome());
    }
}
