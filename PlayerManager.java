
public class PlayerManager {
  public void add(Player player) {
	  System.out.println("kay�t olan ki�in�n ad� ve soyad� : "+ player.getFirstName() + "  " + player.getLastName());
  }
  
  public void update(Player player) {
	  System.out.println("TC numaran�z:" + player.getNationalIdentity());
	  System.out.println("bilgiler g�ncellendi.");
  }
  public void delete(Player player) {
	  System.out.println("hesab� silen ki�inin ad� ve soyad� : " + player.getFirstName() + "  " + player.getLastName());
  }
}
