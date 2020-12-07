/**
 * BooksPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package io.spring.guides.gs_producing_web_service;

public interface BooksPort extends java.rmi.Remote {
    public io.spring.guides.gs_producing_web_service.GetBookResponse getBook(io.spring.guides.gs_producing_web_service.GetBookRequest getBookRequest) throws java.rmi.RemoteException;
}
