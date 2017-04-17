package edu.uniandes.ecos.model;
/**
 * Clase de apoyo para calculos con metodos estaticos
 * @author fbenavides
 *
 */
public class Util {
    /**
     * calcula el factorial de un entero o decimal
     *
     * @param init valor a calcular el factorial
     * @param limit identificador si es decimal o entero
     * @return
     */
    public static double factorial(double init, double limit) {
        if (init <= limit) {
            return limit;
        } else {
            return init * factorial(init - 1, limit);
        }
    }
}
