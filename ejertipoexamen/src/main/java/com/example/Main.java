package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.menu.Menu;

public class Main {
    public static void main(String[] args) {
        /*
        ConcesionarioAPP concesionarioAPP = new ConcesionarioAPP();

        int opcion = 0;

        while (opcion != 7) {

            String[] opciones = { "Registrar vehiculo", "Listar vehiculos", "Buscar vehiculo", "Asignar vehiculo",
                    "Resumen riesgo", "Calcular depreciacion del vehiculo", "Salir" };
            opcion = Menu.preguntarOpcion(opciones);

            switch (opcion) {
                case 1:
                    registrarVehiculo(concesionarioAPP);

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
            */

        int numero = 6;
        sumarDos(numero);
        System.out.println(numero);

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        for(Integer num : lista) {
            System.out.println(num);
        }
        modificarLista(lista);
        for(Integer num : lista) {
            System.out.println(num);
        }

        Coche coche = new Sedan();
        coche.setMarca("Ferrari");
    }

    public static void sumarDos(int numero) {
        numero = numero + 2;
    }

    public static void modificarLista(List<Integer> lista) {
        lista.add(2);
    }

    public static void registrarVehiculo(ConcesionarioAPP concesionarioAPP) {

        
        Persona persona = null;
        Vehiculo vehiculo = null;

        String matricula = Menu.preguntarMatricula("Introduce la matricula del vehiculo: ");
        String marca = Menu.preguntarTexto("Introduce la marca del vehiculo: ");
        String modelo = Menu.preguntarTexto("Introduce el modelo del vehiculo: ");
        int anioFabricacion = Menu.preguntarEntero("Inrtoduce el año de fabricacion del vehiculo: ");
        int kilometraje = Menu.preguntarEntero("Inrtoduce el numero de kilometros del vehiculo: ");
        double precio = Menu.preguntarDecimal("introduce el precio del vehiculo: ");

        int tipoVehiculo = Menu.preguntarOpcion(new String[] { "Coche", "Moto", "Camion" });

        switch (tipoVehiculo) {
            case 1:
                int numPuertas = Menu.preguntarEntero("Introduce el numero de puertas: ");
                int tipoCombustible = Menu
                        .preguntarOpcion(new String[] { "GASOLINA", "DIESEL", "HIBRIDO", "ELECTRICO" });
                int capacidadMaletero = Menu.preguntarEntero("Introduce la capacidad del maletero en Litros: ");
                int traccion = Menu.preguntarOpcion(new String[] { "DELANTERA", "TRASERA", "4X4" });
                int tipoCoche = Menu.preguntarOpcion(new String[] { "Sedan", "SUV", "Deportivo" });

                switch (tipoCoche) {
                    case 1:
                        double espacioInterior = Menu.preguntarDecimal("Introduce el espacio interior en m2: ");
                        int nivelConfort = Menu.preguntarOpcion(new String[] { "Basico", "Medio", "Premium" });

                        Sedan sedan = new Sedan();
                        sedan.setMatricula(matricula);
                        sedan.setMarca(marca);
                        sedan.setModelo(modelo);
                        sedan.setAnioFabricacion(anioFabricacion);
                        sedan.setKilometraje(kilometraje);
                        sedan.setPrecio(precio);
                        sedan.setNumPuertas(numPuertas);
                        sedan.setCapacidadMaletero(capacidadMaletero);
                        sedan.setEspacioInterior(espacioInterior);
                        sedan.setTipoVehiculo(tipoVehiculo);
                        sedan.setTipoCombustible(tipoCombustible);
                        sedan.setTraccion(traccion);
                        sedan.setTipoCoche(tipoCoche);

                        vehiculo = sedan;

                        break;
                    case 2:
                        boolean capacidadOffroad = Menu.preguntaBoolean("¿Puede ir por fuera de carretera?: ");
                        double alturaLibreSuelo = Menu.preguntarDecimal("introduce la altura: ");

                        SUV suv = new SUV();
                        suv.setMatricula(matricula);
                        suv.setMarca(marca);
                        suv.setModelo(modelo);
                        suv.setAnioFabricacion(anioFabricacion);
                        suv.setKilometraje(kilometraje);
                        suv.setPrecio(precio);
                        suv.setTipoVehiculo(tipoVehiculo);
                        suv.setNumPuertas(numPuertas);
                        suv.setTipoCombustible(tipoCombustible);
                        suv.setCapacidadMaletero(capacidadMaletero);
                        suv.setTraccion(traccion);
                        suv.setTipoCoche(tipoCoche);
                        suv.setCapacidadOffroad(capacidadOffroad);
                        suv.setAlturaLibreSuelo(alturaLibreSuelo);

                        vehiculo = suv;
                        break;
                    case 3:
                        double aceleracion = Menu.preguntarDecimal("Aceleracion 0 a 100 en segundos: ");
                        int potenciaCV = Menu.preguntarEntero("Introduce los caballos: ");
                        boolean tieneModoPista = Menu.preguntaBoolean("¿El coche cuenta con modo pista?");

                        CocheDeportivo cocheDeportivo = new CocheDeportivo();
                        cocheDeportivo.setMatricula(matricula);
                        cocheDeportivo.setMarca(marca);
                        cocheDeportivo.setModelo(modelo);
                        cocheDeportivo.setAnioFabricacion(anioFabricacion);
                        cocheDeportivo.setKilometraje(kilometraje);
                        cocheDeportivo.setPrecio(precio);
                        cocheDeportivo.setTipoVehiculo(tipoVehiculo);
                        cocheDeportivo.setNumPuertas(numPuertas);
                        cocheDeportivo.setTipoCombustible(tipoCombustible);
                        cocheDeportivo.setCapacidadMaletero(capacidadMaletero);
                        cocheDeportivo.setTraccion(traccion);
                        cocheDeportivo.setTipoCoche(tipoCoche);
                        cocheDeportivo.setAceleracion(aceleracion);
                        cocheDeportivo.setPotenciaCV(potenciaCV);
                        cocheDeportivo.setTieneModoPista(tieneModoPista);

                        concesionarioAPP.registrarVehiculo(cocheDeportivo,persona);

                        break;

                }
                break;

            case 2:
                int cilindrada = Menu.preguntarEntero("introduce la cilindrada de la moto: ");
                int peso = Menu.preguntarEntero("Introduce el peso de la moto: ");
                double alturaAsiento = Menu.preguntarDecimal("Introduce la altura del asiento: ");
                int tipoTransmision = Menu.preguntarEntero("¿Cual es el tipo de transmision?: ");
                int tipoMoto = Menu.preguntarOpcion(new String[] { "Scooter", "Deportiva" });

                switch (tipoMoto) {
                    case 1:
                        int espacioBajoAsiento = Menu
                                .preguntarEntero("Introduce la capacidad bajo el asiento en litros: ");

                        Scooter scooter = new Scooter();
                        scooter.setMatricula(matricula);
                        scooter.setMarca(marca);
                        scooter.setModelo(modelo);
                        scooter.setAnioFabricacion(anioFabricacion);
                        scooter.setKilometraje(kilometraje);
                        scooter.setPrecio(precio);
                        scooter.setTipoVehiculo(tipoVehiculo);
                        scooter.setCilindrada(cilindrada);
                        scooter.setPeso(peso);
                        scooter.setAlturaAsiento(alturaAsiento);
                        scooter.setTipoTransmision(tipoTransmision);
                        scooter.setEspacioBajoAsiento(espacioBajoAsiento);

                        vehiculo = scooter;

                        break;

                    case 2:
                        double velocidadMaxima = Menu.preguntarDecimal("introduce la velocidad maxima: ");
                        boolean tieneQuickShifter = Menu.preguntaBoolean("La moto dispone de QuickShifter?: ");

                        MotoDeportiva motoDeportiva = new MotoDeportiva();
                        motoDeportiva.setMatricula(matricula);
                        motoDeportiva.setMarca(marca);
                        motoDeportiva.setModelo(modelo);
                        motoDeportiva.setAnioFabricacion(anioFabricacion);
                        motoDeportiva.setKilometraje(kilometraje);
                        motoDeportiva.setPrecio(precio);
                        motoDeportiva.setTipoVehiculo(tipoVehiculo);
                        motoDeportiva.setCilindrada(cilindrada);
                        motoDeportiva.setPeso(peso);
                        motoDeportiva.setAlturaAsiento(alturaAsiento);
                        motoDeportiva.setTipoTransmision(tipoTransmision);
                        motoDeportiva.setVelocidadMaxima(velocidadMaxima);
                        motoDeportiva.setTieneQuickShifter(tieneQuickShifter);

                        concesionarioAPP.registrarVehiculo(motoDeportiva,persona);

                        break;
                }
                break;

            case 3:
                double capacidadCarga = Menu.preguntarDecimal("Introduce la capacidad de carga del camion: ");
                int numEjes = Menu.preguntarEntero("Introduce el numero de ejes (minimo 2): ");

                Camion camion = new Camion();
                camion.setMatricula(matricula);
                camion.setMarca(marca);
                camion.setModelo(modelo);
                camion.setAnioFabricacion(anioFabricacion);
                camion.setKilometraje(kilometraje);
                camion.setPrecio(precio);
                camion.setTipoVehiculo(tipoVehiculo);
                camion.setCapacidadCarga(capacidadCarga);
                camion.setNumEjes(numEjes);

                concesionarioAPP.registrarVehiculo(camion,persona);

                break;
        }
        
        concesionarioAPP.registrarVehiculo(vehiculo, null);
    }

    public static void listarVehiculo(ConcesionarioAPP concesionarioAPP) {
        System.out.println("Este es el listado de vehiculos: ");
        concesionarioAPP.listadoVehiculos();
    }

    public static void asignarVehiculo(ConcesionarioAPP concesionarioAPP) {

        String nombrePropietario = Menu.preguntarTexto("Introduce el nombre del propietario: ");
        String apellidosPropietario = Menu.preguntarTexto("Introduce los apellidos del propoietario: ");
        String dniPropietario = Menu.preguntarDNI("Introduce el DNI del propìetario: ");
        int fechaExpedicionCarnet = Menu.preguntarEntero("Introduce el año de caducidad del carnet: ");
        int anioNacimiento = Menu.preguntarEntero("Introduce tu año de nacimiento: ");

        Persona persona = new Persona();
        persona.setNombre(nombrePropietario);
        persona.setApellidos(apellidosPropietario);
        persona.setDNI(dniPropietario);
        persona.setFechaExpedicionCarnet(fechaExpedicionCarnet);
        persona.setAnioNacimiento(anioNacimiento);

        String matricula = Menu.preguntarMatricula("Introduce la matricula del vehiculo que compras: ");

        concesionarioAPP.asignarVehiculo(persona, matricula);

    }

    public static void calcularDepreciacion(ConcesionarioAPP concesionarioAPP) {

        String matricula = Menu.preguntarMatricula("Introduce una matricula: ");

        try {
            double calculoDepreciacion = concesionarioAPP.calcularDepreciacion(matricula);
            System.out.println("Calculo de la depreciacion :" + calculoDepreciacion);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void resumenRiesgo(ConcesionarioAPP concesionarioAPP){
        String matricula = Menu.preguntarMatricula("introduce una matricula: ");

        try{
            String resumenRiesgo = concesionarioAPP.resumenRiesgo(matricula);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}