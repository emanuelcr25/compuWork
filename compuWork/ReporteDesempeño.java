
package compuWork;

import java.util.ArrayList;



public class ReporteDesempeño {
    
    private String nombre;
    private Departamento dept;
    
public ReporteDesempeño(Departamento dept){
    this.nombre= nombre;
    this.dept= new Departamento(nombre);
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

public Departamento nombreDepartamento(String nombre){
    return this.dept= new Departamento(nombre);
}
    
public Empleado agregarEmpleado(Empleado empleado){
    return this.dept.asignarEmpleado(empleado);
}

public Empleado modificarEmpleado(int indice, Empleado empleado){
    return this.dept.modificarEmpleado(0, empleado);
}

public Empleado desagregarEmpleado(long id){
    return this.dept.desasignarEmpleado(id);
}

public Empleado buscarEmpleado(long id){
    return this.dept.buscarEmpleado(id);
}

public ArrayList<Empleado> mostrarEmpleado(){
    return this.dept.getEmpleados();
}

public double desempeñoEmpleado(){
    return this.dept.desempeñoPromedio();
}
}
