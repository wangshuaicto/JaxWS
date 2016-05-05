package com.jaxws.demo;

import java.util.Date;

import javax.jws.WebService;
//在服务器端，用户只需要通过Java语言定义远程调用所需要实现的接口SEI（service endpoint interface），
//并提供相关的实现，通过调用JAX-WS的服务发布接口就可以将其发布为WebService接口。
@WebService(endpointInterface="com.jaxws.demo.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public void sayHiDefault() {
		// TODO Auto-generated method stub
		System.out.println("Hi,This is sayHiDefault() Method no arguments");
	}

	@Override
	public void sayHi(String name) {
		// TODO Auto-generated method stub
		System.out.println("This is sayHi(String name) Method:" +name);
	}

	@Override
	public int checkTime(Date clientTime) {
		// TODO Auto-generated method stub
		System.out.println(clientTime);
		return (int) System.currentTimeMillis();
	}

}
