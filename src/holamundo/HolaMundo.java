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
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pez fishi=new Pez(4, "Tripito");
        System.out.println("Hola mundo");
	System.out.println("Hola mundo ");  //by: Marco, este es con bloc de notas
        System.out.println("no se si este aparesca");  //este es con NetBeans
        System.out.println("..............");
	System.out.println("Hola mundo ");  //by: Marco
        
        System.out.println("Mi pez se llama: "+fishi.getNombre()+" él tiene: "+fishi.getAletas()+" aletas.");
    }
    
}
