package edu.ncsu.monopoly;

public interface IOwnable {

	String getName();

	AbstractPlayer getProprietary();

	void setProprietary(Player owner);

	String toString();

	void setName(String name);

}