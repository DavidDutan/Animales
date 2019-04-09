/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Clases;

/**
 *
 * @author David
 */
public class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private String sexo;
    
    public Animal(String nombre, int edad, double peso, String sexo)
    {
      this.nombre=nombre;
      this.edad=edad;
      this.peso=peso;
      this.sexo=sexo;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
     public int getEdad()
    {
        return edad;
    }
     public void getEdad(int edad)
    {
        this.edad=edad;
    }
     public double getPeso()
    {
       return peso;
    }
    public void getPeso(double peso)
    {
        this.peso=peso;
    }
     public String getSexo()
    {
        return sexo;
    }
    public void getSexo(String sexo)
    {
        this.sexo=sexo;
    }
}
