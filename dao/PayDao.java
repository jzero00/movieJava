package dao;

public interface PayDao {
	
	void getMemberInfo();
	
	void getCost();
	
	void getPayWay(int ticketCost, int ticketNo);	//티켓 가격과 티켓의 갯수를 파라미터로 설정
	
	void getSeatInfo();

	void getMileage();



}
