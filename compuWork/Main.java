
package compuWork;

import Interfas.Principal;

public class Main {
    public static void main(String[] args){
        
        
        Departamento departamento= new Departamento();
        ReporteDesempeño reporte= new ReporteDesempeño(departamento);
        Principal ventana= new Principal(reporte,departamento);
        ventana.setVisible(true);
    }
}
