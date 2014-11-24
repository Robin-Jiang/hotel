package com.neusoft.hotel.service.impl;

import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import com.neusoft.hotel.service.JJinnService;

/**
 * 锦江之星酒店接口实现
 * 
 * @author jianglb
 * 
 */
public class JJinnServiceImpl implements JJinnService {

	private String webURL = "http://116.236.224.20:6000/JJinnWebService.svc";
	private String xmlNS = "http://tempuri.org/";

	@Override
	public String GetUnitList(String ContractCode, String ContractKey) {
		String operation = "GetUnitList";
		String result = "";
		try {
			URL url = new java.net.URL(webURL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// 设置请求方式和消息头以及超时时间
			conn.setRequestMethod("POST");
			conn.setConnectTimeout(10000);
			// 设置是否允许对外输出数据
			conn.setDoOutput(true);
			conn.setRequestProperty("application/soap+xml", "charset=utf-8");
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setSOAPActionURI(xmlNS + operation);
			call.setTargetEndpointAddress(url);
			QName qn = new QName(xmlNS, operation);
			call.setOperationName(qn);
			call.addParameter(new QName(xmlNS, "ContractCode"),
					XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(xmlNS, "ContractKey"),
					XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(qn, java.lang.String.class);
			result = (String) call.invoke(new Object[] { ContractCode,
					ContractKey });
		} catch (Exception e) {
			e.printStackTrace();
			result = "error";
		}
		return result;
		// return result.equals("error")?result:"success";
	}

}
