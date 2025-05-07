package com.example;

import java.util.Calendar;

public class MotoDeportiva extends Moto{

    public MotoDeportiva(String matricula, String marca, String modelo, int anioFabricacion, int kilometraje,
            double precio, int tipoVehiculo, Persona propietario) {
        super(matricula, marca, modelo, anioFabricacion, kilometraje, precio, tipoVehiculo, propietario);
        //TODO Auto-generated constructor stub
    }

    private double velocidadMaxima;
    private boolean tieneQuickShifter;

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isTieneQuickShifter() {
        return tieneQuickShifter;
    }

    public void setTieneQuickShifter(boolean tieneQuickShifter) {
        this.tieneQuickShifter = tieneQuickShifter;
    }

    @Override
    public TiposRiesgo calcularRiesgo() {
        int aniosExperiencia = getPropietario().aniosExperiencia();
        if(aniosExperiencia < 3 && velocidadMaxima >250){
            return TiposRiesgo.ALTORIESGO;
        } else if((aniosExperiencia > 3 && aniosExperiencia < 10) || (aniosExperiencia > 10 && velocidadMaxima < 250)){
            return TiposRiesgo.MEDIORIESGO;
        } else if(aniosExperiencia > 10 && velocidadMaxima < 250){
            return TiposRiesgo.BAJORIESGO;
        } 
        return null;
    }

    @Override
    public double calcularDepreciacion(){
        int edad = Calendar.getInstance().get(Calendar.YEAR) - getAnioFabricacion();
        double factorKilometraje = 0.95 * getKilometraje();
        if(velocidadMaxima > 250){
            factorKilometraje = 1.1 * getKilometraje();
        }

        double valorActual = getPrecio() * (Math.pow(0.85, edad)) * (1 - (getKilometraje() * factorKilometraje/100000));
        return valorActual;
        
    }

    @Override
    public String toString() {
        return "MotoDeportiva [velocidadMaxima=" + velocidadMaxima + ", tieneQuickShifter=" + tieneQuickShifter
                + ", toString()=" + super.toString() + "]";
    }

    
   
    
    
}
