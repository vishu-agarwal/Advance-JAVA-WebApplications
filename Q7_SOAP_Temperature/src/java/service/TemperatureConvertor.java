/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author VISHAKHA
 */
@WebService(serviceName = "TemperatureConvertor")
public class TemperatureConvertor {

//    /**
//     * This is a sample web service operation
//     */
//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "conver_Cel_to_Fere")
    public double conver_Cel_to_Fere(@WebParam(name = "degc") double degc) {
        //TODO write your implementation code here:
        double degf;
        degf = degc * 1.8 + 32;
        return degf;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "convert_Fere_to_Cel")
    public double convert_Fere_to_Cel(@WebParam(name = "degf") double degf) {
        //TODO write your implementation code here:
        double degc;
        degc = (degf - 32)/1.8;
        return degc;
    }
}
