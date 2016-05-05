package com.jaxws.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class HelloWorldClident {
	
	private final static QName SERVICE_NAME=new QName("http://demo.jaxws.com/", "HelloWorldImplService");
	private final static QName PORT_NAME=new QName("http://demo.jaxws.com/", "HelloWorldImplPort");
	private final static String ADDRESS="http://localhost:8080/testjws/service/sayHi?wsdl";
	
	//此方法可以在本地测试此WebService是否正确
	
	public static void main(String[] args) throws MalformedURLException {
		Service service = Service.create(new URL(ADDRESS),SERVICE_NAME);
		//根据portName、服务发布地址、数据绑定类型创建一个Port。 
		//service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, ADDRESS); //默认是SOAP1.1Binding  
		//获取服务
		HelloWorld hw = service.getPort(HelloWorld.class);
		hw.sayHi("Hello");
		hw.checkTime(new Date());
	}

}
