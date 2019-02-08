// i am creating an ipay software

//package skyebank.user;
public class User {
	private String fullName;
	
	private String email;
	
	private String mobileNumber;
	
	private String homeAddress;
	
	private String dateOfBirth;
	
	private GenderType gender = GenderType.MALE;
	
	private UserStatus userStatus = UserStatus.ALIVE;
	
	public void setFullName(String f){
			
		this.fullName= f; 
		 } 
	public String getFullName() {
		
		return this.fullName;		
	}
	
	
	public static void main(String [] args) {
		
		
		User ipay = new User ();
		
		ipay.setFullName("ipay tools");
		
		
		System.out.println (ipay.getFullName());
		
		
			
	
	}	
	
	
	
	
}