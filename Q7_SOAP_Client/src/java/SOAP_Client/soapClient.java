/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOAP_Client;

/**
 *
 * @author VISHAKHA
 */
public class soapClient {
    
    public static void main(String[] args)
    {
        
    }

    private static double converCelToFere(double degc) {
        SOAP_Client.TemperatureConvertor_Service service = new SOAP_Client.TemperatureConvertor_Service();
        SOAP_Client.TemperatureConvertor port = service.getTemperatureConvertorPort();
        return port.converCelToFere(degc);
    }
    
}
