package com.bridgelabz.AutowireByConstructor;

public class Performer {

	Instrument instrument;

	public Performer(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Performer [instrument=" + instrument + "]";
	}

}
