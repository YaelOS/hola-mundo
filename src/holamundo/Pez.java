/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author 980013684
 */
public class Pez {
    private int aletas;
    private String nombre;

    public Pez(int aletas, String nombre) {
        this.aletas = aletas;
        this.nombre = nombre;
    }

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pez{" + "aletas=" + aletas + ", nombre=" + nombre + '}';
    }
    
    
}
