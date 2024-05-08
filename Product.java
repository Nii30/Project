
public class Product 
{
	private int pid;
	private String pname;
	private double price;
	private String company;
	private int qty;

	public Product(){
		
	}

	public Product(int pid, String pname, double price, String company, int qty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.company = company;
		this.qty = qty;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	

}
