package br.edu.fatecpg.loja.model;

public class Gerente extends  Vendedor implements Funcionario{
    public void fehcamentoDeCaixa(){
        System.out.println("Caixa Fechado com Sucesso");
    }
}
