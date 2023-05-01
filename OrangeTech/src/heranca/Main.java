package heranca;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); // cria funcionário genérico
 
        // herdarão atributos da classe mãe e seus próprios atributos (upcast)
        Funcionario gerente = new Gerente(); 
        Funcionario faxineiro = new Faxineiro(); 
        Funcionario vendedor = new Vendedor(); 

        // perdão os atributos relacionados a subclasse (downcast)

        Gerente gerente2 = (Gerente) new Funcionario();
        Vendedor vendedor2 = (Vendedor) new Funcionario();
        Faxineiro faxineiro2 = (Faxineiro) new Funcionario();

        /* downcast ocorre apenas de subclasse
         * para classe mãe, não é possível de
         * subclase para outra subclasse.
         *  
         *  Gerente gerente2 = (Gerente) new Faxineiro(); 
         *  o exemplo acima não é válido
         */
    }
}
