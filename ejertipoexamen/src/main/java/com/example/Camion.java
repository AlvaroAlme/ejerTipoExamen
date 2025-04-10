package com.example;

import java.util.Calendar;

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
    public TiposRiesgo calcularRiesgo() {
        int aniosExperiencia = getPropietario().aniosExperiencia();
        if(aniosExperiencia < 5){
            throw new IllegalArgumentException("El propietario no tiene la experiencia suficiente para conducir un camion");
        } else if(aniosExperiencia > 5 && aniosExperiencia < 10){
            return TiposRiesgo.MEDIORIESGO;
        } else if(aniosExperiencia > 10){
            return TiposRiesgo.BAJORIESGO;
        }
        return null;
    }

    @Override
    public double calcularDepreciacion(){
        int edad = Calendar.getInstance().get(Calendar.YEAR) - getAnioFabricacion() * (int) 0.9;
        double factorKilometraje = 0.6 * getKilometraje();

        double valorActual = getPrecio() * (Math.pow(0.85, edad)) * (1 - (getKilometraje() * factorKilometraje/100000));
        return valorActual;
        
    }

    
}
