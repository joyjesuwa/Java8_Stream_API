package methodReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// remove duplicates in list by converting list to set
		//Traditional way
		List<String> herosList = new ArrayList<>();
		herosList.add("Batman");
		herosList.add("Sperman");
		herosList.add("Flashman");
		herosList.add("Batman");
		System.out.println(herosList);
		
		Set<String> herosSet = new HashSet<>(herosList);
		System.out.println(herosSet);
		
		//using Lambda style
		Function<List<String>, Set<String>> lambdaObj = list -> new HashSet<>(list);
		System.out.println(lambdaObj.apply(herosList));
		
		//using method reference
		Function<List<String>, Set<String>> mRObj = HashSet::new;
		System.out.println(mRObj.apply(herosList));
		

	}

}
