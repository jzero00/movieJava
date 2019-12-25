package dao;

import java.util.Scanner;

import data.Database;
import data.Session;

public class PayDaoImpl implements PayDao {

	private static PayDaoImpl instance;

	private PayDaoImpl(){}

	public static PayDao getInstance() {
		if (instance == null) {
			instance = new PayDaoImpl();
		}
		return instance;
	}

	/**

	/**
	 * @author 정재영
	 * @brief Database을 호출하여 데이터 베이스 안에 있는 각종 값들을 조회 및 반환 하기 위해서 선언한다.
	 */
	Database database = Database.getInstance();
//	String loginName = Session.loginUser.getUserName();

	/**
	 * @author 정재영
	 * @brief getMemberInfo에서 유저의 이름과 선택한 영화 제목을 출력한 뒤 결제 창을 진행한다.
	 */
	@Override
	public void getMemberInfo() {
		System.out.println(database.userlist.get(0).getUserName() + "님");
		System.out.println(database.mv_list.get(0).getMovieName() + "을 선택하셨습니다.");
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("결제를 진행하시겠습니까? (Y/N) 0번 누를시 처음 화면으로 돌아갑니다.");
			if (s.nextLine().equalsIgnoreCase("Y")) {
				System.out.println("결제를 진행합니다.");
				break; 
			} 
		}while(s.nextLine().equalsIgnoreCase("n"));
	}

	/**
	 * @author 정재영
	 * @brief getCost에서 영화 티켓의 가격을 계산한다.
	 */
	@Override
	public void getCost() {
		int ticketCost = 8000;	//임시로 티켓 가격을 부여 data필요
		int totalCost = 0;
		//할인 여부 체크
		//카드결제? 현금 결제? 페이 결제?

		int ticketNo = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("몇장을 구매하시겠습니까?");
		ticketNo = Integer.parseInt(s.nextLine());
		totalCost = ticketCost * ticketNo;
		System.out.println("결제 금액 : " + totalCost + "원");
	}
	
	/**
	 * @author 정재영
	 * @brief getPayWay에서 유저가 결제 방식을 결정한다. 중간에 마일리지 사용 유무를 체크하기 위해 getMileage() Method를 추가함.
	 * 
	 */
	@Override
	public void getPayWay (int ticketCost, int ticketNo) {
		int totalCost = ticketCost * ticketNo;
		int input = 0;			//사용자가 넣은 금액
		int rest = input - totalCost;//거스름돈

		System.out.println("결제 방법을 선택해주세요. 1. 카드 2. 현금 3. 페이" );
		int menu = 0;
		Scanner s = new Scanner(System.in);
		menu = Integer.parseInt(s.nextLine());
		switch(menu) {
		case 1 : 
			System.out.println("카드 결제를 진행합니다.");
			System.out.println("마일리지를 사용하시겠습니까?");
			if (s.nextLine().equalsIgnoreCase("Y")) {
				getMileage();
			} 
			System.out.println("카드 결제가 완료되었습니다.");
			break;
		case 2 : 
			System.out.println("마일리지를 사용하시겠습니까?");
			if (s.nextLine().equalsIgnoreCase("Y")) {
				getMileage();
			} 
			System.out.println("현금 결제를 진행합니다. 현금을 투입해 주세요");
			input = Integer.parseInt(s.nextLine());
			System.out.println("마일리지를 사용하시겠습니까?");
			if (s.nextLine().equalsIgnoreCase("Y")) {
				getMileage();
			} 
			if ( rest < 0) {
				System.out.println("금액이 부족합니다.");
			}else{
				System.out.println("결제가 완료되었습니다. 거스름돈은 : " + rest);
				break;
			}
		case 3 : 
			System.out.println("페이 결제를 진행합니다.");
			System.out.println("마일리지를 사용하시겠습니까?");
			if (s.nextLine().equalsIgnoreCase("Y")) {
				getMileage();
			} 
			System.out.println("페이 결제가 완료되었습니다.");
			break;
		}
		getSeatInfo();
	}


	@Override
	public void getSeatInfo() {
		System.out.println("좌석을  선택해주세요.");

	}

	/**
	 * @author 정재영
	 * @brief getMileage에서 유저의 마일리지를 사용할 것인지 여부와 .
	 */
	@Override
	public void getMileage() {	//마일리지 사용 여부
		System.out.println("마일리지 : ");
		
	}



}
