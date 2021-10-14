package cn.windssoft.patterns.structure;

public class VlcPlayer implements VideoPlayer {
	@Override
	public void play() {
		System.out.println("VlcPlayer is playing video.");
	}
}
