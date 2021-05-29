import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "Aykut", "Gümüþ", LocalDate.of(1988, 5, 22), "13265469847");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.save(gamer);
		gamerManager.delete(gamer);
		System.out.println("-----------------------------");
		
		Game game = new Game(1, "Doom II", 60);
		GameManager gameManager = new GameManager();
		gameManager.save(game);
		gameManager.update(game);
		System.out.println("-----------------------------");
		
		Campaign campaign = new Campaign(1, "19 Mayis Bayrami Kampanyasi", 50, "Bayrama özel MS-Dos Oyunlarinda %50 indirim");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.update(campaign);
		System.out.println("-----------------------------");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(gamer, game);
		saleManager.saleCampaign(gamer, game, campaign);
	}

}
