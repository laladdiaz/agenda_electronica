/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Carla
 */
public class controlador {
  
    public static int siguiente (int ind){
   //Procedimiento que recibie un entero que es utilizado como indice, el cual aumenta su valor, si el indice es menor a 9
        if(ind<9){
            ind++;
        }
        return ind;
    }
    
     public static int anterior (int ind){
    //Procedimiento que recibie un entero que es utilizado como indice, el cual disminuye su valor, si el indice es mayor a 0
        if(ind>0){
            ind--;
        }
        return ind;
    }
    
    
}
