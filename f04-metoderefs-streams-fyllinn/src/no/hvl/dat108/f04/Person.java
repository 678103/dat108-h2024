package no.hvl.dat108.f04;

public record Person(String firstName, String lastName, int age) 
		implements Comparable<Person> {

	public Object xtractor;

	@Override
	public int compareTo(Person other) {
		return this.lastName.compareTo(other.lastName);
	}
}
