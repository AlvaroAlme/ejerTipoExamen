package com.example;
import java.util.Calendar;

import com.example.Vehiculo.*;

public class ConcesionarioAPP {

    private Vehiculo [] listadoVehiculo;

    public ConcesionarioAPP(){

        super();
        listadoVehiculo = new Vehiculo[100];
    }

    public Vehiculo[] getListadoVehiculo(){
        return this.listadoVehiculo;
    }

    public boolean registrarVehiculo(Vehiculo vehiculo, Persona persona){

        for(int i = 0; i < listadoVehiculo.length; i++){
            if(listadoVehiculo[i] == null){
                listadoVehiculo[i] = vehiculo;
                return true;
            } else if(listadoVehiculo[i].getMatricula().equals(vehiculo.getMatricula())){
                throw new IllegalArgumentException("Ya existe un vehiculo con esta matricula");
            }
        }
        return false;

    }
    
    public void listadoVehiculos(){
        if(listadoVehiculo[0] == null){
            System.out.println("No existe ningun vehiculo registrado");
        } else {
            for(int i = 0; i < listadoVehiculo.length && listadoVehiculo[i] != null; i++){
                System.out.println(listadoVehiculo[i].toString());
            }
        }
    }

    public boolean asignarVehiculo(Persona comprador ){

        int añosComprador = Calendar.getInstance().get(Calendar.YEAR) - comprador.getAnioNacimiento();

        if(añosComprador < 18){
            System.out.println("Debes ser mayor de edad para comprar un vehiculo");
        } else {
            //TODO: aqui primero tengo que tener el vehiculo creado con todos los datos necesarios

    }
        return false;


}
}
