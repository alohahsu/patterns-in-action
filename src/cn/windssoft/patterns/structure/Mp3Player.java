package cn.windssoft.patterns.structure;

public class Mp3Player implements AudioPlayer {
	@Override
	public void playAudio() {
		System.out.println("Mp3Player is playing mp3 file.");
	}
}
