/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

/**
 *
 * @author jorda
 */
public class Principal {
  public static void main(String[] args){
      
      Mascota mascota1 = new Mascota();
      
      
      mascota1.setNombre("toby");
      mascota1.setEspecie("perro");
      mascota1.setEdad(5);
      
      System.out.println("datos de la mascota:");
      System.out.println("nombre" + mascota1.getNombre());
      System.out.println("Especie:" + mascota1.getEspecie());
      System.out.println("Edad:" + mascota1.getEdad());
      
  }    
}
