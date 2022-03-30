package ca.senecacollege.genericsm;

import java.util.ArrayList;
import java.util.Comparator;

public class Team<T extends Player> implements Comparable<Team<T>>{

	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<T> members = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
	public boolean addPlayer(T p) {
		if(members.contains(p)) {
			System.out.println(p.getName() + " is already on this team");
			return false;
		} else {
			members.add(p);
			System.out.println(p.getName() + " is added to the team "+ this.name);
			return true;
		}
		
	}
	
	public int numOfPlayers() {
		return this.members.size();
	}
	
	public void matchResults(Team<T> opponent, int ourScore, int theirScore) {
		if(ourScore > theirScore) {
			won++;
		} else if( ourScore == theirScore) {
			tied++;
		} else {
			lost++;
		}
		played++;
		
		if(opponent != null) {
			opponent.matchResults(null, theirScore, ourScore);
		}
		
	}
	
	public int ranking() {
		return (won * 2) + tied;
	}

	@Override
	public int compareTo(Team<T> o) {
		if(this.ranking() > o.ranking()) {
			return -1;
		} else if (this.ranking() < o.ranking()) {
			return 1;
		}
		return 0;
	}

}
