package hospital;

public class Enfermero extends Empleados {
    private int numPacientes;

    Enfermero() {
    }

    Enfermero(String nombre, String NIF, Direccion direccion, double sueldoBase, String fechaAlta, int numPacientes) {
        super(nombre, NIF, direccion, sueldoBase, fechaAlta);
        this.numPacientes = numPacientes;
    }

    public int getNumPacientes() {
        return numPacientes;
    }

    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }

    @Override
    public double calcularSalarioReal() {
        double salarioEnfermero = 0;
        salarioEnfermero = getSueldoBase() * (1.01 * numPacientes);
        return salarioEnfermero;
    }

    @Override
    public String toString() {
        StringBuilder sbEnfermero = new StringBuilder();
        sbEnfermero.append("Numero de pacientes...:").append(numPacientes);
        return super.toString() + sbEnfermero;
    }
}
