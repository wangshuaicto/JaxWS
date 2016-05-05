package com.jaxws.demo;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//注解标注为一个WebService
@WebService
//@SOAPBinding(style=Style.RPC)
public interface HelloWorld {
	//WebService Operation 
	@WebMethod(exclude=true)  //exclude为true 不会在wsdl中显示该方法，隐藏
	void sayHiDefault();
	
	@WebMethod
	void sayHi(@WebParam(name="name")String name);
	
	@WebMethod
	@WebResult(name="tagname") //设置SOAPMEssage消息返回的标签名字
	int checkTime(@WebParam(name="clientTime") Date clientTime);

}
