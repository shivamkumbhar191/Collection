package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Movie{
	int id;
	String moviename;
	String actorname;
	public Movie(int id, String moviename, String actorname) {
		super();
		this.id = id;
		this.moviename = moviename;
		this.actorname = actorname;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", moviename=" + moviename + ", actorname=" + actorname + "]";
	}
	
}

public class MovieHashMap {

	public static void main(String[] args) {
		ArrayList<Movie> al= new ArrayList<>();
		al.add(new Movie(101,"pk","amir"));
		al.add(new Movie(109,"sultan","salman"));
		al.add(new Movie(106,"dangal","amir"));
		al.add(new Movie(102,"ashique2","adityaRoy"));
		al.add(new Movie(103,"gumrahh","adityaRoy"));
		al.add(new Movie(114,"cctc","akshay"));
		System.out.println(al);
		for(Movie m:al) {
			System.out.println(m);
		}
		HashMap<String,ArrayList<String>> hm=new HashMap<>();
		ArrayList<String> movielist=new ArrayList<>();
		
		Iterator<Movie> itr= al.iterator();
		while(itr.hasNext()) {
			Movie movie=itr.next();
			if(hm.containsKey(movie.actorname)) {
				movielist=hm.get(movie.actorname);
				movielist.add(movie.moviename);
			}else {
				movielist=new ArrayList<>();
				movielist.add(movie.moviename);
			}
			hm.put(movie.actorname,movielist);
		}
		for(Map.Entry<String, ArrayList<String>> me:hm.entrySet()){
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		

	}

}
