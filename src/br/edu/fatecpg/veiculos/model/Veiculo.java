package br.edu.fatecpg.veiculos.model;

//Super class (classe pai)
public class Veiculo {
    public String model;
    public String  mark;
    public int year;
    public String color;

    public Veiculo(String mod, String mk, int year, String col){
        this.model = mod;
        this.mark = mk;
        this.year = year;
        this.color = col;
    }

    public void ligar(){
        System.out.println("Carro Ligado");
    }
    public void desligar(){
        System.out.println("Carro Desligado");
    }

}
