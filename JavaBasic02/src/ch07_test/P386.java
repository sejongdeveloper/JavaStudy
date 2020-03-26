package ch07_test;

class Tv {
	protected boolean power;
	protected int channel;
	protected int volume;
	
	public void power() { power = !power; }
	public void channelUp() { channel++; }
	public void channelDown() { channel--; }
	public void volumeUp() { volume++; }
	public void volumeDown() { volume--; }
}

class VCR {
	protected int counter; // VCR의 카운터
	
	public void play() {
		// Type을 재생한다.
	}
	
	public void stop() {
		// 재생을 멈춘다.
	}
	
	public void reset() {
		counter = 0;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void setCounter(int c) {
		counter = c;
	}
}

interface IVCR {
	public void play();
	public void stop();
	public void reset();
	public int getCounter();
	public void setCounter(int c);
}

class TVCR extends Tv implements IVCR {

	VCR vcr = new VCR();
	
	@Override
	public void play() {
		vcr.play();
	}

	@Override
	public void stop() {
		vcr.stop();
	}

	@Override
	public void reset() {
		vcr.reset();
	}

	@Override
	public int getCounter() {
		return vcr.getCounter();
	}

	@Override
	public void setCounter(int c) {
		vcr.setCounter(c);
	}
	
}

public class P386 {
	
}
