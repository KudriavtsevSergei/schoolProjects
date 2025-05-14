package k01;

public class Cellphone {

	private String number;
	private String name;
	private int baseCharge;
	private int unitCallCharge;
	private int freeTraffic;
	private int unitComCharge;
	private int airtime;
	private double traffic;

	Cellphone(String number, String name, int baseCharge, int unitCallCharge, int freeTraffic, int unitComCharge) {
		this.number = number;
		this.name = name;
		this.baseCharge = baseCharge;
		this.unitCallCharge = unitCallCharge;
		this.freeTraffic = freeTraffic;
		this.unitComCharge = unitComCharge;
		this.airtime = 0;
		this.traffic = 0.0;
	}

	String getNumber() {
		return number;
	}

	String getName() {
		return name;
	}

	int getBaseCharge() {
		return baseCharge;
	}

	int getUnitCallCharge() {
		return unitCallCharge;
	}

	int getFreeTraffic() {
		return freeTraffic;
	}

	int getUnitComCharge() {
		return unitComCharge;
	}

	void addAirtime(int airtime) {
		this.airtime += airtime;
	}

	void addTraffic(double traffic) {
		this.traffic += traffic;
	}

	int getPhoneCallFare() {
		return airtime * unitCallCharge;
	}

	int getCommunicationFare() {
		if (traffic > freeTraffic) {
			return (int)((traffic-freeTraffic)*unitComCharge);
		} else {
			return 0;
		}
	}

	void printAccount() {
		System.out.println("電話番号: " + number);
		System.out.println("名前: " + name);
		System.out.println("通話時間: " + airtime + "分");
		System.out.println("通話量: " + traffic + "GB");
		System.out.println("通話料金: " + getPhoneCallFare() + "円");
		System.out.println("通信料金: " + getCommunicationFare() + "円");
		System.out.println("請求額: " + (baseCharge + getPhoneCallFare() + getCommunicationFare()) + "円");
	}
}
