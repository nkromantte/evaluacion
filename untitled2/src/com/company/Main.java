package com.company;
import java.lang.String;
import java.util.Scanner;


class Matriz{
        public int matriz[][];
        public int matriz2[][];
        public int matriz3[][];
        public int Mresultado[][];

        public Scanner teclado = new Scanner(System.in);

        //opc1
        public void setSuma(int x){
            boolean e = false;
            System.out.println("matriz uno");
            for(int f=0;f<this.matriz.length;f++) {
                for (int c = 0; c < this.matriz[f].length; c++) {
                    System.out.println("Agregue valor");
                    this.matriz[f][c] = this.teclado.nextInt();
                }
            }
            System.out.println("matriz dos");
            for(int f=0;f<this.matriz2.length;f++) {
                for (int c = 0; c < this.matriz2[f].length; c++) {
                    System.out.println("Agregue valor");
                    this.matriz2[f][c] = this.teclado.nextInt();
                }
            }
            System.out.println("matriz tres");
            for(int f=0;f<this.matriz3.length;f++) {
                for (int c = 0; c < this.matriz3[f].length; c++) {
                    System.out.println("Agregue valor");
                    this.matriz3[f][c] = this.teclado.nextInt();
                }
            }
            this.resultadoSuma();

        }

    public void resultadoSuma() {
        int  e = 0;
        System.out.println("Suma de A + B");
        for(int f=0;f<this.Mresultado.length;f++) {
            for (int c = 0; c < this.Mresultado[f].length; c++) {
                this.Mresultado[f][c] = this.matriz[f][c] + this.matriz2[f][c];
                System.out.print( this.Mresultado[f][c] );
                System.out.print(", ");
            }
            System.out.println("");
            }

        System.out.println("Multiplicacion  de (A+B) * C");
        for(int f=0;f<this.Mresultado.length;f++) {
            for (int c = 0; c < this.Mresultado[f].length; c++) {
                this.Mresultado[f][c] = this.Mresultado[f][c] * this.matriz3[c][f];
                System.out.print( this.Mresultado[f][c] );
                System.out.print(", ");
            }
            System.out.println("");
        }
        }


        //opc 1
        public void setTamano1(int x, int y, int z){
            this.matriz = new int[x][y];
            this.matriz2 = new int[x][y];
            this.matriz3 = new int[x][y];
            this.Mresultado = new int[x][y];
        }

        //opc 2
        public void setTamano(int x, int y){
          this.matriz = new int[x][y];
        }
        //opc 2
        public String recorrerMatriz(){

            for(int f=0;f<this.matriz.length;f++) {
                for(int c=0;c<this.matriz[f].length;c++) {
                    this.matriz[f][c]  = 23*((f)*(f)*(f)*(f))+20*( (c)*(c)*(c) )-3;
                }
            }
            return ("recorrido con exito");
        }
        //opc 2
        public void mostrarMatriz(boolean b){
            if (b == true){

                for(int f=0;f<this.matriz.length;f++) {
                    for(int c=0;c<this.matriz[f].length;c++) {
                        System.out.print(this.matriz[f][c]);
                        System.out.print(", ");
                    }
                    System.out.println("");
                }
            }
        }

        public void setIdentidad(int x){
            boolean e = false;
            for(int f=0;f<this.matriz.length;f++) {
                for (int c = 0; c < this.matriz[f].length; c++) {
                    System.out.println("Agregue valor");
                    this.matriz[f][c] = this.teclado.nextInt();
                }
            }
           this.recorrerIdentidad();

        }

        public void recorrerIdentidad() {
            int  e = 0;

            for(int f=0;f<this.matriz.length;f++) {
                for (int c = 0; c < this.matriz[f].length; c++) {
                    if  (c==f){
                        if (this.matriz[f][c] == 1){

                        }else{ e++;
                        }
                    }

                    if  (c!=f){
                        if (this.matriz[f][c] == 0){

                        }else{ e++;
                        }
                    }


                }
            }

        if ( e == 0  ){
            System.out.println("Matriz identidad");
            System.out.println(e);
        }
            else
                System.out.println("No es matriz identidad");
        }

        public void setTriangulo (int x){
            boolean e = false;
            for(int f=0;f<this.matriz.length;f++) {
                for (int c = 0; c < this.matriz[f].length; c++) {
                    System.out.println("Agregue valor");
                    this.matriz[f][c] = this.teclado.nextInt();
                }
            }
            recorrerTriangulo();
        }
            public void recorrerTriangulo() {
                boolean resultado = false;

                for(int f=0;f<this.matriz.length;f++) {
                    for (int c = 0; c < this.matriz[f].length; c++) {

                    }
                }


                if  (resultado == true ) {
                    System.out.println("Matriz identidad");
                } else {
                    System.out.println("No es matriz identidad");
                }
            }

        //constructor de opcion dos
        public Matriz(int x, int y){
            this.setTamano(x,y);
        }
        //opc 4
        public  Matriz( int x){
            this.setTamano(x,x);
        }

}


public class Main {
    public static void main(String[] args) {
         int x, y;

        Scanner teclado,f,c;
        teclado  = new Scanner(System.in);
        c = new Scanner(System.in);
        f = new Scanner(System.in);
        String actualizar;
        Boolean e;
        e = false;

        while(!e){
            System.out.println("Resolución de matrices for dummies");
            System.out.println("1) Suma de matrices");
            System.out.println("2) Rellenar datos de una matriz");
            System.out.println("3) Matriz identidad");
            System.out.println("4) Matriz Traingular Superior");
            System.out.println("5) Terminar");
            System.out.println("Escoga una opcion:");

            actualizar = teclado.nextLine();

            switch(actualizar){
                case "1":
                    System.out.println("instroduzca tamaño de matriz");
                    x = f.nextInt();
                    Matriz opc1 = new  Matriz(x);
                    opc1.setTamano1(x,x,x);
                    opc1.setSuma(x);

                    break;
                case "2":
                    boolean e2 = false;
                    Scanner b = new Scanner(System.in);
                    System.out.println("Cantidad de filas:");
                    x = f.nextInt();
                    System.out.println("Cantidad de columnas:");
                    y = c.nextInt();
                    Matriz opc2 = new Matriz(x,y);
                    System.out.println(opc2.recorrerMatriz());
                        while (!e2){
                        System.out.println("¿Desea imprimir la Matriz? y/n ");
                        String o = b.next();
                            switch (o){
                            case "y":   e2= true;
                                        opc2.mostrarMatriz(e2);
                                        break;
                            case "n": System.out.println("Gracias de todos modos");
                                break;
                            default: System.out.println("opcion invalida");
                            }
                        }
                case "3":
                    System.out.println("instroduzca tamaño de matriz");
                    x = f.nextInt();
                    Matriz opc3 = new  Matriz(x);
                    opc3.setIdentidad(x);
                    opc3.mostrarMatriz(true);
                    break;
                case "4":
                    System.out.println("instroduzca tamaño de matriz");
                    x = f.nextInt();
                    Matriz opc4 = new  Matriz(x);
                    opc4.setTriangulo(x);
                    opc4.mostrarMatriz(true);
                    break;
                case "5": e= true;
                    break;
                default : System.out.println("Opcion invalida");
            } // end switch
        } //end while
    } //Fin  void main
}