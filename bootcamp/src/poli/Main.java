package poli;

public class Main {
    public static void main(String[] args) {
        ClasseBase[] vetor = new ClasseBase[]{new ClasseFilha1(), 
            new ClasseFilha2(), new ClasseBase()};

            for (ClasseBase classe: vetor) {
                classe.mensagem();
            }

            System.out.println(" ");
        ClasseBase base = new ClasseBase();
        base.saudacao();
            
        ClasseFilha2 filha = new ClasseFilha2();
        filha.saudacao();

        
    }
}
