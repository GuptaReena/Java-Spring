package mybean;

public class Address {
	
	private int addId;
	private String addCity;
	private String addState;
	
	
	public Address() {
		super();
	}

	public Address(int addId, String addCity, String addState) {
		super();
		this.addId = addId;
		this.addCity = addCity;
		this.addState = addState;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getAddCity() {
		return addCity;
	}

	public void setAddCity(String addCity) {
		this.addCity = addCity;
	}

	public String getAddState() {
		return addState;
	}

	public void setAddState(String addState) {
		this.addState = addState;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addCity=" + addCity + ", addState=" + addState + "]";
	}
	
	

}
