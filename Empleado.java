
package compuWork;

public class Empleado {
    
    private String nombre;
    private String contrato;
    private long id;
    private double desempeño;

    public Empleado(String nombre, long id, String contrato, double desempeño) {
        this.nombre = nombre;
        this.id = id;
        this.contrato = contrato;
        this.desempeño = desempeño;
    }

    public Empleado() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public double getDesempeño() {
        return desempeño;
    }

    public void setDesempeño(double desempeño) {
        this.desempeño = desempeño;
    }
 
    @Override
    public String toString(){
        return "nombre: " + nombre + "\n" + "contrato: " +  contrato + "\n" + "id: " + id + "\n" + "desempeño: " + desempeño;
    }
    
}
