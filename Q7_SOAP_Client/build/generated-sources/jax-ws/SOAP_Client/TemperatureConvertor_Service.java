
package SOAP_Client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TemperatureConvertor", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8080/Q7_SOAP_Temperature/TemperatureConvertor?wsdl")
public class TemperatureConvertor_Service
    extends Service
{

    private final static URL TEMPERATURECONVERTOR_WSDL_LOCATION;
    private final static WebServiceException TEMPERATURECONVERTOR_EXCEPTION;
    private final static QName TEMPERATURECONVERTOR_QNAME = new QName("http://service/", "TemperatureConvertor");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Q7_SOAP_Temperature/TemperatureConvertor?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEMPERATURECONVERTOR_WSDL_LOCATION = url;
        TEMPERATURECONVERTOR_EXCEPTION = e;
    }

    public TemperatureConvertor_Service() {
        super(__getWsdlLocation(), TEMPERATURECONVERTOR_QNAME);
    }

    public TemperatureConvertor_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEMPERATURECONVERTOR_QNAME, features);
    }

    public TemperatureConvertor_Service(URL wsdlLocation) {
        super(wsdlLocation, TEMPERATURECONVERTOR_QNAME);
    }

    public TemperatureConvertor_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEMPERATURECONVERTOR_QNAME, features);
    }

    public TemperatureConvertor_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TemperatureConvertor_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TemperatureConvertor
     */
    @WebEndpoint(name = "TemperatureConvertorPort")
    public TemperatureConvertor getTemperatureConvertorPort() {
        return super.getPort(new QName("http://service/", "TemperatureConvertorPort"), TemperatureConvertor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TemperatureConvertor
     */
    @WebEndpoint(name = "TemperatureConvertorPort")
    public TemperatureConvertor getTemperatureConvertorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "TemperatureConvertorPort"), TemperatureConvertor.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEMPERATURECONVERTOR_EXCEPTION!= null) {
            throw TEMPERATURECONVERTOR_EXCEPTION;
        }
        return TEMPERATURECONVERTOR_WSDL_LOCATION;
    }

}
