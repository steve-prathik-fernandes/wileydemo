package CollectionInfo;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Vector;

	public class Comparision {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int size = 1000000;
			List<Integer> mylist = new ArrayList<>();
			long start_time = System.currentTimeMillis();
			for(int i=0;i<size;i++) {
				mylist.add(size);
			}
			long end_time = System.currentTimeMillis();
			
						long result = (long) (end_time-start_time);
//			System.out.println("Time taken for adding array list of " + size + " is " + (end_time-start_time));
			System.out.println("Time taken for adding array list of " + size + " is " + result);
			
			
			List<Integer> my_vector = new Vector<>();
			long start_time1 = System.currentTimeMillis();
			for(int i=0;i<size;i++) {
				my_vector.add(size);
			}
//			long end_time1 = System.currentTimeMillis();
			long result1 = (long) end_time-start_time;
//			System.out.println("Time taken for adding vector list of " + size + " is " + (end_time1-start_time1));
			System.out.println("Time taken for adding vector list of " + size + " is " + result1);

		}

	}
