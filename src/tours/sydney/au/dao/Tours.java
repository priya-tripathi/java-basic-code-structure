package tours.sydney.au.dao;

public enum Tours {
	OH("Opera House Tour",300),
	SK("Sydney Sky Tower",30),
	BC("Sydney Bridge Climb", 110);

	private String tourName;
	private int tourPrice;
	
	
	Tours(String tourName, int tourPrice) {
		this.tourName = tourName;
		this.tourPrice = tourPrice;
	}
	
	public String getTourName() {
		return tourName;
	}
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	public int getTourPrice() {
		return tourPrice;
	}
	public void setTourPrice(int tourPrice) {
		this.tourPrice = tourPrice;
	}
	
	
	public String value() {
		return name();
	}
	public static int fromValue(String v) {
		for(Tours type: Tours.values()) {
			if(v.equals(type.name())) {
				return type.getTourPrice();
			}
		}
		return 0;
	}
	
}
