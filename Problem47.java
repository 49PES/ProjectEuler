
public class Problem47{
	
	public static int numDistinctFactors(int num){
	    int value = num;
	    int numFactors = 0;
	    for(int i = 2; i <= value; i++){
	        if(value % i == 0){numFactors++;}
	        while(value % i == 0){value /= i;}
	    }
	    return numFactors;
	}
	
	public static int firstAsMany(int num){
	    // Returns the first integer of a sequence that satisfies the conditions: "num" as many elements in the sequence, each with "num" as many distinct prime factors
	    // Can be generalized to 2, 3, 4, or more - useful for testing 
	    int counter = 0;
	    int i = 1;
	    int index = 0;
	    while(counter < num){
	        if(numDistinctFactors(i) == num) { counter++; index = i; }
	        else { counter = 0; } 
	        i++;
	    }
	    // Returning the index would yield the final-most value in the sequence, but only the first in the sequence is desired
	    return index - num + 1;
	}
	public static void main(String[] args) {
		System.out.println(firstAsMany(4));
	}
}
