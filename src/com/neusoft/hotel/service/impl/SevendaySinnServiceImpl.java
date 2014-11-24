package com.neusoft.hotel.service.impl;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import com.neusoft.hotel.service.SevendaySinnService;

/**
 * 七天酒店接口实现
 * 
 * @author jianglb
 * 
 */
public class SevendaySinnServiceImpl implements SevendaySinnService {

	@Override
	public String MemberLogin(String nType, String sValues, String sPassword) {

		String webURL = "http://121.33.201.180:6005/AboutMember.asmx";
		String xmlNS = "http://www.7daysinn.cn/booking/";
		String operation = "MemberLogin";
		String result = "";
		try {
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(webURL));
			call.setSOAPActionURI(xmlNS + operation);
			QName qn = new QName(xmlNS, operation);
			call.setOperationName(qn);
			call.addParameter(new QName(xmlNS, "nType"), XMLType.XSD_STRING,
					ParameterMode.IN);
			call.addParameter(new QName(xmlNS, "sValues"), XMLType.XSD_STRING,
					ParameterMode.IN);
			call.addParameter(new QName(xmlNS, "sPassword"),
					XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(qn, java.lang.String.class);
			result = (String) call.invoke(new Object[] { nType, sValues,
					sPassword });
		} catch (Exception e) {
			e.printStackTrace();
			result = "error";
		}
		return result;
//		return result.equals("error")?result:"success";
	}

}
