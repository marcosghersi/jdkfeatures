package com.formacion.jdkfeatures.jdk14;

/**
 * En las declaraciones de switch tradicionales, solo puede usar constantes
 * o valores enumerados como case, y debe usar un break para
 * evitar pasar a casos posteriores. Con los switch nuevos,
 * puede usar cualquier tipo de datos como case, y puede usar un yield
 * para especificar el valor que la expresión debe devolver
 */
public class SwitchExpressions {

    public static void main(String[] args) {
        var month = 4;

        oldStyleSwitchExpression(month);

        newStyleSwitchExpression(month);
    }

    private static void newStyleSwitchExpression(int month) {
        String season;
        switch (month) {
            case 12, 1, 2 -> season = "Winter";
            case 3, 4, 5 -> season = "Spring";
            case 6, 7, 8 -> season = "Summer";
            case 9, 10, 11 -> season = "Autumn";
            default -> season = "Invalid Month";
        }
        System.out.println("April is in the " + season + ".");
    }

    private static void oldStyleSwitchExpression(int month) {
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid Month";
        }
        System.out.println("April is in the " + season + ".");
    }

}
