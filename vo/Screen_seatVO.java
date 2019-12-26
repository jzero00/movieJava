package vo;

public class Screen_seatVO {
	private int Seatid;		// 좌석 아이디
	private int SeatLevel;  // 좌석 등급
	private String SeatNum;	// 좌석 번호
	private int SeatPrice;	// 좌석 가격
	private int SeatBook;	//예약 유무 (공석일떄 : 0	이미 예약되어 있을떄 : 1	상영관에서 없는 자리 : 9)
	
	//외래키
	private int screenId;  // 영화 상영관 아이디

	public int getSeatid() {
		return Seatid;
	}

	public void setSeatid(int seatid) {
		Seatid = seatid;
	}

	public int getSeatLevel() {
		return SeatLevel;
	}

	public void setSeatLevel(int seatLevel) {
		SeatLevel = seatLevel;
	}

	public String getSeatNum() {
		return SeatNum;
	}

	public void setSeatNum(String seatNum) {
		SeatNum = seatNum;
	}

	public int getSeatPrice() {
		return SeatPrice;
	}

	public void setSeatPrice(int seatPrice) {
		SeatPrice = seatPrice;
	}

	public int getSeatBook() {
		return SeatBook;
	}

	public void setSeatBook(int seatBook) {
		SeatBook = seatBook;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	@Override
	public String toString() {
		return "Screen_seatVO [Seatid=" + Seatid + ", SeatLevel=" + SeatLevel
				+ ", SeatNum=" + SeatNum + ", SeatPrice=" + SeatPrice
				+ ", SeatBook=" + SeatBook + ", screenId=" + screenId + "]";
	}
	
	



}
