package poo;

public class Carro {
    private String modelo;
    private String cor;
    private double capacidade_tanque;

    public Carro() {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidade_tanque = capacidade_tanque;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTanque() {
        return this.capacidade_tanque;
    }

    public void setTanque(double capacidade_tanque) {
        this.capacidade_tanque = capacidade_tanque;
    }

    public String toString() {
        return "\nModelo do veículo: " + this.getModelo() +
               "\nCor do veículo: " + this.getCor() +
               "\nCapacidade do tanque (em litros): " + this.getTanque(); 
    }
}
