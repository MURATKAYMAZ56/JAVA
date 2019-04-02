package model;

import java.util.ArrayList;

public class Bag<T> {
	private ArrayList<T> array;

	public Bag() {
		setArray(new ArrayList<T>());
	}

	public Bag(ArrayList<T> array) {
		setArray(array);

	}

	private void setArray(ArrayList<T> array) {

		this.array = array;
	}

	public ArrayList<T> getArray() {
		return array;
	}

	public void add(T item) {
		getArray().add(item);

	}

	public int size() {
		return getArray().size();
	}

	public boolean isEmpty() {
		if (getArray().size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	public int count(T item) {
		int numberOfItem=0;
		for (T itemInList :this.array) {
			if(item.equals(itemInList)) {
				numberOfItem++;
			}
		}
		return numberOfItem;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		if (this.array.size() == 0) {
			return "Your bag is empty";

		}
		for (T item : this.array) {
			sb = sb.append(item).append("\n");
			

		}
		return sb.toString();
	}

}
