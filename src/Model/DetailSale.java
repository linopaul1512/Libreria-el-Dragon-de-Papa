package Model;

public class DetailSale {
	int Quantity;
	String CodeDS, CodeArt, CodeSale;
	
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getCodeDS() {
		return CodeDS;
	}
	public void setCodeDS(String codeDS) {
		CodeDS = codeDS;
	}
	public String getCodeArt() {
		return CodeArt;
	}
	public void setCodeArt(String codeArt) {
		CodeArt = codeArt;
	}
	public String getCodeSale() {
		return CodeSale;
	}
	public void setCodeSale(String codeSale) {
		CodeSale = codeSale;
	}
	
	
	public DetailSale(String coddsale, String codart, String codsale, int quantity) {
		CodeDS =coddsale;
		CodeArt = codart;
		CodeSale = codsale;
		Quantity = quantity;
	}
}
