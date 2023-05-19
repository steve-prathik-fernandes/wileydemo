package optimization;


//code movement ->> loop invariant code motion
//
public class StrengthReduction {
    public static void main(String[] args) {

    }

//	public int calcSum(int[] array) {
//		int sum = 0;
//		for(int i = 0; i< array.length; i++) {
//			//int square = array[i] * array[i];
//			//sum += square;
//			sum += array[i];
//		}
//
//		return sum * sum;
//	}

//Strength reduction

    public int calcTotal(int n) {
        int sum = 0;
        for(int i = 0; i< n; i++) {
            sum += i * 5;
        }

        return sum;
    }
}
