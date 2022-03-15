package br.com.mercadolivre.model;

import br.com.mercadolivre.interfaces.Alimentos;

public abstract class Animal implements Alimentos<Animal> {

    public abstract void emitirSom();

    @Override
    public void comerAlimento(Animal animal, String comida) {
        System.out.println("O " + animal.getClass().getSimpleName() + " come " + comida);
    }
}
