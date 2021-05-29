package Abstract;

import Entities.Campaign;

public interface CampaignService {
	
	public void save(Campaign campaign);
	
	public void update(Campaign campaign);
	
	public void delete(Campaign campaign);

}
