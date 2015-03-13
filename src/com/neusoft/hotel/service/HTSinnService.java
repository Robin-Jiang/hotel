package com.neusoft.hotel.service;

import java.util.Date;

import com.neusoft.hotel.service.BaseService;

/**
 * 汉庭接口实现
 * 
 * @author jianglb
 * 
 */
public interface HTSinnService extends BaseService {

	/**
	 * 取消订单
	 * 
	 * @param sAgentID
	 *            中介渠道ID
	 * @param sAuthCode
	 *            中介验证码
	 * @param sOrderID
	 *            订单号
	 * @param sHotalID
	 *            酒店ID （7为数字）
	 * @return
	 */
	public String CancelOrder(String sAgentID, String sAuthCode,
			String sOrderID, String sHotalID);

	/**
	 * 预订接口
	 * 
	 * @param sAgentID
	 *            中介渠道ID
	 * @param sAuthCode
	 *            中介验证码
	 * @param sHotalID
	 *            酒店ID （7位数字）
	 * @param dCheckIn
	 *            入住日期 （入住日期，要求介于今天和离店日期之间）
	 * @param dCheckOut
	 *            退房日期 （要求1：和今天之差须在90天以内， 要求2：和入住日期之差须在30天以内 ）
	 * @param sRoomType
	 *            房间类型
	 * @param iRoomCount
	 *            房间数量
	 * @param sLinkName
	 *            联系人姓名 （多个客人姓名之间用空格分开，最多不能超过30个中文汉字）
	 * @param sLinkMobile
	 *            联系人手机
	 * @param sLinkEmail
	 *            联系人邮箱
	 * @param sComment
	 *            备注 （不要输入“|” 和 “'”(都是英文字符)）
	 * @param sCreditNo
	 *            担保状态 （"0"=无担保 "1"=有担保）
	 * @param jsonDailyRate
	 *            每日价格信息 （json格式 （要用来和汉庭门店的最新价格进行对比（最多30天价格） ）
	 * @param requestNo
	 *            唯一请求码 （每次创建订单时应确保请求号不同，但是创建同一个订单时应使用同一个请求号，以避免重复下单）
	 * @param jsonPaymentCard
	 *            信用卡信息 （json格式，不需要则直接输入"{}"）
	 * @param cardType
	 *            卡类型 （输入如下缩写类型中的一种 AX(American Express) BC(Bank Card) BL( Carte
	 *            Bleu) CB(Carte Blanche) DN (Diners Club) DS( Discover Card)
	 *            EC(Eurocard) JC(Japanese Credit Bureau Credit Card) MC( Master
	 *            Card) TP( Universal Air Travel Card) VI(Visa) UP(UnionPay) ）
	 * @param cardCode
	 *            卡背面三位数字
	 * @param cardNumber
	 *            卡号
	 * @param expireDate
	 *            信用卡有效期 （格式为:MM/YY）
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
	 * 预订接口（扩展）
	 * 
	 * @param sAgentID
	 *            中介渠道ID
	 * @param sAuthCode
	 *            中介验证码
	 * @param sHotalID
	 *            酒店ID （7位数字）
	 * @param dCheckIn
	 *            入住日期 （入住日期，要求介于今天和离店日期之间）
	 * @param dCheckOut
	 *            退房日期 （要求1：和今天之差须在90天以内， 要求2：和入住日期之差须在30天以内 ）
	 * @param sRoomType
	 *            房间类型
	 * @param iRoomCount
	 *            房间数量
	 * @param sLinkName
	 *            联系人姓名 （多个客人姓名之间用空格分开，最多不能超过30个中文汉字）
	 * @param sLinkMobile
	 *            联系人手机
	 * @param sLinkEmail
	 *            联系人邮箱
	 * @param dArrTime
	 *            预抵时间 （预抵时间和入住日期应该是当天。）
	 * @param sComment
	 *            备注 （不要输入“|” 和 “'”(都是英文字符)）
	 * @param sCreditNo
	 *            担保状态 （"0"=无担保 "1"=有担保）
	 * @param jsonDailyRate
	 *            每日价格信息 （json格式 （要用来和汉庭门店的最新价格进行对比（最多30天价格） ）
	 * @param requestNo
	 *            唯一请求码 （每次创建订单时应确保请求号不同，但是创建同一个订单时应使用同一个请求号，以避免重复下单）
	 * @param jsonPaymentCard
	 *            信用卡信息 （json格式，不需要则直接输入"{}"）
	 * @param cardType
	 *            卡类型 （输入如下缩写类型中的一种 AX(American Express) BC(Bank Card) BL( Carte
	 *            Bleu) CB(Carte Blanche) DN (Diners Club) DS( Discover Card)
	 *            EC(Eurocard) JC(Japanese Credit Bureau Credit Card) MC( Master
	 *            Card) TP( Universal Air Travel Card) VI(Visa) UP(UnionPay) ）
	 * @param cardCode
	 *            卡背面三位数字
	 * @param cardNumber
	 *            卡号
	 * @param expireDate
	 *            信用卡有效期 （格式为:MM/YY）
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
	 * 下单之前对房量和房价进行验证
	 * 
	 * @param sAgentID
	 *            中介渠道ID
	 * @param sAuthCode
	 *            中介验证码
	 * @param sHotelID
	 *            酒店ID （7位数字）
	 * @param dCheckIn
	 *            开始营业日 （限今天开始的90天内某天）
	 * @param dCheckOut
	 *            截止营业日 （限今天开始的90天内某天，且大于等于dCheckIn）
	 * @param sRoomType
	 *            房间类型
	 * @return
	 */
	public String DoubleCheckBeforeCreateOrder(String sAgentID,
			String sAuthCode, String sHotelID, Date dCheckIn, Date dCheckOut,
			String sRoomType);

	// 修改订单
	public String ModifyOrder();

	// 修改订单（担保状态）
	public String ModifyOrderWithCreditNo();

	// 查询基本酒店列表
	public String QueryHotel();

	// 查询酒店公告信息
	public String QueryHotelBulletin();

	// 查询所有酒店ID
	public String QueryHotelIDList();

	// 查询订单
	public String QueryOrder();

	// 根据请求号查询新增订单
	public String QueryOrderIDFromRequestNo();

	// 查询剩余房量接口
	public String QueryRoomFree();

	// 单店可用房量批量查询
	public String QueryRoomFreeWithHotelList();

	// 房价同步
	public String QueryRoomPriceOneHotel();

	// 查询酒店指定房型的房价信息
	public String QueryRoomPriceState();

	// 查询房价变更
	public String QueryRoomPriceUpdated();
}
