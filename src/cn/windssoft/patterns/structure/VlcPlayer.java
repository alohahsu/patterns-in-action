package cn.windssoft.patterns.structure;

public class VlcPlayer implements AdvancedPlayer {
	@Override
	public void playVideo() {
		System.out.println("VlcPlayer is playing video.");
	}

	@Override
	public void playAudio() {
		System.out.println("VlcPlayer is playing audio.");
	}
}
