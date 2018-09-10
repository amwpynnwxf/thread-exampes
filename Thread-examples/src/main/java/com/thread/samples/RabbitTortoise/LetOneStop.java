package com.thread.samples.RabbitTortoise;

import com.thread.samples.RabbitTortoise.Animal.CallToBack;

public class LetOneStop implements CallToBack {
	Animal animal;
	
	public LetOneStop(Animal an){
		animal = an;
	}
	
	@Override
	public void win() {
		//animal.stop();
		animal.stopMe = true;
	}

}
