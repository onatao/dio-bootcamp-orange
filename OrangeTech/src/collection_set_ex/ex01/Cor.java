package collection_set_ex.ex01;



public class Cor implements Comparable<Cor> {
    
    private String cor;

    public Cor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String toString() {
        return this.getCor(); 
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
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
        Cor other = (Cor) obj;
        if (cor == null) {
            if (other.cor != null)
                return false;
        } else if (!cor.equals(other.cor))
            return false;
        return true;
    }

    @Override
    public int compareTo(Cor c1) {
        return this.getCor().compareTo(c1.getCor()); 
    }
 

    
}

