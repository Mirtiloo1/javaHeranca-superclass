package br.edu.fatecpg.loja.model;

public abstract class Vendedor implements Funcionario{
    public void realizarVenda(){
        System.out.println("Venda Confirmada");
    }

    @Override
    public void baterPonto() {

    }
}
