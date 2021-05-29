package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	public void sale(Gamer gamer, Game game);
	
	public void saleCampaign(Gamer gamer, Game game, Campaign campaign);
	
}
