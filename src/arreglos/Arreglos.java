
package arreglos;

import paquete2.Heroe;


public class Arreglos {

   
    public static void main(String[] args) {
        // como se utiliza una clase
     // crear objetos
     //una variable
     
        Heroe heroe=new Heroe();
        
        Enemigo enemigo=new Enemigo();
        
        // acediendo a atributos
        enemigo.nombre = "BORRE";
        heroe.nombre = "LUCHO DIAZ";
        System.out.println(heroe.nombre);
        
        //Acceder atributo privado
        heroe.setEdad(-5);
        //imprimir  valore de los atributos
        System.out.println(heroe.getEdad());
       
        
        
    }
    
}
