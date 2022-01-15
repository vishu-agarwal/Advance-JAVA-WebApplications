
package SOAP_Client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for convert_Fere_to_Cel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="convert_Fere_to_Cel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="degf" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convert_Fere_to_Cel", propOrder = {
    "degf"
})
public class ConvertFereToCel {

    protected double degf;

    /**
     * Gets the value of the degf property.
     * 
     */
    public double getDegf() {
        return degf;
    }

    /**
     * Sets the value of the degf property.
     * 
     */
    public void setDegf(double value) {
        this.degf = value;
    }

}
