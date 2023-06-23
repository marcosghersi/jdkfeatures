package com.formacion.jdkfeatures.jdk17;

/**
 * "sealed" es la palabra clave en Java se usa para declarar una clase o una interfaz como sellada,
 * lo que significa que restringe la jerarquía de herencia para sus subclases o implementaciones.
 *
 * Cuando una clase o una interfaz se declara sellada, puede especificar un conjunto finito de subclases
 * o implementaciones permitidas utilizando el permits palabra clave. Solo aquellas subclases
 * o implementaciones enumeradas explícitamente después permits puede extender o implementar la clase
 * o interfaz sellada.
 */
public sealed class Shape permits Circle, Rectangle {
    // common properties and methods of shapes
}

final class Circle extends Shape {
    // properties and methods specific to circles
}

final class Rectangle extends Shape {
    // properties and methods specific to rectangles
}