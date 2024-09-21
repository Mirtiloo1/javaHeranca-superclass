package br.edu.fatecpg.loja.view;

import br.edu.fatecpg.loja.model.Faxineiro;
import br.edu.fatecpg.loja.model.Funcionario;
import br.edu.fatecpg.loja.model.Gerente;
import br.edu.fatecpg.loja.model.Vendedor;

public class Main {
    public static void main(String[] args) {
//        Teste Funcionario, Vendedor, Faxineiro, Gerente
//        Funcionario func = new Funcionario() // Erro por ser uma interface
//        Vendedor ved = new Vendedor();  // Abstract não pode
    	
        Faxineiro fax = new Faxineiro();
        fax.solicitarMaterial();
        
        Gerente ger = new Gerente();
        ger.baterPonto();
        ger.realizarVenda();
        ger.fehcamentoDeCaixa();
    }
}
