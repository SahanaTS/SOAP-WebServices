//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.19 at 04:08:34 PM IST 
//


package com.example.demo.calculate;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demo.calculate package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demo.calculate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCalculatorRequest }
     * 
     */
    public GetCalculatorRequest createGetCalculatorRequest() {
        return new GetCalculatorRequest();
    }

    /**
     * Create an instance of {@link GetCalculatorResponse }
     * 
     */
    public GetCalculatorResponse createGetCalculatorResponse() {
        return new GetCalculatorResponse();
    }

    /**
     * Create an instance of {@link Calculator }
     * 
     */
    public Calculator createCalculator() {
        return new Calculator();
    }

}