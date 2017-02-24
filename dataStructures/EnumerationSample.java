package dataStructures;

public class EnumerationSample {

	public enum PackageLoading {
		ALGOS(1),
		DATA_STRUCTURES(2),
		DESIGN_PATTERNS(3),
		LISTS(4),
		MAPS(5),
		SETS(6);

		final int packageCode;

		PackageLoading(int i) {
			this.packageCode = i;
		}
	}


	public static final EnumerationSample EnumSampleInstance = new EnumerationSample();
	
	private EnumerationSample() {
		
	}
	
	public static EnumerationSample getInstance(){
		return EnumSampleInstance;
	}

	public int getPackageLoadingValues(PackageLoading packageName){

		switch (packageName){

			default:
			case ALGOS:
				return PackageLoading.ALGOS.packageCode;

			case DATA_STRUCTURES:
				return PackageLoading.DATA_STRUCTURES.packageCode;

			case DESIGN_PATTERNS:
				return PackageLoading.DESIGN_PATTERNS.packageCode;

			case LISTS:
				return PackageLoading.LISTS.packageCode;

			case MAPS:
				return PackageLoading.MAPS.packageCode;

			case SETS:
				return PackageLoading.SETS.packageCode;
		}
	}

	public PackageLoading[] getPackageLoader(){
		return PackageLoading.values();
	}


}
