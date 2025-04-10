package com.example;

public class CocheDeportivo extends Coche {

    private double aceleracion;
    private int potenciaCV;
    private boolean tieneModoPista;

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
    public int calcularRiesgo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "CocheDeportivo [aceleracion=" + aceleracion + ", potenciaCV=" + potenciaCV + ", tieneModoPista="
                + tieneModoPista + ", toString()=" + super.toString() + "]";
    }
    
    
}
