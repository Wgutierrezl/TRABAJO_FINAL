
package workfinal;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


public class insertardiseñadores 
{
    static List<diseñadores> listadis=new LinkedList<>();
    static List<ingenieros> listaingenieros=new LinkedList<>();

    public insertardiseñadores() 
    {
        listaingenieros=insertaringenieros.listaing;
    }
    
    public void llenardiseñadores() throws IOException
    {
        validaciones val=new validaciones();
        diseñadores dise=new diseñadores();
        JOptionPane.showMessageDialog(null,"ESTUDIANTES DE DISEÑO");
        int opcionprestamo=0;
        int ceduladis=0;
        
        dise.setNombre(JOptionPane.showInputDialog("DIGITE SU NOMBRE"));
        dise.setApellido(JOptionPane.showInputDialog("DIGITE SU APELLIDO"));
        dise.setCedula(val.validarcedulaingenierosdiseñadores());
        dise.setModalidad(JOptionPane.showInputDialog("DIGITE LA MODALIDAD EN LA CUAL SE ENCUENTRA"));
        dise.setSemestre(val.validarsemestre());
        dise.setAsignaturasc(val.validarasignaturas());
        dise.setTelefono(val.validartelefono());
        dise.setPromedio(val.validarpromedio());
        dise.setSerial(val.validarserial());
        
        ceduladis=dise.getCedula();
        
        if(calcularlista(ceduladis)==false)
        {
           
        
          if(calcular(ceduladis)==false)
          {
        
             listadis.add(new diseñadores(dise.getNombre(),
                                     dise.getApellido(),
                                     dise.getModalidad(),
                                     dise.getCedula(),
                                     dise.getSemestre(),
                                     dise.getTelefono(),
                                     dise.getAsignaturasc(),
                                     dise.getSerial(),
                                     dise.getPromedio()));
        
            opcionprestamo=val.validarprestamopctab();
        
            switch(opcionprestamo)
            {
                   case 1:
                   tablets tab=new tablets();
                   tab.llenartablets();
                   break;
            
                   case 2:
                   break;
                
            }
          }
          else
          {
               JOptionPane.showMessageDialog(null, "EL ESTUDIANTE DE DISEÑO YA SE ENCUENTRA REGISTRADO");
          }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "EL ESTUDIANTE YA SE ENCUENTRA REGISTRADO EN INGENIERIA");
        }
                
    }
    
    public boolean calcular(int c)
    {
        for(diseñadores item:listadis)
        {
            if(c==item.getCedula())
            {
                return true;
            }
        }
        return false;
    }
    
    
    public boolean calcularlista(int ced)
    {
        for(ingenieros item:listaingenieros)
        {
            if(ced==item.getCedula())
            {
                return true;
            }
        }
        return false;
        
    }
    
    
    
    
    
    
}
