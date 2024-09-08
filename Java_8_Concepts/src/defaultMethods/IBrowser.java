package defaultMethods;

@FunctionalInterface
public interface IBrowser {
	
	void browse();
	
	default void musicPlayer() {  //default is not access modifier it is a keyword...Access modifier will not be suitable in Interface and for default access modifier they will not mention anything.
		System.out.println("Music Player");
	}

}
