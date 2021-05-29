package Adapter;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getBirthYear().getYear());

		} catch (NumberFormatException e) {
		} catch (RemoteException e) {

		}
		return result;
	}

}
