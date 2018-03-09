package chapters.ch10.c_CreatingAndUsingInterfaces;

/**
 * Created by Frank Borges XPTHQ on 3/8/2018.
 */
public class Invoice implements Payable {
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		if (quantity < 0) // validate
			throw new IllegalArgumentException("Quanity must be >= 0");
		
		if (pricePerItem < 0.0) // validate
			throw new IllegalArgumentException("Price per Item must be >= 0.0");
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	// return partNumber
	public String getPartNumber() {
		return partNumber;  // should validate
	}
	
	// return partDescription
	public String getPartDescription() {
		return partDescription;
	}
	
	// set quantity
	public void setQuantity(int quantity) {
		if (quantity < 0) // validate
			throw new IllegalArgumentException("Quanity must be >= 0");
		
		this.quantity = quantity;
	}
	
	// return quantity
	public int getQuantity() {
		return quantity;
	}
	
	// set pricePerItem
	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem < 0.0) // validate
			throw new IllegalArgumentException("Price per Item must be >= 0.0");
		
		this.pricePerItem = pricePerItem;
	}
	
	// return pricePerItem
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	// return String rep of Invoice object
	@Override
	public String toString() {
		return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
				"invoice", "part number", getPartNumber(), getPartDescription(),
				"quantity", getQuantity(), "price per item",  getPricePerItem());
	}
	
	// method requrired to carry out contract with interface
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}
}
