import dataStructures.EnumerationSample;
import dataStructures.EnumerationSample.PackageLoading;

public class Main {
	public static void main(String[] args) {
		System.out.println("Main Starting");

		getPackageList();

	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

	private static void getPackageList(){
		for(EnumerationSample.PackageLoading loader : EnumerationSample.PackageLoading.values()){

			System.out.println(loader);
		}
	}
}