package edu.uniandes.ecos.model;
/**
 * Clase que almacena el resultado de los calculos de cada segmento
 * @author fbenavides
 */
public class Segment {
    private int i;
    private double xi;
    private double fx;
    private int multiplier;
    private double integral;

    public int getI() {
        return i;
    }
    
    public void setI(int i) {
        this.i = i;
    }
    
    public double getXi() {
        return xi;
    }
    
    public void setXi(double xi) {
        this.xi = xi;
    }
    
    public Double getFx() {
        return fx;
    }
    
    public void setFx(Double fx) {
        this.fx = fx;
    }
    
    public int getMultiplier() {
        return multiplier;
    }
    
    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
    
    public void setIntegral(int integral) {
        this.integral = integral;
    }
    
    public double getIntegral() {
        return this.integral;
    }
}