package com.example;

import java.util.Calendar;

public class Persona {
    
    private String nombre, apellidos, DNI;
    private int fechaExpedicionCarnet;
    private int anioNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getFechaExpedicionCarnet() {
        return fechaExpedicionCarnet;
    }

    public void setFechaExpedicionCarnet(int fechaExpedicionCarnet) {
        this.fechaExpedicionCarnet = fechaExpedicionCarnet;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int aniosExperiencia(){
            return Calendar.getInstance().get(Calendar.YEAR) - fechaExpedicionCarnet;
    }
}
