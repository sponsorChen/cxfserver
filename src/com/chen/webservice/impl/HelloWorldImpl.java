package com.chen.webservice.impl;

import javax.jws.WebService;

import com.chen.webservice.HelloWorld;



@WebService(endpointInterface="com.chen.webservice.HelloWorld",serviceName="helloWorld",targetNamespace="http://dao.cxf.ws.com/")
public class HelloWorldImpl implements HelloWorld{

	public String sayHello(String username) {
		System.out.println("sayHello() is called");
		return username +" helloWorld";
	}
}