package Service;

public interface PayService {
	/*
	 *회원정보 가져오기
	 *
	 * 결제 금액
	 * 
	 * 결제 방법 선택
	 * 
	 * 좌석 정보 선택
	 */
	
	void getMemberInfo();	//회원 정보 가져오기
	
	void getCost();			//결제 금액 계산
	
	void getPayWay(int ticketCost, int ticketNo);
	//결제 방법 선택		구매하려는 티켓의 가격과 갯수를 파라미터로 설정
	
	void getMileage();
	
	void getSeatInfo();		//좌석 정보 선택


}
