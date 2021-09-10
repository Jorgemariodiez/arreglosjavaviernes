
package paquete2;


public class Heroe {
    // Datos = Atributos =>Variables
    public String nombre;
    private int edad;
    //metodos= acciones = Funciones

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>1 && edad<100){
          
       
        this.edad = edad;
    }else{
            System.out.println("Edad invalida");
}
    }
    
    
    public Heroe() {
    }
    
    
    
    
    
}
