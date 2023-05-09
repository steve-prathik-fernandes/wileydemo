package CollectionInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) throws InterruptedException {
		int size = 100000;

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> VectorList = new Vector<>();
		
		List<Integer> multiThreadList = Collections.synchronizedList(new ArrayList<>());
		List<Integer> multiThreadVectorList=new Vector<>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			arrayList.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ATime Taken = " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			VectorList.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("VTime Taken = " + (end - start));

		Thread t3 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadList.add(i);

			}
		});

		Thread t4 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadList.add(i);
			}
		});
	
		t3.start();
		t4.start();
		t3.join();
		t4.join();
		end=System.currentTimeMillis();
		System.out.println(multiThreadList.size());
		System.out.println("Time taken in multithread to add"+size+"values in vector: "+(end-start));
		
	}
}
