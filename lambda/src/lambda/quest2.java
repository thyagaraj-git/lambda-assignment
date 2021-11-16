package lambda;


public class quest2 {

	int price;
	String status;
	
	public quest2(int price,String status)
	{
		this.price=price;
		this.status=status;
	}

	@Override
	public String toString() {
		return "quest2 [price=" + price + ", status=" + status + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
