package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + game.getGameName() + " oyununu " + game.getPrice() + " TL'ye satin aldi. ");
		
	}

	@Override
	public void saleCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + game.getGameName() + " " + " oyununu " 
							+ (game.getPrice() - (game.getPrice() * campaign.getDiscountPercent() / 100)) + " TL'ye satin aldi. ");
		
	}

}
