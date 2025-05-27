package hospital;

public class Medico extends Empleados {
    private String especialidad;
    private int guardia;

    Medico(){}

    Medico(String nombre, String NIF, Direccion direccion, double sueldoBase, String fechaAlta, String especialidad, int guardia){
        super( nombre, NIF, direccion, sueldoBase, fechaAlta);
        this.especialidad=especialidad;
        this.guardia=guardia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getGuardia() {
        return guardia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setGuardia(int guardia) {
        this.guardia = guardia;
    }

    @Override
    public double calcularSalarioReal() {
        double salarioMedico=0;
        salarioMedico = getSueldoBase() * (1.05 * guardia);
        return salarioMedico;
    }

    @Override
    public String toString() {
        StringBuilder sbMedico = new StringBuilder();
        sbMedico.append("Especialidad..........:").append(especialidad);
        sbMedico.append("Numero de Guardias....:").append(guardia);
        return super.toString()+sbMedico;
    }
}
