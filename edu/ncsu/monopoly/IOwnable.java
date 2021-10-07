package edu.ncsu.monopoly;

public interface IOwnable {

	String getName();

	Player getProprietary();

	void setProprietary(Player owner);

	String toString();

}