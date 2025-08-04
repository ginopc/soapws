
package it.ginopc.soap.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.ginopc.soap.ws package. 
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

    private final static QName _GetArea_QNAME = new QName("http://server.soap.ginopc.it/", "getArea");
    private final static QName _GetAreaResponse_QNAME = new QName("http://server.soap.ginopc.it/", "getAreaResponse");
    private final static QName _GetCirconferenza_QNAME = new QName("http://server.soap.ginopc.it/", "getCirconferenza");
    private final static QName _GetCirconferenzaResponse_QNAME = new QName("http://server.soap.ginopc.it/", "getCirconferenzaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.ginopc.soap.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetArea }
     * 
     */
    public GetArea createGetArea() {
        return new GetArea();
    }

    /**
     * Create an instance of {@link GetAreaResponse }
     * 
     */
    public GetAreaResponse createGetAreaResponse() {
        return new GetAreaResponse();
    }

    /**
     * Create an instance of {@link GetCirconferenza }
     * 
     */
    public GetCirconferenza createGetCirconferenza() {
        return new GetCirconferenza();
    }

    /**
     * Create an instance of {@link GetCirconferenzaResponse }
     * 
     */
    public GetCirconferenzaResponse createGetCirconferenzaResponse() {
        return new GetCirconferenzaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArea }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArea }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap.ginopc.it/", name = "getArea")
    public JAXBElement<GetArea> createGetArea(GetArea value) {
        return new JAXBElement<GetArea>(_GetArea_QNAME, GetArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAreaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAreaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap.ginopc.it/", name = "getAreaResponse")
    public JAXBElement<GetAreaResponse> createGetAreaResponse(GetAreaResponse value) {
        return new JAXBElement<GetAreaResponse>(_GetAreaResponse_QNAME, GetAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCirconferenza }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCirconferenza }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap.ginopc.it/", name = "getCirconferenza")
    public JAXBElement<GetCirconferenza> createGetCirconferenza(GetCirconferenza value) {
        return new JAXBElement<GetCirconferenza>(_GetCirconferenza_QNAME, GetCirconferenza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCirconferenzaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCirconferenzaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.soap.ginopc.it/", name = "getCirconferenzaResponse")
    public JAXBElement<GetCirconferenzaResponse> createGetCirconferenzaResponse(GetCirconferenzaResponse value) {
        return new JAXBElement<GetCirconferenzaResponse>(_GetCirconferenzaResponse_QNAME, GetCirconferenzaResponse.class, null, value);
    }

}
