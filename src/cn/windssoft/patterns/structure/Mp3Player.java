package cn.windssoft.patterns.structure;

public class Mp3Player implements AudioPlayer {
	@Override
	public void play() {
		System.out.println("Mp3Player is playing audio.");
	}
}
