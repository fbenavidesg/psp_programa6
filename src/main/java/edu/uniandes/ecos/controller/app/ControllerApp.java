package edu.uniandes.ecos.controller.app;
import edu.uniandes.ecos.model.CalculateSimpson;
import edu.uniandes.ecos.model.ResultSimpson;
/**
 * Clase que funciona como controlador de la aplicacion
 * @author fbenavides
 */
public class ControllerApp {
	/**
	 * 
	 * @param getX double f(x)
	 * @param getDof double 
	 * @param resultExpected double
	 * @return
	 */
	public ResultSimpson execute( double getX, double getDof, double resultExpected  ){
        ResultSimpson resultSimpson = new ResultSimpson();
		CalculateSimpson calculateSimpson = new CalculateSimpson();
		double result = calculateSimpson.calculate(getX, getDof);
		resultSimpson.setX(getX);
                resultSimpson.setDof(getDof);
                resultSimpson.setResultExpected(resultExpected);
                resultSimpson.setResult(result);
		return resultSimpson;
	}
}
