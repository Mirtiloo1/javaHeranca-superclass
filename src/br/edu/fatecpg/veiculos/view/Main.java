package br.edu.fatecpg.veiculos.view;

import br.edu.fatecpg.veiculos.model.Caminhao;
import br.edu.fatecpg.veiculos.model.Car;
import br.edu.fatecpg.veiculos.model.Moto;

public class Main {
    public static void main (String[] args){
    
        Moto moto = new Moto("Suzuki", "GSX", 2024, "Blue", 83);
        moto.carregarBag();
        moto.darGrau();
        
        Car car = new Car("Chevollet", "Onix", 2019, "Bordo", 5, "ltz");
        car.ligar();
        car.acelerar();
        car.ligarAr();
        car.desligar();
        
        Caminhao caminhao = new Caminhao ("Scania", "F-150", 2013, "Branco", 3, 2.20);
        caminhao.acelerar();
        caminhao.buzinar();
    }
}
