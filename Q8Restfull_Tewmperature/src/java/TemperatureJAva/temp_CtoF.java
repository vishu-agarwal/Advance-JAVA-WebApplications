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
@Path("/CtoF/{degC}")
public class temp_CtoF {
    
    @GET
    public String tempCtoF(@PathParam("degC") double c)
    {
        double degf;
        degf = c * 1.8 + 32;
        return ("celcius to ferenhite conversion :: "+degf);
        
        
    }
}
