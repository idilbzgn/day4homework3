
public class PlayerManager {
  public void add(Player player) {
	  System.out.println("kayýt olan kiþinýn adý ve soyadý : "+ player.getFirstName() + "  " + player.getLastName());
  }
  
  public void update(Player player) {
	  System.out.println("TC numaranýz:" + player.getNationalIdentity());
	  System.out.println("bilgiler güncellendi.");
  }
  public void delete(Player player) {
	  System.out.println("hesabý silen kiþinin adý ve soyadý : " + player.getFirstName() + "  " + player.getLastName());
  }
}
