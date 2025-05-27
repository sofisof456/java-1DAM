package hospital;

public abstract class Empleados {
    private String nombre;
    private String NIF;
    private Direccion direccion;
    private double sueldoBase;
    private String fechaAlta;

    Empleados(){}

    Empleados(String nombre, String NIF, Direccion direccion, double sueldoBase, String fechaAlta){
        this.nombre=nombre;
        this.NIF=NIF;
        this.direccion=direccion;
        this.sueldoBase=sueldoBase;
        this.fechaAlta=fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIF(String nombre) {
        this.NIF = NIF;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public abstract double calcularSalarioReal();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de empleado: ").append(getClass().getSimpleName()).append("\n");
        sb.append("Nombre................: ").append(nombre).append("\n");
        sb.append("Nombre................: ").append(nombre).append("\n");
        sb.append("NIF...................: ").append(NIF).append("\n");
        sb.append("Direccion.............: ").append(direccion).append("\n");
        sb.append("Sueldo base...........: ").append(sueldoBase).append("\n");
        sb.append("Fecha alta............: ").append(fechaAlta).append("\n");
        return sb.toString();
    }
}
