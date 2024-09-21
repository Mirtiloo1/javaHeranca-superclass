package br.edu.fatecpg.veiculos.model;

public class Caminhao extends Veiculo{
    public int capacidade_carga;
    public int altura;

    public Caminhao(String mod, String mrc, int ano, String cor, int cap_carga, double altura) {
        super(mod,mrc,ano,cor);
        this.capacidade_carga = cap_carga;
    }
    public void acelerar() {
        System.out.println("Ligando...");
        System.out.println("Ligado");
    }
    public void desligar() {
        System.out.println("Desligado");
    }
    public void buzinar() {
        System.out.println("Buzinando...");
    }
}