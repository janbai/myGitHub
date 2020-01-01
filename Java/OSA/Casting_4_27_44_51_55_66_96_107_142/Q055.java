package Casting_4_27_44_51_55_66_96_107_142;
//Q055
public class Q055 {

	public static void main(String[] args) {

		byte 	bVar = 12;
		short	sVar = 126;
		int 	iVar = 100;
		long 	lVar = 102l;
		float 	fVar = 100.100f;
		double 	dVar = 123;
		
		
	// 	iVar = fVar; // compilation fail Type mismatch: cannot convert from float to int
		fVar = iVar;
		dVar = fVar;
	//	fVar = dVar;// compilation fail Type mismatch: cannot convert from double to float
		dVar = iVar;
	//	iVar = dVar;// compilation fail Type mismatch: cannot convert from double to int
		sVar = bVar;
		lVar = iVar;
		sVar = bVar;
		
		
	}

}
