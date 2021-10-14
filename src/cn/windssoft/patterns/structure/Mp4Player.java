package cn.windssoft.patterns.structure;

public class Mp4Player implements VideoPlayer {
	@Override
	public void play() {
		System.out.println("Mp4Player is playing video.");
	}
}
