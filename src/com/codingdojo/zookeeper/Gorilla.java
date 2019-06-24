package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("The gorilla threw something at you!");
		displayEnergy();
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The gorilla ate some bananas to satisfy him and increased his energy!");
		displayEnergy();
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("The gorilla climbed a tree but that decreased his energy");
		displayEnergy();
	}
}
