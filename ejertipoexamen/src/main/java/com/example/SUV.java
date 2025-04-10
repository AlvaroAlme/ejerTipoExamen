package com.example;

public class SUV extends Coche {

    private boolean capacidadOffroad;
    private double alturaLibreSuelo;

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
    public int calcularRiesgo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "SUV [capacidadOffroad=" + capacidadOffroad + ", alturaLibreSuelo=" + alturaLibreSuelo + ", toString()="
                + super.toString() + "]";
    }
    
    
}
