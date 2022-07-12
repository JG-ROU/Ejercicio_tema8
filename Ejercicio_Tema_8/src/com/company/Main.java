package com.company;

public class Main {
    public static void main(String [] args){

        Persona joven = new Persona();
       joven.setEdad(17);
       joven.setNombre("Jorge");
       joven.setTelefono(123456);

       int edad = joven.getEdad();
       String nombre = joven.getNombre();
       int telefono = joven.getTelefono();

        System.out.println("Los datos solicitados de la Persona son:");
        System.out.println("");
        System.out.println(edad);
        System.out.println(nombre);
        System.out.println(telefono);



    }
}

class Persona{
    private  int edad;
    private String nombre;

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}