package com.example;

import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

public abstract  class Vehiculo implements Valorable{
    
    private String matricula, marca, modelo;
    private int anioFabricacion, kilometraje;
    private double precio;
    private Persona propietario;
    private int tipoVehiculo;

    

    public Vehiculo(String matricula, String marca, String modelo, int anioFabricacion, int kilometraje, double precio, int tipoVehiculo,
            Persona propietario) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.precio = precio;
        this.tipoVehiculo = tipoVehiculo;
        this.propietario = propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

  
    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", anioFabricacion="
                + anioFabricacion + ", kilometraje=" + kilometraje + ", precio=" + precio + ", propietario="
                + propietario + "]";
    }

    public abstract TiposRiesgo calcularRiesgo();

    @Override
    public abstract double calcularDepreciacion();

    
}
