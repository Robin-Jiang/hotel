package com.neusoft.hotel.service;

import java.util.Date;

import com.neusoft.hotel.service.BaseService;

/**
 * ��ͥ�ӿ�ʵ��
 * 
 * @author jianglb
 * 
 */
public interface HTSinnService extends BaseService {

	/**
	 * ȡ������
	 * 
	 * @param sAgentID
	 *            �н�����ID
	 * @param sAuthCode
	 *            �н���֤��
	 * @param sOrderID
	 *            ������
	 * @param sHotalID
	 *            �Ƶ�ID ��7Ϊ���֣�
	 * @return
	 */
	public String CancelOrder(String sAgentID, String sAuthCode,
			String sOrderID, String sHotalID);

	/**
	 * Ԥ���ӿ�
	 * 
	 * @param sAgentID
	 *            �н�����ID
	 * @param sAuthCode
	 *            �н���֤��
	 * @param sHotalID
	 *            �Ƶ�ID ��7λ���֣�
	 * @param dCheckIn
	 *            ��ס���� ����ס���ڣ�Ҫ����ڽ�����������֮�䣩
	 * @param dCheckOut
	 *            �˷����� ��Ҫ��1���ͽ���֮������90�����ڣ� Ҫ��2������ס����֮������30������ ��
	 * @param sRoomType
	 *            ��������
	 * @param iRoomCount
	 *            ��������
	 * @param sLinkName
	 *            ��ϵ������ �������������֮���ÿո�ֿ�����಻�ܳ���30�����ĺ��֣�
	 * @param sLinkMobile
	 *            ��ϵ���ֻ�
	 * @param sLinkEmail
	 *            ��ϵ������
	 * @param sComment
	 *            ��ע ����Ҫ���롰|�� �� ��'��(����Ӣ���ַ�)��
	 * @param sCreditNo
	 *            ����״̬ ��"0"=�޵��� "1"=�е�����
	 * @param jsonDailyRate
	 *            ÿ�ռ۸���Ϣ ��json��ʽ ��Ҫ�����ͺ�ͥ�ŵ�����¼۸���жԱȣ����30��۸� ��
	 * @param requestNo
	 *            Ψһ������ ��ÿ�δ�������ʱӦȷ������Ų�ͬ�����Ǵ���ͬһ������ʱӦʹ��ͬһ������ţ��Ա����ظ��µ���
	 * @param jsonPaymentCard
	 *            ���ÿ���Ϣ ��json��ʽ������Ҫ��ֱ������"{}"��
	 * @param cardType
	 *            ������ ������������д�����е�һ�� AX(American Express) BC(Bank Card) BL( Carte
	 *            Bleu) CB(Carte Blanche) DN (Diners Club) DS( Discover Card)
	 *            EC(Eurocard) JC(Japanese Credit Bureau Credit Card) MC( Master
	 *            Card) TP( Universal Air Travel Card) VI(Visa) UP(UnionPay) ��
	 * @param cardCode
	 *            ��������λ����
	 * @param cardNumber
	 *            ����
	 * @param expireDate
	 *            ���ÿ���Ч�� ����ʽΪ:MM/YY��
	 * @return
	 */
	public String CreateOrder(String sAgentID, String sAuthCode,
			String sHotalID, Date dCheckIn, Date dCheckOut, String sRoomType,
			Integer iRoomCount, String sLinkName, String sLinkMobile,
			String sLinkEmail, String sComment, String sCreditNo,
			String jsonDailyRate, String requestNo, String jsonPaymentCard,
			String cardType, Integer cardCode, String cardNumber,
			String expireDate);

	/**
	 * Ԥ���ӿڣ���չ��
	 * 
	 * @param sAgentID
	 *            �н�����ID
	 * @param sAuthCode
	 *            �н���֤��
	 * @param sHotalID
	 *            �Ƶ�ID ��7λ���֣�
	 * @param dCheckIn
	 *            ��ס���� ����ס���ڣ�Ҫ����ڽ�����������֮�䣩
	 * @param dCheckOut
	 *            �˷����� ��Ҫ��1���ͽ���֮������90�����ڣ� Ҫ��2������ס����֮������30������ ��
	 * @param sRoomType
	 *            ��������
	 * @param iRoomCount
	 *            ��������
	 * @param sLinkName
	 *            ��ϵ������ �������������֮���ÿո�ֿ�����಻�ܳ���30�����ĺ��֣�
	 * @param sLinkMobile
	 *            ��ϵ���ֻ�
	 * @param sLinkEmail
	 *            ��ϵ������
	 * @param dArrTime
	 *            Ԥ��ʱ�� ��Ԥ��ʱ�����ס����Ӧ���ǵ��졣��
	 * @param sComment
	 *            ��ע ����Ҫ���롰|�� �� ��'��(����Ӣ���ַ�)��
	 * @param sCreditNo
	 *            ����״̬ ��"0"=�޵��� "1"=�е�����
	 * @param jsonDailyRate
	 *            ÿ�ռ۸���Ϣ ��json��ʽ ��Ҫ�����ͺ�ͥ�ŵ�����¼۸���жԱȣ����30��۸� ��
	 * @param requestNo
	 *            Ψһ������ ��ÿ�δ�������ʱӦȷ������Ų�ͬ�����Ǵ���ͬһ������ʱӦʹ��ͬһ������ţ��Ա����ظ��µ���
	 * @param jsonPaymentCard
	 *            ���ÿ���Ϣ ��json��ʽ������Ҫ��ֱ������"{}"��
	 * @param cardType
	 *            ������ ������������д�����е�һ�� AX(American Express) BC(Bank Card) BL( Carte
	 *            Bleu) CB(Carte Blanche) DN (Diners Club) DS( Discover Card)
	 *            EC(Eurocard) JC(Japanese Credit Bureau Credit Card) MC( Master
	 *            Card) TP( Universal Air Travel Card) VI(Visa) UP(UnionPay) ��
	 * @param cardCode
	 *            ��������λ����
	 * @param cardNumber
	 *            ����
	 * @param expireDate
	 *            ���ÿ���Ч�� ����ʽΪ:MM/YY��
	 * @return
	 */
	public String CreateOrderEx(String sAgentID, String sAuthCode,
			String sHotalID, Date dCheckIn, Date dCheckOut, String sRoomType,
			Integer iRoomCount, String sLinkName, String sLinkMobile,
			String sLinkEmail, Date dArrTime, String sComment,
			String sCreditNo, String jsonDailyRate, String requestNo,
			String jsonPaymentCard, String cardType, Integer cardCode,
			String cardNumber, String expireDate);

	/**
	 * �µ�֮ǰ�Է����ͷ��۽�����֤
	 * 
	 * @param sAgentID
	 *            �н�����ID
	 * @param sAuthCode
	 *            �н���֤��
	 * @param sHotelID
	 *            �Ƶ�ID ��7λ���֣�
	 * @param dCheckIn
	 *            ��ʼӪҵ�� ���޽��쿪ʼ��90����ĳ�죩
	 * @param dCheckOut
	 *            ��ֹӪҵ�� ���޽��쿪ʼ��90����ĳ�죬�Ҵ��ڵ���dCheckIn��
	 * @param sRoomType
	 *            ��������
	 * @return
	 */
	public String DoubleCheckBeforeCreateOrder(String sAgentID,
			String sAuthCode, String sHotelID, Date dCheckIn, Date dCheckOut,
			String sRoomType);

	// �޸Ķ���
	public String ModifyOrder();

	// �޸Ķ���������״̬��
	public String ModifyOrderWithCreditNo();

	// ��ѯ�����Ƶ��б�
	public String QueryHotel();

	// ��ѯ�Ƶ깫����Ϣ
	public String QueryHotelBulletin();

	// ��ѯ���оƵ�ID
	public String QueryHotelIDList();

	// ��ѯ����
	public String QueryOrder();

	// ��������Ų�ѯ��������
	public String QueryOrderIDFromRequestNo();

	// ��ѯʣ�෿���ӿ�
	public String QueryRoomFree();

	// ������÷���������ѯ
	public String QueryRoomFreeWithHotelList();

	// ����ͬ��
	public String QueryRoomPriceOneHotel();

	// ��ѯ�Ƶ�ָ�����͵ķ�����Ϣ
	public String QueryRoomPriceState();

	// ��ѯ���۱��
	public String QueryRoomPriceUpdated();
}
