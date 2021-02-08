package tours.sydney.au.main;

import tours.sydney.au.component.ShoppingCart;
import tours.sydney.au.promotion.PromotionalRules;

public class AutomicApplication {

	public static void main(String[] args) {
		PromotionalRules promotionalrules = new PromotionalRules();
		ShoppingCart myCart = new ShoppingCart(promotionalrules);
		String s ="OH OH OH BC";
		//String s ="BC BC BC BC BC OH";
		//String s ="OH SK";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			myCart.add(split[i]);
		}
		System.out.println(myCart.total());
	}

}
