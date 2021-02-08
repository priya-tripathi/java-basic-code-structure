package tours.sydney.au.promotion;

import tours.sydney.au.dao.Tours;

public class PromotionalRules {
	
	public int skyTowerPromotion(int operaTickets, int towerTickets, String id) {
		if (operaTickets > towerTickets) {
			towerTickets = 0;
		} else {
			towerTickets = towerTickets - operaTickets;
		}
		return towerTickets * Tours.fromValue(id);
	}

	public int operaHousePromotion(int operaTickets, String id) {

		int reduction = 0;
		int temp = operaTickets;
		while (temp >= 3) {
			temp = temp - 3;
			reduction++;
		}
		operaTickets = operaTickets - reduction;
		return operaTickets * Tours.fromValue(id);

	}

	public int sydneyBridgeClimbPromotion(int bridgeTickets, String id) {

		if (bridgeTickets > 4) {
			return bridgeTickets * (Tours.fromValue(id) - 20);
		}
		return bridgeTickets * Tours.fromValue(id);

	}

}
