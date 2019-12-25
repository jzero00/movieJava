package Service;

import dao.PayDao;
import dao.PayDaoImpl;

public class PayServiceImpl implements PayService {

private static PayServiceImpl instance;
	
	private PayServiceImpl(){}
	
	public static PayService getInstance() {
		if (instance == null) {
			instance = new PayServiceImpl();
		}
		return instance;
	}
	
	/**
 	 * @author 정재영
 	 * @brief PayDaoImpl을 호출하여 값, 객체들을 반환 받는다.
 	 */
	PayDao payDao = PayDaoImpl.getInstance();
	
	@Override
	public void getMemberInfo() {
		payDao.getMemberInfo();
	}

	@Override
	public void getCost() {
		payDao.getCost();
	}

	@Override
	public void getSeatInfo() {
		payDao.getSeatInfo();
	}

	@Override
	public void getPayWay(int ticketCost, int ticketNo) {
		payDao.getPayWay(ticketCost, ticketNo);
	}

	@Override
	public void getMileage() {
		// TODO Auto-generated method stub
		
	}

}
