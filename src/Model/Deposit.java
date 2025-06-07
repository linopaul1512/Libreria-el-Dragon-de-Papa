package Model;

public class Deposit {
	String Code, Name, Type, Status;

	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
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
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	public Deposit(String code, String name, String type, String status) {
		Code = code;
		Name = name;
		Type = type;
		Status = status;
		
	}
}
