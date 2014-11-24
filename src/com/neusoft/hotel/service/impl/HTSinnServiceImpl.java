package com.neusoft.hotel.service.impl;

import java.util.Date;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import com.neusoft.hotel.service.HTSinnService;

/**
 * 汉庭接口实现
 * 
 * @author jianglb
 * 
 */
public class HTSinnServiceImpl implements HTSinnService {

	private String webURL = "http://27.115.28.253:8090/AgentService.asmx";
	private String xmlNS = "http://tempuri.org/";

	@Override
	public String CancelOrder(String sAgentID, String sAuthCode,
			String sOrderID, String sHotalID) {
		String operation = "CancelOrder";
		String result = "";
		try {
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setSOAPActionURI(xmlNS + operation);
			call.setTargetEndpointAddress(new java.net.URL(webURL));
			QName qn = new QName(xmlNS, operation);
			call.setOperationName(qn);
			call.addParameter(new QName(xmlNS, "sAgentID"), XMLType.XSD_STRING,
					ParameterMode.IN);
			call.addParameter(new QName(xmlNS, "sAuthCode"),
					XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(xmlNS, "sOrderID"), XMLType.XSD_STRING,
					ParameterMode.IN);
			call.addParameter(new QName(xmlNS, "sHotalID"), XMLType.XSD_STRING,
					ParameterMode.IN);
			call.setReturnType(qn, java.lang.String.class);
			result = (String) call.invoke(new Object[] { sAgentID, sAuthCode,
					sOrderID, sHotalID });
		} catch (Exception e) {
			e.printStackTrace();
			result = "error";
		}
		return result;
		// return result.equals("error")?result:"success";
	}

	@Override
	public String CreateOrder(String sAgentID, String sAuthCode,
			String sHotalID, Date dCheckIn, Date dCheckOut, String sRoomType,
			Integer iRoomCount, String sLinkName, String sLinkMobile,
			String sLinkEmail, String sComment, String sCreditNo,
			String jsonDailyRate, String requestNo, String jsonPaymentCard,
			String cardType, Integer cardCode, String cardNumber,
			String expireDate) {

		return null;
	}

	@Override
	public String CreateOrderEx(String sAgentID, String sAuthCode,
			String sHotalID, Date dCheckIn, Date dCheckOut, String sRoomType,
			Integer iRoomCount, String sLinkName, String sLinkMobile,
			String sLinkEmail, Date dArrTime, String sComment,
			String sCreditNo, String jsonDailyRate, String requestNo,
			String jsonPaymentCard, String cardType, Integer cardCode,
			String cardNumber, String expireDate) {

		return null;
	}

	@Override
	public String DoubleCheckBeforeCreateOrder(String sAgentID,
			String sAuthCode, String sHotelID, Date dCheckIn, Date dCheckOut,
			String sRoomType) {

		return null;
	}

	@Override
	public String ModifyOrder() {

		return null;
	}

	@Override
	public String ModifyOrderWithCreditNo() {

		return null;
	}

	@Override
	public String QueryHotel() {

		return null;
	}

	@Override
	public String QueryHotelBulletin() {

		return null;
	}

	@Override
	public String QueryHotelIDList() {

		return null;
	}

	@Override
	public String QueryOrder() {

		return null;
	}

	@Override
	public String QueryOrderIDFromRequestNo() {

		return null;
	}

	@Override
	public String QueryRoomFree() {

		return null;
	}

	@Override
	public String QueryRoomFreeWithHotelList() {

		return null;
	}

	@Override
	public String QueryRoomPriceOneHotel() {

		return null;
	}

	@Override
	public String QueryRoomPriceState() {

		return null;
	}

	@Override
	public String QueryRoomPriceUpdated() {

		return null;
	}
}
