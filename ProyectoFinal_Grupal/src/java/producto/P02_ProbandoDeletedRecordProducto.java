/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

import daogenerico.ErroresGenerales;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matias
 */
public class P02_ProbandoDeletedRecordProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       producto productoeliminar = new producto(Long.valueOf(7),"sprite","0","0","30/10/2019",Long.valueOf(2));
       productoDAO MyDAO = new productoDAO();
        try {
            if (MyDAO.DeleteRecord(productoeliminar))
            {
                System.out.println("ELIMINADO");
            }
            else
            {
                System.out.println("NO SE ENCONTRO");
            }
        } 
        catch (ErroresGenerales ex) 
        {
            System.out.println(ex.getMensajeDeErrorSalida());
            System.out.println("HUBO UN ERROR !!! " + ex.getMensajeDeErrorGeneral());
        }
        
    }
    
}