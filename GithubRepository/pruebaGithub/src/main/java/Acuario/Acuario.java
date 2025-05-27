package Acuario;

import java.util.Random;
import java.util.Scanner;

public class Acuario {
    private AnimalMaritimo animalesarray[] = new AnimalMaritimo[50];
    private AnimalMaritimo animalesarray2[] = new AnimalMaritimo[20];

    public void generarAnimalesAleatorios() {
        Random rand = new Random();
        for (int i = 0; i < animalesarray2.length; i++) {
            if (rand.nextBoolean()) {
                animalesarray2[i] = new Pez();
            } else {
                animalesarray2[i] = new Medusa();
            }
        }
    }

    public void mostrarAnimales() {
        for (int i = 0; i < animalesarray2.length; i++) {
            System.out.println(animalesarray2[i].toString());
        }
    }

    String colores[] = {"verde", "azul"};
    double[] velocidades = {0.5, 2.0};
    String especies[] = {"especie1", "especie2", "especie3"};

    boolean[] transparencias = {true, false};
    String[] longitudes = {"corta", "mediana", "larga"};

    // le podiras meter mas cosas pero oye va tirandog, tiene cositas personalizadas
    public void generarAnimalesAleatorios2() {
        Random rand = new Random();
        for (int i = 0; i < animalesarray2.length; i++) {
            if (rand.nextBoolean()) {
                String color = colores[rand.nextInt(colores.length)];
                double velocidad = velocidades[rand.nextInt(velocidades.length)];
                String especie = especies[rand.nextInt(especies.length)];

                animalesarray2[i] = new Pez(color, velocidad, especie);

            } else {
                boolean transparencia = transparencias[rand.nextInt(transparencias.length)];
                String longitud = longitudes[rand.nextInt(longitudes.length)];

                animalesarray2[i] = new Medusa(transparencia, longitud);
            }
        }
    }

    public void mostrarAnimales2() {
        for (int i = 0; i < animalesarray2.length; i++) {
            System.out.println(animalesarray2[i].toString());
        }
    }

    public void generarListadoAnimales() {
        Random rand = new Random();
        for (int i = 0; i < animalesarray2.length; i++) {
            if (rand.nextBoolean()) {
                animalesarray2[i] = new Pez();
            } else {
                animalesarray2[i] = new Medusa();
            }
        }
    }

    public void listarAnimales() {
        for (int i = 0; i < animalesarray2.length; i++) {
            Random rand = new Random();
            if (rand.nextBoolean()) {
                String color = colores[rand.nextInt(colores.length)];
                double velocidad = velocidades[rand.nextInt(velocidades.length)];
                String especie = especies[rand.nextInt(especies.length)];

                animalesarray[i] = new Pez(color, velocidad, especie);

            } else {
                boolean transparencia = transparencias[rand.nextInt(transparencias.length)];
                String longitud = longitudes[rand.nextInt(longitudes.length)];

                animalesarray2[i] = new Medusa(transparencia, longitud);
            }

            System.out.println("POSICION ANIMAL: " + (i + 1));
            System.out.println(animalesarray2[i].toString());
        }
    }

    public AnimalMaritimo darAlta() {
        AnimalMaritimo vAmimal = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 1. Pez, 2. Medusa");
        int opcion = scanner.nextInt();
        System.out.println("Introduce nombre, edad, tamaño, habitat, alimentacion");
        String nombre = scanner.next();
        int edad = scanner.nextInt();
        double tamaño = scanner.nextInt();
        String habitat = scanner.next();
        String alimentacion = scanner.next();

        switch (opcion) {
            case 1:
                System.out.println("Introduce color, velocidad_nado, especie");
                String color = scanner.next();
                double velocidad_nado = scanner.nextDouble();
                String especie = scanner.next();
                Pez pezVariable = new Pez(nombre, edad, tamaño, habitat, alimentacion, color, velocidad_nado, especie);
                introducirAnimal(pezVariable);
                vAmimal = pezVariable;
                break;
            case 2:
                System.out.println("Introduce transparencia, longitud_tentaculos");
                boolean transparencia = scanner.nextBoolean();
                String longitud_tentaculos = scanner.next();
                Medusa medusaVariable = new Medusa(nombre, edad, tamaño, habitat, alimentacion, transparencia, longitud_tentaculos);
                introducirAnimal(medusaVariable);
                vAmimal = medusaVariable;
                break;
        }
        if (vAmimal != null) {
            System.out.println("¡Animal dado de alta!");
            System.out.println(vAmimal.toString());
        }
        return vAmimal;
    }

    public int dondeHayHueco() {
        int posicion = -1;
        for (int i = 0; i < animalesarray.length && posicion == -1; i++) {
            if (animalesarray[i] == null) {
                posicion = i;
            }
        }
        return posicion;
    }

    public boolean introducirAnimal(AnimalMaritimo animal) {
        boolean respuesta = false;
        int posicion = dondeHayHueco();
        if (posicion != -1) { // si esta de cero en adelante >=0
            animalesarray[posicion] = animal;
            respuesta = true;
        }
        return respuesta;
    }

    public void mostrar_altaBaja() {
        System.out.println("🐠 Animales actualmente en el acuario:");
        for (int i = 0; i < animalesarray.length; i++) {
            if (animalesarray[i] != null) {
                System.out.println((i + 1) + ". " + animalesarray[i].toString());
            }

        }
    }

    public boolean darBaja() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nombre del animal a dar de baja: ");
        String nombre = scanner.next();
        boolean respuesta = false;
        for (int i = 0; i < animalesarray.length; i++) {
            if (animalesarray[i] != null && animalesarray[i].getNombre().equals(nombre)) {
               animalesarray[i] = null; // esto es lo q borra lol
               respuesta = true;
            }
        }
        System.out.println(respuesta);
        return respuesta;
    }
}