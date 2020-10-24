/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Clases.Validacion;
import java.util.Scanner;

/**
 *
 * @author Master Estampado SG
 */
public class Menu {
    
    public static void main(String[] args) {
    
      Scanner Leer = new Scanner(System.in);
      String rut;
      Validacion Validacion;
      
        System.out.println("Menu");
        System.out.println("");
        System.out.println("Ingrese el RUT a Validar: ");
        rut = Leer.nextLine();
        Validacion =new Validacion(rut);
        
        if(Validacion.Validacion_Certera() == true){
            System.out.println("El rut es Valido");
        }else{
            System.out.println("El rut es Invalido");
        }
        
    }
}    
