package com.neusoft.mode.factory;

import java.util.Date;

import com.neusoft.hotel.service.HTSinnService;
import com.neusoft.hotel.service.impl.HTSinnServiceImpl;

/**
 * 
 * ∫∫Õ•æ∆µÍπ§≥ß¿‡
 * 
 * @author jianglb
 * 
 */
public class HTSinnFactory {

	private HTSinnService service;

	public HTSinnFactory() {
		service = new HTSinnServiceImpl();
	}

	public String CancelOrder(String sAgentID, String sAuthCode,
			String sOrderID, String sHotalID) {

		return service.CancelOrder(sAgentID, sAuthCode, sOrderID, sHotalID);
	}

	public String CreateOrder(String sAgentID, String sAuthCode,
			String sHotalID, Date dCheckIn, Date dCheckOut, String sRoomType,
			Integer iRoomCount, String sLinkName, String sLinkMobile,
			String sLinkEmail, String sComment, String sCreditNo,
			String jsonDailyRate, String requestNo, String jsonPaymentCard,
			String cardType, Integer cardCode, String cardNumber,
			String expireDate) {

		return null;
	}

	public String CreateOrderEx(String sAgentID, String sAuthCode,
			String sHotalID, Date dCheckIn, Date dCheckOut, String sRoomType,
			Integer iRoomCount, String sLinkName, String sLinkMobile,
			String sLinkEmail, Date dArrTime, String sComment,
			String sCreditNo, String jsonDailyRate, String requestNo,
			String jsonPaymentCard, String cardType, Integer cardCode,
			String cardNumber, String expireDate) {

		return null;
	}

	public String DoubleCheckBeforeCreateOrder(String sAgentID,
			String sAuthCode, String sHotelID, Date dCheckIn, Date dCheckOut,
			String sRoomType) {

		return null;
	}

	public String ModifyOrder() {

		return null;
	}

	public String ModifyOrderWithCreditNo() {

		return null;
	}

	public String QueryHotel() {

		return null;
	}

	public String QueryHotelBulletin() {

		return null;
	}

	public String QueryHotelIDList() {

		return null;
	}

	public String QueryOrder() {

		return null;
	}

	public String QueryOrderIDFromRequestNo() {

		return null;
	}

	public String QueryRoomFree() {

		return null;
	}

	public String QueryRoomFreeWithHotelList() {

		return null;
	}

	public String QueryRoomPriceOneHotel() {

		return null;
	}

	public String QueryRoomPriceState() {

		return null;
	}

	public String QueryRoomPriceUpdated() {

		return null;
	}
}
