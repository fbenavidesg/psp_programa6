package edu.uniandes.ecos.controller.app;
import edu.uniandes.ecos.model.ResultSimpson;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;
/**
 * Clase principal funciona como controllador frontal
 * @author fbenavides
 */
public class App 
{
    /**
     * Metodo de entrada de la aplicacion implementa el motor de plantillas spart.
     * @param args parametros iniciales
     */
    public static void main( String[] args )
    {
        
        /*String getX = "4.60409";
        String getDof = "4";
        String getP = "0.495";
        
        ControllerApp controllerApp = new ControllerApp();
        ResultSimpson resultSimpson = controllerApp.execute(Double.parseDouble(getX), Double.parseDouble(getDof), Double.parseDouble(getP));
        
        System.out.println( resultSimpson.getX() );
        System.out.println( resultSimpson.getDof());
        System.out.println( resultSimpson.getResultExpected() );
        System.out.println( resultSimpson.getResult() );*/
        
        
        
    	port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
    	get("/", (req, res) -> {
    		String template = "index";
    		Map<String, Object> attributes = new HashMap<>();
    		String getX = req.queryParams("xExpected");
    		String getDof = req.queryParams("dof");
    		String getP = req.queryParams("p");
    		if( getX == null || getDof == null || getP == null ){
    			attributes.put("uri", req.url());
    			template = "err";
    		}else{
    			ControllerApp controllerApp = new ControllerApp();
                        ResultSimpson resultSimpson = controllerApp.execute(Double.parseDouble(getX), Double.parseDouble(getDof), Double.parseDouble(getP));
        		attributes.put("resultSimpson", resultSimpson);
    		}
            return new ModelAndView(attributes, template +".ftl");
    	},new FreeMarkerEngine());
        
    }
}
