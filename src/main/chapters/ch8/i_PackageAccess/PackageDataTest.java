package chapters.ch8.i_PackageAccess;

/**
 * Created by Frank Borges XPTHQ on 3/1/2018.
 */
public class PackageDataTest{
	public static void main(String[] args) {
		PackageData packageData = new PackageData();
		
		// output String rep of pakcageData
		System.out.printf("After instantiation:%n%s%n",packageData);
		
		// change package accesss data in packageData obj
		packageData.number = 77;
		packageData.string = "Goodbye";
		
		// output String rep of packageData
		System.out.printf("%nAfter changing values:%n%s%n", packageData);
	}
}

class PackageData{
	int number;     // package-access instance var
	String string;  // package-access instance var
	
	// constructor
	public PackageData() {
		number = 0;
		string = "Hello";
	}
	
	// return PackageData obj String rep
	public String toString() {
		return String.format("number: %d; string: %s",  number, string);
	}
}
