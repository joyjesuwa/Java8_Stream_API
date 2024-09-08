package staticMethod;

public interface IStringUtils {
	
	public static String convertToUpperCase(String str) { //Static methods can have impl in interface after Java 1.8
		return str.toUpperCase();
	}
	
	public static String convertToLowerCase(String str) {
		return str.toLowerCase();
		
	}

}
