package com.poke.desk.pokeDesk.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	private String name;
	private String type;
	private int height;
	private int weight;
	private int hp;
	
	@Override
	public String toString() {
		return "Pokemon [ID=" + ID + ", name=" + name + ", type=" + type + ", height=" + height + ", weight=" + weight
				+ ", hp=" + hp + "]";
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Pokemon(long iD, String name, String type, int height, int weight, int hp) {
		super();
		ID = iD;
		this.name = name;
		this.type = type;
		this.height = height;
		this.weight = weight;
		this.hp = hp;
	}

	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
