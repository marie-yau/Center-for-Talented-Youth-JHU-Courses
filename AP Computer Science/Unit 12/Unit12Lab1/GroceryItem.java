
public class GroceryItem {
	private int serialNumber, shelfLife;
        // constructor
	public GroceryItem(int serialNumber, int shelfLife) {
		this.serialNumber = serialNumber;
		this.shelfLife = shelfLife;
	}
        // getters and setters
	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}
	
}
