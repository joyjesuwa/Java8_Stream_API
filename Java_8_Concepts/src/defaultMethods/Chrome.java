package defaultMethods;

public class Chrome implements IBrowser{
	
	@Override
	public void browse() {
		
		System.out.println("Chrome Browser");
		
	}

	public static void main(String[] args) {
		
		IBrowser obj = new Chrome();
		obj.musicPlayer();
		obj.browse();
	

	}



}
