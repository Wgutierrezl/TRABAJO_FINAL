package workfinal;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Trabajofinal {

    public static void main(String[] args) throws IOException {
    validaciones val=new validaciones();
    
    
    
        int op=0;
        do
        {
           op=val.validarmenu();
           
           switch(op)
           {
               case 1:
               estudiantesdeingenieria esting=new estudiantesdeingenieria();
               esting.menuingenieros();
               break;
               
               case 2:
               estudiantesdediseño estdis=new estudiantesdediseño();
               estdis.menudiseñadores();
               break;
               
               case 3:
               mostrarinventario mos=new mostrarinventario();
               mos.prestamoestudiantes();
               break;
              
           }
           if(op>5)
           {
               JOptionPane.showMessageDialog(null, "NO HAY VALORES PARA ESE ITEM");
           }
        }while(op!=4);
    }
}
