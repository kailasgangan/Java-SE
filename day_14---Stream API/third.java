package core1;

import java.util.ArrayList;
import java.util.List;

class Player{
	private int playerID;
	private String name;
	private int run;
	private String countryname;
	public Player(int playerID, String name, int run, String countryname) {
		super();
		this.playerID = playerID;
		this.name = name;
		this.run = run;
		this.countryname = countryname;
	}
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	
}
public class fg{
	public static void indian(List<Player> lst) {
		 lst.stream().filter(i->i.getCountryname()=="india").forEach(System.out::println);
	} 
	public static long morethan5000(List<Player> lst) {
		return lst.stream().filter(i->i.getRun()>5000).count();
	}
	public static void main(String args[]) {
		List<Player> lst=new ArrayList<Player>();
		lst.add(new Player(1,"sachin",12000,"india"));
		lst.add(new Player(2,"Dohni",8000,"india"));
		lst.add(new Player(3,"virat",10000,"india"));
		lst.add(new Player(4,"sharma",9000,"india"));
		lst.add(new Player(5,"polard",4000,"westindies"));
		lst.add(new Player(6,"bravo",6000,"westindies"));
		lst.add(new Player(7,"smith",7000,"Austelia"));
		lst.add(new Player(8,"warner",8000,"Austelia"));
		lst.add(new Player(9,"hafiz",4000,"pakistan"));
		lst.add(new Player(10,"rahane",7000,"india"));
		
	     fg.indian(lst);
	
		long l=fg.morethan5000(lst);
		System.out.println("players have scored more than 5000 runs= "+l);
	}
}