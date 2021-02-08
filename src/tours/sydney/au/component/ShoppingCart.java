package tours.sydney.au.component;

import java.util.ArrayList;

import tours.sydney.au.dao.Tours;
import tours.sydney.au.promotion.PromotionalRules;


public class ShoppingCart {
	ArrayList<Tours> cart = new ArrayList<Tours>();
	PromotionalRules promotionalrules;

	public ShoppingCart(PromotionalRules promotionalrules) {
		this.promotionalrules = promotionalrules;
	}

	public void add(String id) {
		
		cart.add(Tours.valueOf(id));
	}

	public int total() {
		int totalPrice = 0;
		int operaTickets = 0;
		int bridgeTickets = 0;
		int towerTickets = 0;

		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).name() == "OH") {
				operaTickets++;
			}
			if (cart.get(i).name() == "BC") {
				bridgeTickets++;
			}
			if (cart.get(i).name() == "SK") {
				towerTickets++;
			}
		}

		int ohp = promotionalrules.operaHousePromotion(operaTickets, Tours.valueOf("OH").name());
		int stp = promotionalrules.skyTowerPromotion(operaTickets, towerTickets, Tours.valueOf("SK").name());
		int sbcp = promotionalrules.sydneyBridgeClimbPromotion(bridgeTickets, Tours.valueOf("BC").name());

		totalPrice = ohp + stp + sbcp;

		return totalPrice;
	}
}
