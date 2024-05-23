
package workfinal;

import java.io.IOException;
import javax.swing.JOptionPane;


public class estudiantesdediseño 
{

    public estudiantesdediseño() 
    {
        
    }
    
    public void menudiseñadores() throws IOException
    {
        validaciones val=new validaciones();
        int op3=0;
        do
        {
           op3=val.validarmenudiseñadores();
           
           switch(op3)
           {
               case 1:
               insertardiseñadores diseñadores=new insertardiseñadores();
               diseñadores.llenardiseñadores();
               break;
               
               case 2:
               modificardiseñadores moddise=new modificardiseñadores();
               moddise.modificarprestamodiseñadores();
               break;
               
               case 3:
               devoluciontablets devtab=new devoluciontablets();
               devtab.devolucion();
               break;
               
               case 4:
               buscartablets btabs=new buscartablets();
               btabs.buscartabs();
               break;
               
               case 5:
               exportardiseñadores expdise=new exportardiseñadores();
               expdise.exportardise();
               break;
               
               case 6:
               importardiseñadores impdise=new importardiseñadores();
               impdise.importardise();
               break;
               
                   
           }
           if(op3>7)
           {
               JOptionPane.showMessageDialog(null, "NO EXISTE EL ITEM PARA EL VALOR DADO");
           }
                   
            
        }while(op3!=7);
    }
    
    
}
