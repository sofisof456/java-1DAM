package Acuario;

import java.util.Random;

public abstract class AnimalMaritimo {
    private String nombre;
    private int edad;
    private double tamaño;
    private String habitat;
    private String alimentacion;

    public static final String[] nombres = {"Mico", "Noa", "Chispa", "Nina", "Rayo", "Toby", "Chiqui", "Rocky", "Plutón", "Thor", "Chico", "Simba", "Bruno", "Lola", "Nico", "Coco", "Bimba", "Linda", "Max"};
    public static final String[] habitats = {"Pacifico", "Atlantico", "Indico", "Glacial Artico", "Glacial Antartico"};
    public static final String[] alimentos={"fresco","pienso"};
    AnimalMaritimo() {
    Random rand = new Random();
        this.edad = rand.nextInt(0, 10);
        this.tamaño = rand.nextDouble(0,200);
        this.habitat = habitats[rand.nextInt(0, habitats.length)];
        this.alimentacion = alimentos[rand.nextInt(0, alimentos.length)];
    }

    AnimalMaritimo(String nombre, int edad, double tamaño, String habitat, String alimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamaño=tamaño;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public double getTamaño() {return tamaño;}
    public void setTamaño(double tamaño) {this.tamaño = tamaño;}

    public String getHabitat() {return habitat;}
    public void setHabitat(String habitat) {this.habitat = habitat;}

    public String getAlimentacion() {return alimentacion;}
    public void setAlimentacion(String alimentacion) {this.alimentacion = alimentacion;}

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Tipo de animal: ").append(getClass().getSimpleName()).append("\n");
        sb.append("Nombre...............: ").append(getNombre()).append("\n");
        sb.append("Edad.................: ").append(getEdad()).append("\n");
        sb.append("Tamaño...............:").append(getTamaño()).append("\n");
        sb.append("Habitat..............:").append(getHabitat()).append("\n");
        sb.append("Alimentacion.........:").append(getAlimentacion()).append("\n");

        return sb.toString();
    }

}

