package com.formacion.jdkfeatures.jdk11;

/**
 * Java SE 11 introdujo varios metodos nuevos en la clase String.
 * Estos son algunos de los más notables
 */
public class NewString {

    public static void main(String[] args) {

        //isBlank(): Este metodo devuelve true si la cadena esta vacía
        // o contiene solo espacio en blanco, y false de lo contrario
        System.out.println(" ".isBlank()); // true

        String string = "  omernaci  ";
        System.out.println(string.isBlank()); // false

        String string1 = "";
        System.out.println(string1.isBlank()); // true

        // repeat(int count): Este método devuelve una nueva cadena compuesta
        // de la cadena original repetida count veces
        String repeatedString = "omer".repeat(2);
        System.out.println(repeatedString); // prints omeromer

        // strip(): Este metodo devuelve una copia de la cadena con
        // todo el espacio en blanco inicial y posterior eliminado
        String str = " JD ";
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");

        // stripLeading(): Este metodo devuelve una copia de la cadena con
        // todo el espacio en blanco eliminado
        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");

        //stripTrailing(): Este metodo devuelve una copia de la cadena con
        // todo el espacio en blanco final eliminado
        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");

    }
}
