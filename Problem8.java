/*
												* Problem 8 *
	Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value
	of this product?
*/

// Imports the java.lang class to use the String class
import java.lang.*;

public class Problem8 {
	public static void main(String[] args){

		// Declares and initializes the string containing the number
		String s;

		s = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450" ;

		// Measures the size of the string, and makes an array of that size
		int size = s.length();
		int a[] = new int[size];

		// Fills the array with the values in the string, which are changed from string values
		for(int i = 0; i < (a.length); i++){
			a[i] = Integer.parseInt(s.substring(i,(i+1)));
		}

		// Declares and initializes the numbers for the greatest digits, and the general sequence of digits
		int g, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12, g13;
		int n, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13;

		g1 = 0;
		g2 = 0;
		g3 = 0;
		g4 = 0;
		g5 = 0;
		g6 = 0;
		g7 = 0;
		g8 = 0;
		g9 = 0;
		g10 = 0;
		g11 = 0;
		g12 = 0;
		g13 = 0;
		g = 0;

		// Scans through the array and takes the product of the adjacent numbers
		for(int k = 0; k < (a.length-13); k++){
			 n1 = a[k];
			 n2 = a[k+2];
			 n3 = a[k+3];
			 n4 = a[k+4];
			 n5 = a[k+5];
			 n6 = a[k+6];
			 n7 = a[k+7];
			 n8 = a[k+8];
			 n9 = a[k+9];
			 n10 = a[k+10];
			 n11 = a[k+11];
			 n12 = a[k+12];
			 n13 = a[k+13];
			 n = n1 * n2 * n3 * n4 * n5 * n6 * n7 * n8 * n9 * n10 * n11 * n12 * n13;

			// Checks if the product is greater than the current greatest value, and assigns it as the greatest if it is
			if(n > g){
				g1 = n1;
				g2 = n2;
				g3 = n3;
				g4 = n4;
				g5 = n5;
				g6 = n6;
				g7 = n7;
				g8 = n8;
				g9 = n9;
				g10 = n10;
				g11 = n11;
				g12 = n12;
				g13 = n13;
				g = n;
			}
			else{
				continue;
			}
		}

		// Prints out the result of the operation
		System.out.println("The greatest product achieved by 13 adjacent numbers is: " + g1 + " * "+ g2 + " * "+ g3 + " * "+ g4 + " * "+ g5 + " * "+ g6 + " * "+ g7 + " * "+ g8 + " * "+ g9 + " * "+ g10 + " * "+ g11 + " * "+ g12 + " * " + g13 + " = " + g);
	}
}
