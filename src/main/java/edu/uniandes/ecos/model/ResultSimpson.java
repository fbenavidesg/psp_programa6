package edu.uniandes.ecos.model;
/**
 * Clase que almacena el resultado de los calculos de la app
 * @author fbenavides
 */
public class ResultSimpson {
    double x;
    double dof;
    double resultExpected;
    double result;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getDof() {
        return dof;
    }

    public void setDof(double dof) {
        this.dof = dof;
    }

    public double getResultExpected() {
        return resultExpected;
    }

    public void setResultExpected(double resultExpected) {
        this.resultExpected = resultExpected;
    }
}