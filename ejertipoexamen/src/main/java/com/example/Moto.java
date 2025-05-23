package com.example;

public abstract class Moto extends Vehiculo {

    public Moto(String matricula, String marca, String modelo, int anioFabricacion, int kilometraje, double precio,
            int tipoVehiculo, Persona propietario) {
        super(matricula, marca, modelo, anioFabricacion, kilometraje, precio, tipoVehiculo, propietario);
        //TODO Auto-generated constructor stub
    }

    public Moto(){
        super();
    }

    private int cilindrada, peso;
    private double alturaAsiento;
    private int tipoTransmision;
    private int tipoMoto;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAlturaAsiento() {
        return alturaAsiento;
    }

    public void setAlturaAsiento(double alturaAsiento) {
        this.alturaAsiento = alturaAsiento;
    }

    public int getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(int tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getTipoMoto(){
        return tipoMoto;
    }

    public void setTipoMoto(int tipoMoto){
        this.tipoMoto = tipoMoto;
    }

    

    @Override
    public String toString() {
        return "Moto [cilindrada=" + cilindrada + ", peso=" + peso + ", alturaAsiento=" + alturaAsiento
                + ", toString()=" + super.toString() + "]";
    }

    
    
    
    
}
