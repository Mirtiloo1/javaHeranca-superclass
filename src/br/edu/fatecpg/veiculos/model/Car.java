package br.edu.fatecpg.veiculos.model;

public class Car extends Veiculo{
    public int num_passengers;
    public String type;

    public Car(String mod, String mk, int year, String col, int num_pass, String type){
        super(mod, mk, year, col);
        this.num_passengers = num_pass;
        this.type = type;
    }
    public void acelerar(){
        System.out.println("Acelerar");
    }
    public void ligarAr(){
        System.out.println("Ar Ligado");
    }
}
