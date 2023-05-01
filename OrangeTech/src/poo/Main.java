package poo;

public class Main {

    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.setModelo("Honda");
        carro.setTanque(20);
        carro.setCor("Vermelho");
        
        System.out.println(carro);
    }
}
