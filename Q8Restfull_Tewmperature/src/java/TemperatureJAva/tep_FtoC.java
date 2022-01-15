/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperatureJAva;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
/**
 *
 * @author VISHAKHA
 */
@Path("/FtoC/{degF}")
public class tep_FtoC {
    
      @GET
    public String tempFtoC(@PathParam("degF") double f)
    {
        double degc;
        degc = (f - 32)/1.8;
        return ("ferenhite to celcius conversion :: "+degc);
        
        
    }
}
