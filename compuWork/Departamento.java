
package compuWork;

import java.util.ArrayList;


public class Departamento {
    
    private String nombre;
    private ArrayList<Empleado> empleados;

    //Constructor de la clase
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        
    }
    public Departamento(){
   
    }
// Metodo set y get
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Solo metodo get para la lista
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    } 
    
    //metodo para asignar empleado a departamento
    public Empleado asignarEmpleado(Empleado empleado){        
        this.empleados.add(empleado);
        return empleado;
    }
    
    //metodo para modificar empleado
    public Empleado modificarEmpleado(int indice, Empleado empleado){
        if(indice >= 0 && indice < this.empleados.size()){
            this.empleados.set(indice, empleado);
            return empleado;
        }
        return null;
    }
    
    //metodo para desasignar empleado
    public Empleado desasignarEmpleado(long id){
        for(int i = 0; i < this.empleados.size(); i++){
            if(this.empleados.get(i).getId() == id){
                return this.empleados.remove(i);
            }
        }
        return null;
    }
    
    //metodo para buscar empleado
    public Empleado buscarEmpleado(long id){
        for(Empleado empleado: this.empleados){
            if(empleado.getId() == id){
                return empleado;
            }
        }
        return null;
    }
    
    //metodo para buscar el indice del empleado
    public int buscarIndiceEmpleado(long id){
        for(int i = 0; i < this.empleados.size(); i++){
            if(this.empleados.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    //metodo para mostrar
    public void mostrarEmpleados(){
        System.out.println("Empleados en el Departamento "+ nombre + ":");
        for(Empleado empleado: empleados){
            System.out.println(empleado);
    }
      
    }
    
    //metodo para calcular el desempeño del departamento
    public double desempeñoPromedio(){
        if(this.empleados.isEmpty()){
            return 0;
        }
        double promedio = 0;
        for(Empleado empleado: empleados){
            promedio += empleado.getDesempeño();
        }
        return promedio / empleados.size();
    }
}
