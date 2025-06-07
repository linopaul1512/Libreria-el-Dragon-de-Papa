package Model;

public class Article {
	String CodeArt, CodeDeparment, Name, Status;
	double Price;

	
	
	public String getCodeArt() {
		return CodeArt;
	}
	public void setCodeArt(String codeArt) {
		CodeArt = codeArt;
	}
	public String getCodeDeparment() {
		return CodeDeparment;
	}
	public void setCodeDeparment(String codeDeparment) {
		CodeDeparment = codeDeparment;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}


	
	public Article(String codeart, String codedeparment, String name, double price, String status)
	{	
		 CodeArt = codeart;
		 CodeDeparment = codedeparment;
		 Name = name;
		 Price = price;
		 Status = status;
	
	}
}
