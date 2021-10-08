package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player proprietary;
	private boolean available = true;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public AbstractPlayer getProprietary() {
		return proprietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setProprietary(Player owner) {
		this.proprietary = owner;
	}
    
    @Override
	public String toString() {
        return name;
    }

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
