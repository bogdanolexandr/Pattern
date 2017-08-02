package com.prototype;

public class Lamb implements Copyeable {

	private int height;
	private int length;
	private int weight;

	public Lamb(int height, int length, int weight) {
		this.height = height;
		this.length = length;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Lamb [height=" + height + ", length=" + length + ", weight=" + weight + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lamb other = (Lamb) obj;
		if (height != other.height)
			return false;
		if (length != other.length)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public Object copy() {
		return new Lamb(height, length, weight);
	}

}
