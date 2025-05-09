package com.example;

public abstract class Coche extends Vehiculo {

    private int numPuertas;
    private int capacidadMaletero;
    private int tipoCombustible;
    private int traccion;
    private int tipoCoche;
    
    public Coche(){
        super();
    }

    public Coche(String matricula, String marca, String modelo, int anioFabricacion, int kilometraje, double precio, int tipoVehiculo,
            Persona propietario, int numPuertas, int capacidadMaletero) {
        super(matricula, marca, modelo, anioFabricacion, kilometraje, precio, tipoVehiculo, propietario);
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
    }

    public Coche(String matricula, String marca, String modelo, int anioFabricacion, int kilometraje, double precio, int tipoVehiculo, Persona propietario) {
        super(matricula, marca, modelo, anioFabricacion, kilometraje, precio, tipoVehiculo, propietario);
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    
    
    public int getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(int tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getTraccion() {
        return traccion;
    }

    public void setTraccion(int traccion) {
        this.traccion = traccion;
    }

    public int getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(int tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    @Override
    public String toString() {
        return "Coche [numPuertas=" + numPuertas + ", capacidadMaletero=" + capacidadMaletero + ", tipoCombustible="
                + tipoCombustible + ", traccion=" + traccion + ", tipoCoche=" + tipoCoche + "]";
    }


    

    
    
}
