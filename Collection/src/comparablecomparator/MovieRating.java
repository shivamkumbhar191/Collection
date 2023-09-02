package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class  Movie{
	int id;
	String name;
	float rating;
	public Movie(int id, String name, float rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
}
public class MovieRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> al= new ArrayList<Movie>();
		al.add(new Movie(101,"rrr",7.4f));
		al.add(new Movie(106,"kgf2",8.1f));
		al.add(new Movie(104,"pusha",8.6f));
		al.add(new Movie(108,"vikram",8.2f));
		System.out.println("Before Sort");
		for(Movie m:al) {
			System.out.println(m);
		}
		Collections.sort(al,new RatingSort());
		System.out.println("After Sort");
		for(Movie m1:al) {
			System.out.println(m1);
		}

	}

}
class RatingSort implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return  Float.compare(o2.rating,o1.rating);
	}	
}
