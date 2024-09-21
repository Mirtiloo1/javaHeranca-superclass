package br.edu.fatecpg.veiculos.model;

public class Moto extends  Veiculo{
    public int cavalos;
    public Moto(String mod, String mk, int year, String col, int cav) {
        super(mod, mk, year, col);
        this.cavalos = cav;
    }
    public void carregarBag(){
        System.out.println("Bag Carregada");
    }
    public void darGrau(){
        System.out.println("Raspando a placa");
    }
}
