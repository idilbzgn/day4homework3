
public class Main {

	public static void main(String[] args) {
		Player player = new Player(1,"12345678912","İDİL","BEZGİN");
		Game game = new Game(2,15,"GTA V");
		Campaign campaign = new Campaign(3,"Bir alana 2.si %50 indirimli!",50);
		
		PlayerManager playerManager = new PlayerManager();
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager= new CampaignManager();
		
		 
	        playerManager.add(player);
	      
	        
	        campaignManager.add(campaign);
	        
	       
	        
	        player.setFirstName("idil");
	        playerManager.update(player);
	      
	  
	        

	        gameManager.delete(game);
	      
	        
	 
		    campaignManager.finish(campaign);
		    System.out.println("bir dahaki sefere :)");
	}

}
