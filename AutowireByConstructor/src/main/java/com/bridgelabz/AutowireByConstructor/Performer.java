package com.bridgelabz.AutowireByConstructor;

public class Performer {

	Instrument instrument;
	Place place;
	int rating;

	public Performer(Instrument instrument, Place place, int rating) {
		this.instrument = instrument;
		this.place = place;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Performer [instrument=" + instrument + ", place=" + place + ", rating=" + rating + "]";
	}

}
