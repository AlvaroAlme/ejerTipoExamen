package com.example;

public class MotoDeportiva extends Moto{

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
    
    
}
