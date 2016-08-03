package com.chen.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	@WebMethod
	String sayHello(@WebParam(name="username") String username);
}