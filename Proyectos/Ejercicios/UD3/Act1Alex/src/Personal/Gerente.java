package Personal;

public class Gerente extends Empleado {

    private Departamento departamento;
    private double bono;

    public Gerente(String nombre, int id, double salario, Departamento departamento, double bono) {
        super(nombre, id, salario);
        this.departamento = departamento;
        this.bono = bono;
    }

    public double getBono() {
        return this.bono;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.getBono();
    }
}
