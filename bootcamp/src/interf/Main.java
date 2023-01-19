package interf;

public class Main implements OperacaoMatematica {

    @Override
    public void soma(double n1, double n2) {
        System.out.println(n1 + n2);
    }

    @Override
    public void subtrai(double n1, double n2) {
        System.out.println(n1 - n2);
    }

    @Override
    public void multiplica(double n1, double n2) {
        System.out.println(n1*n2);
    }

    @Override
    public void divide(double n1, double n2) {
        System.out.println(n1/n2);
    }
    
}
