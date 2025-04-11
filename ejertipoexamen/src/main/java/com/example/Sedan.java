package com.example;

import java.util.Calendar;

public class Sedan extends Coche {

    private double espacioInterior;

    public double getEspacioInterior() {
        return espacioInterior;
    }

    public void setEspacioInterior(double espacioInterior) {
        this.espacioInterior = espacioInterior;
    }

    @Override
    public TiposRiesgo calcularRiesgo() {
        int aniosExperiencia = getPropietario().aniosExperiencia();
        if (aniosExperiencia < 3) {
            return TiposRiesgo.ALTORIESGO;
        } else if (aniosExperiencia < 10) {
            return TiposRiesgo.MEDIORIESGO;
        } else {
            return TiposRiesgo.BAJORIESGO;
        }

    }

    private enum nivelConfort {
        BASICO, MEDIO, PREMIUM
    }

    @Override
    public String toString() {
        return "Sedan [espacioInterior=" + espacioInterior + "informacion comun=" + super.toString() + "]";
    }
;
    @Override
    public double calcularDepreciacion(){
        int edad = Calendar.getInstance().get(Calendar.YEAR) - getAnioFabricacion();
        double factorKilometraje = 0.8 * getKilometraje();
        double valorActual = getPrecio() * (Math.pow(0.85, edad)) * (1 - (getKilometraje() * factorKilometraje/100000));
        return valorActual;
    }

}
