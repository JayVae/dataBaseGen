package com.xiaotang.datagen.entity.charging;



import com.xiaotang.datagen.entity.merchant.ParkingLot;
import com.xiaotang.datagen.entity.merchant.ParkingPlace;

import java.util.ArrayList;
import java.util.List;

public class ParkingUnitPriceMapping {
	
	
	private double money;

	private ParkingPlace parkingPlace;

	private List<ParkingUnitPrice> parkingUnitPriceList;
	
	private double averagePrice;
	
	private ParkingLot parkingLot;
	
	private Charging charging;
	
	public ParkingUnitPriceMapping() {
		parkingUnitPriceList=new ArrayList<ParkingUnitPrice>();
	}

	public double getAveragePrice() {
		return averagePrice;
	}



	public void setAveragePrice(double averagePrice) {
		this.averagePrice = averagePrice;
	}



	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

	public ParkingPlace getParkingPlace() {
		return parkingPlace;
	}

	public void setParkingPlace(ParkingPlace parkingPlace) {
		this.parkingPlace = parkingPlace;
	}

	public List<ParkingUnitPrice> getParkingUnitPriceList() {
		return parkingUnitPriceList;
	}

	public void setParkingUnitPriceList(List<ParkingUnitPrice> parkingUnitPriceList) {
		this.parkingUnitPriceList = parkingUnitPriceList;
	}
	
	
	public ParkingLot getParkingLot() {
		return parkingLot;
	}



	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	public Charging getCharging() {
		return charging;
	}

	public void setCharging(Charging charging) {
		this.charging = charging;
	}

	@Override
	public String toString() {
		return "ParkingUnitPriceMapping [money=" + money + ", parkingPlace=" + parkingPlace + ", parkingUnitPriceList="
				+ parkingUnitPriceList + ", averagePrice=" + averagePrice + ", parkingLot=" + parkingLot + ", charging="
				+ charging + "]";
	}

	

	

}
