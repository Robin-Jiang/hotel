package test;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import junit.framework.TestCase;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

public class Test extends TestCase {

	public void test() {
		ettTest();
	}

	public void ettTest() {
		String webURL = "http://27.115.28.253:8090/AgentService.asmx";
		String xmlNS = "http://tempuri.org/";
		String operation = "QueryHotelIDList";

		String sAgentID = "aa";
		String sAuthCode = "aa";

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
			call.setReturnType(qn, java.lang.String.class);
			System.out.println(call
					.invoke(new Object[] { sAgentID, sAuthCode }));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception");
		}
	}

	public void sevenDaysTest() {
		String webURL = "http://121.33.201.180:6005/AboutMember.asmx";
		String xmlNS = "http://www.7daysinn.cn/booking/";
		String operation = "MemberLogin";

		String CTUserType = "11";
		String sAgentID = "aa";
		String sAuthCode = "aa";

		try {
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(webURL));
			call.setSOAPActionURI(xmlNS + operation);
			QName qn = new QName(xmlNS, operation);
			call.setOperationName(qn);
			call.addParameter(new QName(xmlNS, "CTUserType"),
					XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter(new QName(xmlNS, "sAgentID"), XMLType.XSD_STRING,
					ParameterMode.IN);
			call.addParameter(new QName(xmlNS, "sAuthCode"),
					XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(qn, java.lang.String.class);
			System.out.println(call.invoke(new Object[] { CTUserType, sAgentID,
					sAuthCode }));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception");
		}
	}

	public void smsTest() {
		String webURL = "http://www.qiban365.com/tsdplatform/service/commondb";
		String xmlNS = "http://ws.dbaccess.common.pltsupport.tsd.neusoft.com/";
		String operation = "queryTable";

		String arg0 = "111";
		String arg1 = "222";
		String arg2 = "333";

		try {
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(webURL));
			QName qn = new QName(xmlNS, operation);
			call.setOperationName(qn);
			call.addParameter(new QName(xmlNS, "arg0"), XMLType.XSD_STRING,
					ParameterMode.IN);
			call.addParameter(new QName(xmlNS, "arg1"), XMLType.XSD_STRING,
					ParameterMode.IN);
			call.addParameter(new QName(xmlNS, "arg2"), XMLType.XSD_STRING,
					ParameterMode.IN);
			call.setReturnType(qn, java.lang.Boolean.class);
			System.out.println(call.invoke(new Object[] { arg0, arg1, arg2 }));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
