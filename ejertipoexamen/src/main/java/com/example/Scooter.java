package com.example;

import java.util.Calendar;

public class Scooter extends Moto {
    public Scooter(String matricula, String marca, String modelo, int anioFabricacion, int kilometraje, double precio,
            int tipoVehiculo, Persona propietario) {
        super(matricula, marca, modelo, anioFabricacion, kilometraje, precio, tipoVehiculo, propietario);
        //TODO Auto-generated constructor stub
    }

    public Scooter(){
        super();
    }

    private int espacioBajoAsiento;

    public int getEspacioBajoAsiento() {
        return espacioBajoAsiento;
    }

    public void setEspacioBajoAsiento(int espacioBajoAsiento) {
        this.espacioBajoAsiento = espacioBajoAsiento;
    }

    @Override
    public TiposRiesgo calcularRiesgo() {
        int aniosExperiencia = getPropietario().aniosExperiencia();
        if(aniosExperiencia < 5){
            return TiposRiesgo.ALTORIESGO;
        } else if(aniosExperiencia > 5 && aniosExperiencia < 10){
            return TiposRiesgo.MEDIORIESGO;
        } else if(aniosExperiencia > 10){
            return TiposRiesgo.BAJORIESGO;
        }
        return null;
    }
    @Override
    public double calcularDepreciacion(){
        int edad = Calendar.getInstance().get(Calendar.YEAR) - getAnioFabricacion();
        double factorKilometraje = 1.2 * getKilometraje();
        double valorActual = getPrecio() * (Math.pow(0.85, edad)) * (1 - (getKilometraje() * factorKilometraje/100000));
        return valorActual;
        
    }

    @Override
    public String toString() {
        return "Scooter [espacioBajoAsiento=" + espacioBajoAsiento + ", toString()=" + super.toString() + "]";
    }


    
    
}
