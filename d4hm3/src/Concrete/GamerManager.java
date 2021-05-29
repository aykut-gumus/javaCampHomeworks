package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	private GamerCheckService _gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this._gamerCheckService = gamerCheckService;
	}

	@Override
	public void save(Gamer gamer) {
		if(_gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Oyuncu kaydedildi : " + gamer.getFirstName());
		}else {
			System.out.println("Sahte Kiþi Tespiti");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName());
		
	}

}
