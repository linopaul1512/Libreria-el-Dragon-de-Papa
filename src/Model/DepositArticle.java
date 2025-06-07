package Model;

public class DepositArticle {
	String CodeDA, Codeart, CodeDeposit, Status;
	int Quantity;
	
	
	public String getCodeDA() {
		return CodeDA;
	}
	public void setCodeDA(String codeDA) {
		CodeDA = codeDA;
	}
	public String getCodeart() {
		return Codeart;
	}
	public void setCodeart(String codeart) {
		Codeart = codeart;
	}
	public String getCodeDeposit() {
		return CodeDeposit;
	}
	public void setCodeDeposit(String codeDeposit) {
		CodeDeposit = codeDeposit;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	public DepositArticle(String code, String codart, String codedeposit, int quantity) {
		CodeDA = code;
		Codeart = codart;
		CodeDeposit  = codedeposit;
		Quantity = quantity;
		
	} 
	
}
