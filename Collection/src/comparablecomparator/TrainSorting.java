package comparablecomparator;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class Train implements Comparable<Train>{
	int trainNo;
	String trainName;
	int noOfSeats;
	public Train(int trainNo, String trainName, int noOfSeats) {
		
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.noOfSeats = noOfSeats;
	}
	@Override
	public String toString() {
		return "[" + trainNo + ", " + trainName + ", " + noOfSeats + "]";
	}
	@Override
	public int compareTo(Train o) {
		if(this.noOfSeats==o.noOfSeats) {
			return this.trainNo-o.trainNo;
		}
		else {
			return o.noOfSeats-this.noOfSeats;
		}
	}
}

public class TrainSorting {

	public static void main(String[] args) {
		LinkedList<Train> ll=new LinkedList<>();
		ll.add(new Train(1148,"VandeBharat",300));
		ll.add(new Train(7713,"SwarnJayanti",300));
		ll.add(new Train(6641,"NizamuddinExp",250));
		ll.add(new Train(6123,"DusashanExp",280));
		System.out.println("Before sorting");
		Iterator<Train>itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After sorting");
		Collections.sort(ll);
		
		ListIterator<Train>litr=ll.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
	
	}

}
