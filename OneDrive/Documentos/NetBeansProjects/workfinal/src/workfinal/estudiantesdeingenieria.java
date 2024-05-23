package workfinal;

import java.io.IOException;
import javax.swing.JOptionPane;


public class estudiantesdeingenieria 
{

    public estudiantesdeingenieria() 
    {
        
    }
    
    public void menuingenieros() throws IOException
    {
        validaciones val=new validaciones();
        
        int op2=0;
        do
        {
           op2=val.validarmenuingenieros();
           
           switch(op2)
           {
               case 1:
               insertaringenieros insering=new insertaringenieros();
               insering.llenar();
               break;
               
               case 2:
               modificaringenieros mo=new modificaringenieros();
               mo.modificarprestamocomputadores();
               break;
               
               case 3:
               devolucioncomputadores dev=new devolucioncomputadores();
               dev.devoluciones();
               break;
               
               case 4:
               buscarcomputadores bus=new buscarcomputadores();
               bus.buscarpc();
               break;
               
               case 5:
               exportaringenieros exp=new exportaringenieros();
               exp.exportarin();
               break;
               
               case 6:
               importaringenieros imp=new importaringenieros();
               imp.importaring();
               break;
                
           }
           if(op2>7)
           {
               JOptionPane.showMessageDialog(null, "NO EXISTE EL ITEM PARA EL VALOR DADO");
           }
                   
            
        }while(op2!=7);
    }
    
    
}
