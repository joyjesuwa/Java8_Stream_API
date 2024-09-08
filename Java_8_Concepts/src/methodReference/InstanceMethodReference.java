package methodReference;


interface IVanakkam{
	public void vanakkam(String str);
}
public class InstanceMethodReference {
	
	public void greet(String name) {
		System.out.println("Vanakkam " + name);
	}

	public static void main(String[] args) {
		
		InstanceMethodReference obj = new InstanceMethodReference();
		IVanakkam ins = obj::greet;
		ins.vanakkam("Joy");

	}

}
