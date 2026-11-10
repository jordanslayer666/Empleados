/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo;

/**
 *
 * @author jorda
 */
public class persona {
    private int Edad;
    public int getEdad(){
        
        return Edad;
        
        
    }
            
    public void  setEdad(int nuevaEdad){
        
        
        if (nuevaEdad >0){
            
            this.Edad = nuevaEdad;
            
        }
        else {
            System.out.println("error  no puede ser negativo ");
        }
    }
    
}
