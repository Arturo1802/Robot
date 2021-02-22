/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectorobot;


public class Robot {
    private int id;
    private String nombre;
    private double precio;
    private double estatura;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    
    
    public void saludo(){
        Voz.hablar("Hello my name is"+nombre+" what can i do for you today?");
    }
    public void despedida(){
        Voz.hablar("See you later it was a great pleasure to serve you");
    }
}
