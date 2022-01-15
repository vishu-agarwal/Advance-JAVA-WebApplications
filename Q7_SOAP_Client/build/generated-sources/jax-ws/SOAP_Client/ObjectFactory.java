
package SOAP_Client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the SOAP_Client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConverCelToFere_QNAME = new QName("http://service/", "conver_Cel_to_Fere");
    private final static QName _ConverCelToFereResponse_QNAME = new QName("http://service/", "conver_Cel_to_FereResponse");
    private final static QName _ConvertFereToCel_QNAME = new QName("http://service/", "convert_Fere_to_Cel");
    private final static QName _ConvertFereToCelResponse_QNAME = new QName("http://service/", "convert_Fere_to_CelResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: SOAP_Client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConverCelToFere }
     * 
     */
    public ConverCelToFere createConverCelToFere() {
        return new ConverCelToFere();
    }

    /**
     * Create an instance of {@link ConverCelToFereResponse }
     * 
     */
    public ConverCelToFereResponse createConverCelToFereResponse() {
        return new ConverCelToFereResponse();
    }

    /**
     * Create an instance of {@link ConvertFereToCel }
     * 
     */
    public ConvertFereToCel createConvertFereToCel() {
        return new ConvertFereToCel();
    }

    /**
     * Create an instance of {@link ConvertFereToCelResponse }
     * 
     */
    public ConvertFereToCelResponse createConvertFereToCelResponse() {
        return new ConvertFereToCelResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverCelToFere }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "conver_Cel_to_Fere")
    public JAXBElement<ConverCelToFere> createConverCelToFere(ConverCelToFere value) {
        return new JAXBElement<ConverCelToFere>(_ConverCelToFere_QNAME, ConverCelToFere.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverCelToFereResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "conver_Cel_to_FereResponse")
    public JAXBElement<ConverCelToFereResponse> createConverCelToFereResponse(ConverCelToFereResponse value) {
        return new JAXBElement<ConverCelToFereResponse>(_ConverCelToFereResponse_QNAME, ConverCelToFereResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertFereToCel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convert_Fere_to_Cel")
    public JAXBElement<ConvertFereToCel> createConvertFereToCel(ConvertFereToCel value) {
        return new JAXBElement<ConvertFereToCel>(_ConvertFereToCel_QNAME, ConvertFereToCel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertFereToCelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "convert_Fere_to_CelResponse")
    public JAXBElement<ConvertFereToCelResponse> createConvertFereToCelResponse(ConvertFereToCelResponse value) {
        return new JAXBElement<ConvertFereToCelResponse>(_ConvertFereToCelResponse_QNAME, ConvertFereToCelResponse.class, null, value);
    }

}
