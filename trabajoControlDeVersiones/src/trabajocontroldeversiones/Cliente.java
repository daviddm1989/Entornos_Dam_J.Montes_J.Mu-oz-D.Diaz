/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajocontroldeversiones;

/**
 *
 * @author david
 */
public class Cliente {
    
    private int id;
    private String nombre;
    private String direccion;
    private int numArticulosComprados;
    
    /**
     * Metodo constructor que se encarga de crear un cliente de forma aleatoria
     * @param i, que indica la id principal del cliente de forma ascendente
     */
public Cliente(int i){
    this.nombre=generarNombre();
    this.id=generarId(i);
    this.direccion=generarDireccion();
    this.numArticulosComprados=0;
}

   
    /**
     * Metodo que se encarga de darle un nombre aleatorio al cliente
     * @return el nombre que le asigna al cliente que se crea
     */
    public String generarNombre(){
        int i=(int) (Math.random()*5+1);
        switch(i){
            case 1:nombre="Maria";
            break;
            case 2:nombre="David";
            break;
            case 3:nombre="Zacarias";
            break;
            case 4:nombre="Pepe";
            break;
            case 5:nombre="Josefa";
            break;
            case 6:nombre="Jaime";
            break;
            case 7:nombre="Ana";
            break;
        }
        return nombre;
    }
    
    /**
     * Metodo que se encarga de generar de forma aleatorio una direccion para el cliente que se crea
     * @return la direccion que posee dicho cliente al momento de crearse
     */
    public String generarDireccion(){
        int i=(int) (Math.random()*5+1);
        switch(i){
            case 1:nombre="C/San Gregorio Nº 98";
            break;
            case 2:nombre="Av 1º de Mayo Nº 45";
            break;
            case 3:nombre="C/Toledo Nº 8";
            break;
            case 4:nombre="Plaza Paco Nº3";
            break;
            case 5:nombre="C/Cooperación Nº 1";
            break;
            case 6:nombre="C/Aduana Nº 13";
            break;
            case 7:nombre="C/Amargura Nº 57";
            break;
        }
        return nombre;
    }
    
    /**
     * Metodo que se encarga de generar una ID correspondiente al orden en el cual se ha creado el cliente
     * @param i, i que va de 0 - x (valor entero)
     * @return Devuelve la ID correspondiente a cada cliente
     */
    public int generarId(int i){
        this.id=i+1;
        return id;
    }
    
    /**
     * Metodo de modificacion del atributo id
     * @param id La nueva id correspondiente con el cliente
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo de modificacion del atributo nombre
     * @param nombre , nuevo nombre que sera asignado al cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo de modificacion del atributo direccion del cliente
     * @param direccion, la nueva direccion que el cliente tendra
     */
     public void setDireccion(String direccion){
        this.direccion=direccion;
    }
     
     /**
      * Metodo de consulta del atributo ID
      * @return id, que posee un cliente
      */
    public int getId() {
        return id;
    }
    
    /**
     * Metodo de consulta del atributo nombre
     * @return devuelve el nombre del cliente seleccionado
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo de consulta del atributo direccion
     * @return la direccion del cliente seleccionado
     */
    public String getDireccion() {
        return direccion;
    }

    
}
