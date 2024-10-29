package Assignment44_Aug24;

interface AirIndia{
	void EnterApiKey(String api);
	void EnterApiKeyValue(long apiValue);
}
class MakeMyTrip implements AirIndia{

	public void EnterApiKey(String api) {
		System.out.println("Enter the API Key: "+ api);
	}
	
	public void EnterApiKeyValue(long apiValue) {
		System.out.println("Enter the Password: "+ apiValue);
	}
}

public class Asg44_Interface {
	public static void main(String[] args) {
		MakeMyTrip mmt = new MakeMyTrip();
		mmt.EnterApiKey("qwertykeypadatozalphabets");
		mmt.EnterApiKeyValue(123456789);
	}
}
