package com.example;

import java.util.Calendar;

public class SUV extends Coche {

    private boolean capacidadOffroad;
    private double alturaLibreSuelo;
    private enum Traccion { DELANTERA, TRASERA, X4X4 };

    public boolean isCapacidadOffroad() {
        return capacidadOffroad;
    }

    public void setCapacidadOffroad(boolean capacidadOffroad) {
        this.capacidadOffroad = capacidadOffroad;
    }

    public double getAlturaLibreSuelo() {
        return alturaLibreSuelo;
    }

    public void setAlturaLibreSuelo(double alturaLibreSuelo) {
        this.alturaLibreSuelo = alturaLibreSuelo;
    }

   
    @Override
    public String toString() {
        return "SUV [capacidadOffroad=" + capacidadOffroad + ", alturaLibreSuelo=" + alturaLibreSuelo + ", toString()="
                + super.toString() + "]";
    }

    @Override
    public TiposRiesgo calcularRiesgo(){
        int aniosExperiencia = getPropietario().aniosExperiencia();
       if(Traccion.X4X4.equals(Traccion.X4X4) && aniosExperiencia > 3){
            return TiposRiesgo.BAJORIESGO;
       } else if(Traccion.X4X4.equals(Traccion.X4X4) && aniosExperiencia < 3){
        return TiposRiesgo.ALTORIESGO;
       } else if(Traccion.DELANTERA.equals(Traccion.DELANTERA) && aniosExperiencia <3){
        return TiposRiesgo.ALTORIESGO;
       } else if(Traccion.DELANTERA.equals(Traccion.DELANTERA) && (aniosExperiencia >3 && aniosExperiencia <10)){
        return TiposRiesgo.MEDIORIESGO;
       } else if(Traccion.DELANTERA.equals(Traccion.DELANTERA) && aniosExperiencia >10){
        return TiposRiesgo.BAJORIESGO;
       } else if(Traccion.TRASERA.equals(Traccion.TRASERA) && aniosExperiencia <3){
        return TiposRiesgo.ALTORIESGO;
       } else if(Traccion.TRASERA.equals(Traccion.TRASERA) && (aniosExperiencia >3 && aniosExperiencia <10)){
        return TiposRiesgo.MEDIORIESGO;
       } else if(Traccion.TRASERA.equals(Traccion.TRASERA) && aniosExperiencia >10){
        return TiposRiesgo.BAJORIESGO;
       }
       return null;
       
       
    }
    @Override
    public double calcularDepreciacion(){
        int edad = Calendar.getInstance().get(Calendar.YEAR) - getAnioFabricacion();
        double factorKilometraje = 0.75 * getKilometraje();
        if(Traccion.X4X4.equals(Traccion.X4X4)){
            factorKilometraje = 1.05 * getKilometraje();
        }

        double valorActual = getPrecio() * (Math.pow(0.85, edad)) * (1 - (getKilometraje() * factorKilometraje/100000));
        return valorActual;
        
    }
    
    
}
