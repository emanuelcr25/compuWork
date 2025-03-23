
package compuWork;



public class ReporteDesempeño {
    
         public static void main(String[] args){
       //instancia de la clase Departamento 
        Departamento depto = new Departamento("Ventas", 2);
        
        //instancia de la clase Empleado
        Empleado emp1 = new Empleado("Emanuel Correa", 12345, "fijo", 68);
        Empleado emp2 = new Empleado("Lizeth Garcia", 7894, "indefinido", 78);
        Empleado emp3 = new Empleado("Alejandro", 55446, "Temporal", 80);
        
        //agregar Empleado a Departamento
        depto.asignarEmpleado(emp1);
        depto.asignarEmpleado(emp2);
        depto.asignarEmpleado(emp3);
        depto.mostrarEmpleados();
             System.out.println("------------------------------------");
        //nueva instancia de la clase Empleado, sin argumentos 
        Empleado encontrar = new Empleado();
        
        //buscar la existencia del empleado por medio del id
        encontrar = depto.buscarEmpleado(7894);
        System.out.println("Empleado encontrado: " + encontrar);
             System.out.println("------------------------------------");
        //buscar la posicion del empleado por medio del id
        int index = depto.buscarIndiceEmpleado(12345);
        System.out.println("Indice del empleado " + index);
             System.out.println("------------------------------------");
        System.out.println("Desempeño del Departamento de " + depto.getNombre());
        System.out.println("promedio: " + depto.desempeñoPromedio());
             System.out.println("------------------------------------");
        System.out.println("Desempeño de los empleados:");
            for(Empleado empleado: depto.getEmpleados()){
                System.out.println(empleado.getNombre() + " : " + empleado.getDesempeño());
     }
    }

}
