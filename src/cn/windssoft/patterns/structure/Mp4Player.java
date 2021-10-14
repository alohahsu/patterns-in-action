package cn.windssoft.patterns.structure;

public class Mp4Player implements AdvancedPlayer {
	@Override
	public void playVideo() {
		System.out.println("Mp4Player is playing video.");
	}

	@Override
	public void playAudio() {
		System.out.println("Mp4Player is playing audio.");
	}
}
