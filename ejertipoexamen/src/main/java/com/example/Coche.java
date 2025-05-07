package com.example;

public abstract class Coche extends Vehiculo {

    private int numPuertas;
    
    

    public Coche(String matricula, String marca, String modelo, int anioFabricacion, int kilometraje, double precio, int tipoVehiculo,
            Persona propietario, int numPuertas, int capacidadMaletero) {
        super(matricula, marca, modelo, anioFabricacion, kilometraje, precio, tipoVehiculo, propietario);
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
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
    private enum tipoCombustible{GASOLINA, DIESEL, HIBRIDO, ELECTRICO};
    private int capacidadMaletero;
    private enum traccion{DELANTERA, TRASERA, X4X4};

    @Override
    public String toString() {
        return "Coche [numPuertas=" + numPuertas + ", capacidadMaletero=" + capacidadMaletero + ", informacion comun="
                + super.toString() + "]";
    };

    
    
}
