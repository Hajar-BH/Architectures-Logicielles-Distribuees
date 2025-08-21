
package web.service.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web.service.client package. 
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

    private final static QName _EffectueReservation_QNAME = new QName("http://service/", "effectueReservation");
    private final static QName _EffectueReservationResponse_QNAME = new QName("http://service/", "effectueReservationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web.service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EffectueReservation }
     * 
     */
    public EffectueReservation createEffectueReservation() {
        return new EffectueReservation();
    }

    /**
     * Create an instance of {@link EffectueReservationResponse }
     * 
     */
    public EffectueReservationResponse createEffectueReservationResponse() {
        return new EffectueReservationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectueReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EffectueReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "effectueReservation")
    public JAXBElement<EffectueReservation> createEffectueReservation(EffectueReservation value) {
        return new JAXBElement<EffectueReservation>(_EffectueReservation_QNAME, EffectueReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectueReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EffectueReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "effectueReservationResponse")
    public JAXBElement<EffectueReservationResponse> createEffectueReservationResponse(EffectueReservationResponse value) {
        return new JAXBElement<EffectueReservationResponse>(_EffectueReservationResponse_QNAME, EffectueReservationResponse.class, null, value);
    }

}
