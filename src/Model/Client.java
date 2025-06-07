package Model;

public class Client {

	private String CodeClient, Name, Lastname, Sex, Adress, ID, Status;	
	
	public String getCodeClient() {
		return CodeClient;
	}
	public void setCodeClient(String codeClient) {
		CodeClient = codeClient;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	public Client(String codclient, String name, String lastname, String sex, String adress, String id, String status ){
		CodeClient = codclient;
		Name = name;
		Lastname = lastname;
		Sex = sex;
		Adress = adress; 
		ID = id;
		Status = status;
		
	}
}
