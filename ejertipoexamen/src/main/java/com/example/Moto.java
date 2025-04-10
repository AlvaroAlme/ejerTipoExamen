package com.example;

public abstract class Moto extends Vehiculo {

    private int cilindrada, peso;
    private double alturaAsiento;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAlturaAsiento() {
        return alturaAsiento;
    }

    public void setAlturaAsiento(double alturaAsiento) {
        this.alturaAsiento = alturaAsiento;
    }

    // TODO: Lo de los enumerados. En su propio fichero.
    private enum tipoTransmision{MANUAL, AUTOMATICA};

    // TODO: Falta el toString.
    
    
}
