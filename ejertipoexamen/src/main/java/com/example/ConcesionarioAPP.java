package com.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcesionarioAPP {

    private final List<Vehiculo> listadoVehiculo;
    private final Map<String, Vehiculo> mapaVehiculo;

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

    public Vehiculo buscarVehiculo(String matricula) {
        return mapaVehiculo.get(matricula);
    }


    public boolean asignarVehiculo(Persona comprador, String matricula) {
        int añosComprador = Calendar.getInstance().get(Calendar.YEAR) - comprador.getAnioNacimiento();
    
        if (añosComprador < 18) {
            System.out.println("Debes ser mayor de edad para comprar un vehículo");
            return false;
        }
    
        Vehiculo vehiculo = buscarVehiculo(matricula);
    
        if (vehiculo != null) {
            vehiculo.setPropietario(comprador);
            System.out.println("Vehículo asignado correctamente.");
            return true;
        } else {
            System.out.println("No se encontró el vehículo con matrícula " + matricula);
            return false;
        }
    }

    public double calcularDepreciacion(String matricula) throws IllegalArgumentException{
       
        if(!mapaVehiculo.containsKey(matricula)){
            throw new IllegalArgumentException("La matricula introducida no existe");
        } else {
            return mapaVehiculo.get(matricula).calcularDepreciacion();
        }


    }

    public String resumenRiesgo(String matricula) throws IllegalArgumentException {
        if(!mapaVehiculo.containsKey(matricula)){
            throw new IllegalArgumentException("La matricula introducida no existe");
        } else {

            return mapaVehiculo.get(matricula).calcularRiesgo().toString();
        }
    }
    

    
}
