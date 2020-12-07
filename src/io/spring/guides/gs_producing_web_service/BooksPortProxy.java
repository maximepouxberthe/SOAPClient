package io.spring.guides.gs_producing_web_service;

public class BooksPortProxy implements io.spring.guides.gs_producing_web_service.BooksPort {
  private String _endpoint = null;
  private io.spring.guides.gs_producing_web_service.BooksPort booksPort = null;
  
  public BooksPortProxy() {
    _initBooksPortProxy();
  }
  
  public BooksPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initBooksPortProxy();
  }
  
  private void _initBooksPortProxy() {
    try {
      booksPort = (new io.spring.guides.gs_producing_web_service.BooksPortServiceLocator()).getBooksPortSoap11();
      if (booksPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)booksPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)booksPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (booksPort != null)
      ((javax.xml.rpc.Stub)booksPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public io.spring.guides.gs_producing_web_service.BooksPort getBooksPort() {
    if (booksPort == null)
      _initBooksPortProxy();
    return booksPort;
  }
  
  public io.spring.guides.gs_producing_web_service.GetBookResponse getBook(io.spring.guides.gs_producing_web_service.GetBookRequest getBookRequest) throws java.rmi.RemoteException{
    if (booksPort == null)
      _initBooksPortProxy();
    return booksPort.getBook(getBookRequest);
  }
  
  
}