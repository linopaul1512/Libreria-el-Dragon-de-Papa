package Model;

import javax.swing.JLabel;

public class Sale {

	private String Codesale, CodeDS, Codeclient, Date, CodeArt, NameArt, CustomerName, CodeClient, TypeDeposit, CodeDeposit, Status;
	private double IVA, Total, SubTotal;
	int Quantity;
	

	
	public String getCodesale() {
		return Codesale;
	}



	public void setCodesale(String codesale) {
		Codesale = codesale;
	}



	public String getCodeclient() {
		return Codeclient;
	}



	public void setCodeclient(String codeclient) {
		Codeclient = codeclient;
	}



	public String getDate() {
		return Date;
	}



	public void setDate(String date) {
		Date = date;
	}



	public String getCodeArt() {
		return CodeArt;
	}



	public void setCodeArt(String codeArt) {
		CodeArt = codeArt;
	}



	public String getNameArt() {
		return NameArt;
	}



	public void setNameArt(String nameArt) {
		NameArt = nameArt;
	}



	public String getCustomerName() {
		return CustomerName;
	}



	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}



	public String getCodeClient() {
		return CodeClient;
	}



	public void setCodeClient(String codeClient) {
		CodeClient = codeClient;
	}



	public double getIVA() {
		return IVA;
	}



	public void setIVA(double iVA) {
		IVA = iVA;
	}



	public double getTotal() {
		return Total;
	}



	public void setTotal(double total) {
		Total = total;
	}



	public double getSubTotal() {
		return SubTotal;
	}



	public void setSubTotal(double subTotal) {
		SubTotal = subTotal;
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



	public String getTypeDeposit() {
		return TypeDeposit;
	}



	public void setTypeDeposit(String typeDeposit) {
		TypeDeposit = typeDeposit;
	}



	public String getCodeDeposit() {
		return CodeDeposit;
	}



	public void setCodeDeposit(String codeDeposit) {
		CodeDeposit = codeDeposit;
	}



	public Sale(String codsale, String codds, String codclient, String customername, String nameart, String date, String codart, String codeposit, String typedeposit, int quantity, double iva, double subtotal, double total, String status) {
		Codesale = codsale;
		CodeDS = codds;
		Codeclient = codclient;
		CustomerName = customername;
		Date = date;
		CodeArt = codart;
		NameArt = nameart;
		CodeDeposit = codeposit;
		TypeDeposit = typedeposit;
		Quantity = quantity;
		IVA = iva;
		SubTotal = subtotal;
		Total = total;
		Status = status;
	}
	
	

}
