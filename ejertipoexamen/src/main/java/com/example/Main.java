package com.example;

import com.example.menu.Menu;

public class Main {
    public static void main(String[] args) {
        ConcesionarioAPP concesionarioAPP = new ConcesionarioAPP();

        int opcion = 0;

        while(opcion != 7){

            String[] opciones = {"Registrar vehiculo", "Listar vehiculos", "Buscar vehiculo", "Asignar vehiculo", "Resumen riesgo", "Calcular depreciacion del vehiculo", "Salir"};
            opcion = Menu.preguntarOpcion(opciones);

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    listarVehiculo(concesionarioAPP);
                    break;
                case 6:
                    
                    break;
                case 7:
                System.out.println("Adios!");
                    break;
            
                default:
                    break;
            }
        }
    }


    public static void registrarVehiculo(){

        Vehiculo vehiculo = null;
        Coche coche = null;
        Persona persona = null;

        String matricula = Menu.preguntarTexto("Introduce la matricula del vehiculo: ");
        String marca = Menu.preguntarTexto("Introduce la marca del vehiculo: ");
        String modelo = Menu.preguntarTexto("Introduce el modelo del vehiculo: ");
        int anioFabricacion = Menu.preguntarEntero("Inrtoduce el año de fabricacion del vehiculo: ");
        int kilometraje = Menu.preguntarEntero("Inrtoduce el numero de kilometros del vehiculo: ");
        double precio = Menu.preguntarDecimal("introduce el precio del vehiculo: ");

        
        int tipoVehiculo = Menu.preguntarOpcion(new String[]{"Coche", "Moto", "Camion"});

        switch(tipoVehiculo){
            case 1:
                int numPuertas = Menu.preguntarEntero("Introduce el numero de puertas: ");
                int tipoCombustible = Menu.preguntarOpcion(new String[]{"GASOLINA", "DIESEL", "HIBRIDO", "ELECTRICO"});
                int capacidadMaletero = Menu.preguntarEntero("Introduce la capacidad del maletero en Litros: ");
                int traccion = Menu.preguntarOpcion(new String[]{"DELANTERA", "TRASERA", "4X4"});
                int tipoCoche = Menu.preguntarOpcion(new String[]{"Sedan", "SUV", "Deportivo"});

                switch (tipoCoche) {
                    case 1:
                        double espacioInterior = Menu.preguntarDecimal("Introduce el espacio interior en m2: ");
                        int nivelConfort = Menu.preguntarOpcion(new String[]{"Basico", "Medio", "Premium"});
                        Sedan sedan = new Sedan();
                        sedan.setMatricula(matricula);
                        sedan.setMarca(marca);
                        sedan.setModelo(modelo);


                        break;
                    case 2:
                        boolean capacidadOffroad = Menu.preguntaBoolean("¿Puede ir por fuera de carretera?: ");
                        double alturaLibreSuelo = Menu.preguntarDecimal("introduce la altura: ");
                        SUV suv = new SUV();
                        suv.setMatricula(matricula);
                        
                        break;
                    case 3:

                        break;
                    default:
                        break;
                }
            break;

            case 2:
            break;

            case 3:
            break;
        }
    }
    
    public static void listarVehiculo(ConcesionarioAPP concesionarioAPP){
        System.out.println("Este es el listado de vehiculos: ");
        concesionarioAPP.listadoVehiculos();
    }

    public static void resumenRiesgo(ConcesionarioAPP concesionarioAPP){

    }
}