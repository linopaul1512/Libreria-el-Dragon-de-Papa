package Model;

public class Deparment {

	
	private String CodeArt, CodeDep, Name, Type, Status;
	 
	
	

	public String getCodeDep() {
		return CodeDep;
	}

	public void setCodeDep(String codeDep) {
		CodeDep = codeDep;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	
	
	
	public Deparment(String codDep, String name, String type, String status) {
		CodeDep = codDep;
		Name = name;
		Type = type;
		Status = status;
	}
	
}
