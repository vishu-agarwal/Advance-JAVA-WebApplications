
package SOAP_Client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conver_Cel_to_Fere complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conver_Cel_to_Fere"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="degc" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conver_Cel_to_Fere", propOrder = {
    "degc"
})
public class ConverCelToFere {

    protected double degc;

    /**
     * Gets the value of the degc property.
     * 
     */
    public double getDegc() {
        return degc;
    }

    /**
     * Sets the value of the degc property.
     * 
     */
    public void setDegc(double value) {
        this.degc = value;
    }

}
