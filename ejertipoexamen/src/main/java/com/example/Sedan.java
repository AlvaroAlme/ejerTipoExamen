package com.example;

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

    // Lo de los enumerados. Además, el nombre no está bien. La primera en mayúscula como las clases.
    private enum nivelConfort {
        BASICO, MEDIO, PREMIUM
    }

    @Override
    public String toString() {
        return "Sedan [espacioInterior=" + espacioInterior + "informacion comun=" + super.toString() + "]";
    }
;

}
