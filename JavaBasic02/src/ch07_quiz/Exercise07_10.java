package ch07_quiz;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	private int prev; 
	
	/*
		(1) 알맞은 코드를 넣어 완성하시오. 
	*/
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public boolean getIsPowerOn() {
		return isPowerOn;
	}
	
	public void setChannel(int channel) {
		if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL) {
			prev = this.channel;
			this.channel = channel;
		}
	}
	public int getChannel() {
		return channel;
	}
	
	public void setVolume(int volume) {
		if(MIN_VOLUME <= volume && volume <= MAX_VOLUME)
			this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
	
	/*
		(1) 문제7-10의 MyTv2클래스에 gotoPrevChannel메서드를 추가하여 완성하시오.    
	*/
	public void gotoPrevChannel() {
		int temp = channel;
		channel = prev;
		prev = temp;
	}
}


public class Exercise07_10 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
	}
}
