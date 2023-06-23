package com.formacion.jdkfeatures.jdk12;

import java.lang.invoke.MethodHandles;
import java.util.Optional;

public class NewString {

    public static void main(String[] args) {

        // indent
        // El método indent de la clase String permite añadir un número de espacios al principio de cada línea
        String str = "Welcome \nto Pildorilla!";
        System.out.println(str.indent(0));
        System.out.println(str.indent(3));

        // transform
        // El método transform de la clase String permite aplicar una función y devolver el resultado
        // Ejemplo de transform a partir de una expresión lambda
        String text = "Java";
        String transformed = text.transform(value -> new StringBuilder(value).reverse().toString());
        System.out.println(transformed);
        //Ejemplo de transform a partir de un método de referencia toLowerCase
        // y strip despues para eliminar espacios en blanco
        String hello = " Hello world ";
        String result=hello.transform(String::toLowerCase);
        System.out.println(result);

        String result1=hello.transform(String::strip);
        System.out.println(result1);

        // describeConstable
        // El método describeConstable de la clase String devuelve un Optional con la descripción de la constante
        Optional<String> optional = text.describeConstable();
        System.out.println(optional);

        // resolveConstantDesc
        // El método resolveConstantDesc de la clase String devuelve la descripción de la constante
        String cDescription = text.resolveConstantDesc(MethodHandles.lookup());
        System.out.println(cDescription);
    }
}
