package dao;

import java.util.ArrayList;
import java.util.Arrays;

import vo.MovieInfoVO;
import vo.Screen_seatVO;
import data.Database;

public class Screen_seatDaoImpl implements Screen_seatDaoInterface {

	private static Screen_seatDaoImpl instance;
	
	private Screen_seatDaoImpl(){}

	public static Screen_seatDaoInterface getInstance() {
		if (instance == null) {
			instance = new Screen_seatDaoImpl();
		}
		return instance;
	}
	
	Database database = Database.getInstance();
	
	public static void main(String[] args) {
		
	}
	@Override
	public void Screen_seatInfo() {
		for (int i = 0; i < database.screenSeat.size(); i++){
			if(database.screenSeat.get(i).getSeatid() == i+1){
				System.out.println(database.screenSeat);
			}
		}

	}

	@Override
	public ArrayList<Screen_seatVO> listScreenSeat() {
		
		return database.screenSeat;
	}


}
