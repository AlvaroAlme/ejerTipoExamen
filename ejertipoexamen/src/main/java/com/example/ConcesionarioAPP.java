package com.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcesionarioAPP {

    private List<Vehiculo> listadoVehiculo;
    private Map<String, Vehiculo> mapaVehiculo;

    public ConcesionarioAPP() {

        super();
        listadoVehiculo = new ArrayList<>();
        mapaVehiculo = new HashMap<>();
    }

    public List<Vehiculo> getListadoVehiculo() {
        return this.listadoVehiculo;
    }

    public boolean registrarVehiculo(Vehiculo vehiculo, Persona persona) {

        if(!mapaVehiculo.containsKey(vehiculo.getMatricula())){
            mapaVehiculo.put(vehiculo.getMatricula(), vehiculo);
            listadoVehiculo.add(vehiculo);
            return true;
        } else {
            return false;
        }
        
    }

    public List<Vehiculo> listadoVehiculos() {
       return listadoVehiculo;
    }


    public boolean asignarVehiculo(Persona comprador) {

        int añosComprador = Calendar.getInstance().get(Calendar.YEAR) - comprador.getAnioNacimiento();

        if (añosComprador < 18) {
            System.out.println("Debes ser mayor de edad para comprar un vehiculo");
        } else {
            return true;

        }
        return false;

    }

    
}
