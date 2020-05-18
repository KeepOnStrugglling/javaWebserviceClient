
package com.javaWebserviceClient.wsimport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.javaWebserviceClient.wsimport package. 
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

    private final static QName _GetStudentScoreById_QNAME = new QName("http://server.webservice.javatest.com/", "getStudentScoreById");
    private final static QName _GetStudentScoreByIdResponse_QNAME = new QName("http://server.webservice.javatest.com/", "getStudentScoreByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.javaWebserviceClient.wsimport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentScoreById }
     * 
     */
    public GetStudentScoreById createGetStudentScoreById() {
        return new GetStudentScoreById();
    }

    /**
     * Create an instance of {@link GetStudentScoreByIdResponse }
     * 
     */
    public GetStudentScoreByIdResponse createGetStudentScoreByIdResponse() {
        return new GetStudentScoreByIdResponse();
    }

    /**
     * Create an instance of {@link StudentScore }
     * 
     */
    public StudentScore createStudentScore() {
        return new StudentScore();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentScoreById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.webservice.javatest.com/", name = "getStudentScoreById")
    public JAXBElement<GetStudentScoreById> createGetStudentScoreById(GetStudentScoreById value) {
        return new JAXBElement<GetStudentScoreById>(_GetStudentScoreById_QNAME, GetStudentScoreById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentScoreByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.webservice.javatest.com/", name = "getStudentScoreByIdResponse")
    public JAXBElement<GetStudentScoreByIdResponse> createGetStudentScoreByIdResponse(GetStudentScoreByIdResponse value) {
        return new JAXBElement<GetStudentScoreByIdResponse>(_GetStudentScoreByIdResponse_QNAME, GetStudentScoreByIdResponse.class, null, value);
    }

}
