package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void save(Game game) {
		System.out.println("Kaydedildi : " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Güncellendi : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Silindi : " + game.getGameName());
		
	}

}
