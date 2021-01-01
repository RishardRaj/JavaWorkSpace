
package com.nt.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nt.service package. 
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

    private final static QName _SayHelloService_QNAME = new QName("http://service.nt.com/", "sayHelloService");
    private final static QName _SayHelloServiceResponse_QNAME = new QName("http://service.nt.com/", "sayHelloServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nt.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHelloServiceResponse }
     * 
     */
    public SayHelloServiceResponse createSayHelloServiceResponse() {
        return new SayHelloServiceResponse();
    }

    /**
     * Create an instance of {@link SayHelloService }
     * 
     */
    public SayHelloService createSayHelloService() {
        return new SayHelloService();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nt.com/", name = "sayHelloService")
    public JAXBElement<SayHelloService> createSayHelloService(SayHelloService value) {
        return new JAXBElement<SayHelloService>(_SayHelloService_QNAME, SayHelloService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nt.com/", name = "sayHelloServiceResponse")
    public JAXBElement<SayHelloServiceResponse> createSayHelloServiceResponse(SayHelloServiceResponse value) {
        return new JAXBElement<SayHelloServiceResponse>(_SayHelloServiceResponse_QNAME, SayHelloServiceResponse.class, null, value);
    }

}
