
public class Campaign {
private int id;
private String CampaignName;
int discount;

public Campaign(int id, String CampaignName, int discount) {
	super();
	this.id = id;
	this.CampaignName = CampaignName;
	this.discount = discount;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCampaignName() {
	return CampaignName;
}

public void setCampaignName(String CampaignName) {
	this.CampaignName = CampaignName;
}

public int getDiscount() {
	return discount;
}

public void setDiscount(int discount) {
	this.discount = discount;
}

}
