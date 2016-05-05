package com.jaxws.demo;

import javax.xml.ws.Endpoint;

public class TestMain {
	public static void main(String[] args)
	{
		/*
		 * 发布WebService 底层是通过Http建立的一个服务可查看源码文件
		 */
		Endpoint.publish("http://localhost:8080/testjws/service/sayHi", new HelloWorldImpl());
	}
}
