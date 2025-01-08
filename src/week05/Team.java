package week05;

import java.util.*;

public class Team {

	private List<Player> players = new ArrayList<>();
	private String name;
	
	public Team(String name) {
		this.setName(name);
	}
	
	public void describe() {
		System.out.println("Team Name: " + name);
		for (Player player :  players) {
			player.describe();
		}
	};
	
	public void addPlayer(Player player) {
		players.add(player);
	};
	
	public void removePlayer(String playerName) {
		for (Player player : players) {
			if (player.getName().equals(playerName)) {
				players.remove(player);
			}
		}
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};
	
}
