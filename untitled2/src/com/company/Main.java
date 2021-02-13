package com.company;
import java.lang.String;
import java.util.Scanner;


class Persona {
    private String firstname, lastname, ci;
    private int id, age;
    String estado;

    public String getName(){
        return ( this.firstname + " " + this.lastname);
    }
    public void setName(String fN, String lN){
        this.firstname = fN;
        this.lastname = lN;
    }

    public void updateName(int id, String name ){
        this.firstname = name;
        this.id= id ;
    }

    public void delName(){
        this.firstname = null;
        this.lastname = null;
    }
}

class  Ciudadano extends Persona{
    String nacionalidad;

    public String getName(String c){
        return ( this.nacionalidad + ": " + this.estado );
    }


    public Ciudadano(){
        this.estado = "soltero";
        this.nacionalidad = "venezolano";
    }

    public Ciudadano(String C){
        this.nacionalidad = C;
        this.estado= "casado";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Ciudadano C;
        C = new Ciudadano();

        Ciudadano D;
        D = new Ciudadano("Español");

        C.setName("esteban", "Garcia");
        System.out.println( C.getName());
        System.out.println( C.estado);
        System.out.println( C.nacionalidad);
        D.setName("Jose","Rios");
        System.out.println(D.getName("c"));
        System.out.println(D.nacionalidad);
        System.out.println(D.estado);

        C.delName();
        System.out.println( C.getName());

        String actualizar;
        actualizar = teclado.nextLine();
        C.updateName(1,actualizar);
        System.out.println(C.getName());

    }
}