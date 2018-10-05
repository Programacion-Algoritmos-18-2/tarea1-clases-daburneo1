/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author David
 */
public class Estudiante {
    public String nombre;
    public String apellido;
    public String sexo;
    
    public void nombre(){
        nombre = "David";
    }
    protected void apellido (){
        apellido = "Burneo";
    }
    private void sexo(){
        sexo = "Masculino";
    }

}

class PruebaEstudiante{
    public static void main(String[]args){
        Estudiante David = new Estudiante();
    }
} 
