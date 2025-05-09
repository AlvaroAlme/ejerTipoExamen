package com.example;

import java.util.Calendar;

public class CocheDeportivo extends Coche {

    private double aceleracion;
    private int potenciaCV;
    private boolean tieneModoPista;

    public CocheDeportivo(){
        super();
    }
    

    public CocheDeportivo(String matricula, String marca, String modelo, int anioFabricacion, int kilometraje,
            double precio, Persona propietario, int numPuertas, int capacidadMaletero, double aceleracion,
            int potenciaCV, boolean tieneModoPista) {
        super(matricula, marca, modelo, anioFabricacion, kilometraje, precio, potenciaCV, propietario, numPuertas,
                capacidadMaletero);
        this.aceleracion = aceleracion;
        this.potenciaCV = potenciaCV;
        this.tieneModoPista = tieneModoPista;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public boolean isTieneModoPista() {
        return tieneModoPista;
    }

    public void setTieneModoPista(boolean tieneModoPista) {
        this.tieneModoPista = tieneModoPista;
    }

    @Override
    public TiposRiesgo calcularRiesgo() {
        int aniosExperiencia = getPropietario().aniosExperiencia();
        if(aniosExperiencia <5 && potenciaCV > 400){
            return TiposRiesgo.ALTORIESGO;
        } else if(aniosExperiencia > 5 && aniosExperiencia < 10) {
            return TiposRiesgo.MEDIORIESGO;
        } else if(aniosExperiencia > 10){
            return TiposRiesgo.BAJORIESGO;
        }

        return null;
    }

    @Override
    public String toString() {
        return "CocheDeportivo [aceleracion=" + aceleracion + ", potenciaCV=" + potenciaCV + ", tieneModoPista="
                + tieneModoPista + ", toString()=" + super.toString() + "]";
    }

    @Override
    public double calcularDepreciacion(){
        int edad = Calendar.getInstance().get(Calendar.YEAR) - getAnioFabricacion();
        double factorKilometraje = 0.9 * getKilometraje();
        if(potenciaCV > 400){
            factorKilometraje = 1.1 * getKilometraje();
        }

        double valorActual = getPrecio() * (Math.pow(0.85, edad)) * (1 - (getKilometraje() * factorKilometraje/100000));
        return valorActual;
        
    }
    
    
}
