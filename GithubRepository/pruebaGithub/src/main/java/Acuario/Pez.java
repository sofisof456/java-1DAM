package Acuario;

public class Pez extends AnimalMaritimo {
    private String color;
    private double velocidad_nado;
    private String especie;


    Pez(){};

    Pez (String color, double velocidad_nado, String especie){
        this.color = color;
        this.velocidad_nado = velocidad_nado;
        this.especie = especie;
    }

    Pez(String nombre, int edad, double tamaño, String habitat, String alimentacion,String color, double velocidad_nado, String especie) { //este solo te deja el hueco, el de valores por defecto es el de arriba
        super(nombre, edad, tamaño, habitat, alimentacion);
        this.color = color;
        this.velocidad_nado = velocidad_nado;
        this.especie = especie;
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public double getVelocidad_nado() {return velocidad_nado;}
    public void setVelocidad_nado(double velocidad_nado) {this.velocidad_nado = velocidad_nado;}

    public String getEspecie() {return especie;}
    public void setEspecie(String especie) {this.especie = especie;}

    @Override
    public String toString() {
        StringBuilder sb_pez = new StringBuilder();

        sb_pez.append("Color................: ").append(getColor()).append("\n");
        sb_pez.append("Velocidad_nado.......: ").append(getVelocidad_nado()).append("\n");
        sb_pez.append("Especie..............: ").append(getEspecie()).append("\n");

        return super.toString()+ sb_pez.toString();
    }
}
