/**
 * BooksPortServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package io.spring.guides.gs_producing_web_service;

public class BooksPortServiceLocator extends org.apache.axis.client.Service implements io.spring.guides.gs_producing_web_service.BooksPortService {

    public BooksPortServiceLocator() {
    }


    public BooksPortServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BooksPortServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BooksPortSoap11
    private java.lang.String BooksPortSoap11_address = "http://localhost:8090/ws";

    public java.lang.String getBooksPortSoap11Address() {
        return BooksPortSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BooksPortSoap11WSDDServiceName = "BooksPortSoap11";

    public java.lang.String getBooksPortSoap11WSDDServiceName() {
        return BooksPortSoap11WSDDServiceName;
    }

    public void setBooksPortSoap11WSDDServiceName(java.lang.String name) {
        BooksPortSoap11WSDDServiceName = name;
    }

    public io.spring.guides.gs_producing_web_service.BooksPort getBooksPortSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BooksPortSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBooksPortSoap11(endpoint);
    }

    public io.spring.guides.gs_producing_web_service.BooksPort getBooksPortSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            io.spring.guides.gs_producing_web_service.BooksPortSoap11Stub _stub = new io.spring.guides.gs_producing_web_service.BooksPortSoap11Stub(portAddress, this);
            _stub.setPortName(getBooksPortSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBooksPortSoap11EndpointAddress(java.lang.String address) {
        BooksPortSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (io.spring.guides.gs_producing_web_service.BooksPort.class.isAssignableFrom(serviceEndpointInterface)) {
                io.spring.guides.gs_producing_web_service.BooksPortSoap11Stub _stub = new io.spring.guides.gs_producing_web_service.BooksPortSoap11Stub(new java.net.URL(BooksPortSoap11_address), this);
                _stub.setPortName(getBooksPortSoap11WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BooksPortSoap11".equals(inputPortName)) {
            return getBooksPortSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://spring.io/guides/gs-producing-web-service", "BooksPortService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://spring.io/guides/gs-producing-web-service", "BooksPortSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BooksPortSoap11".equals(portName)) {
            setBooksPortSoap11EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
