public class CampaignManager {
	
	public void add(Campaign campaign) {
		
	
		System.out.println("kampanyalar ba�lad� :"+ campaign.getCampaignName());
	}
	public void finish(Campaign campaign) {
		
		System.out.println("Kampanyalar bitti." + campaign.getCampaignName());
	
	}

}