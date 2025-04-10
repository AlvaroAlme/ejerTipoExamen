package com.example;

public class Camion extends Vehiculo {

    private double capacidadCarga;
    private int numEjes, potenciaMotor;
    private double longitudRemolque;

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public double getLongitudRemolque() {
        return longitudRemolque;
    }

    public void setLongitudRemolque(double longitudRemolque) {
        this.longitudRemolque = longitudRemolque;
    }

    @Override
    public int calcularRiesgo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
