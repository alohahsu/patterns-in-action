package cn.windssoft.patterns.structure;

public class Mp4Player implements VideoAudioPlayer {
	@Override
	public void playVideo() {
		System.out.println("Mp4Player is playing mp4 file.");
	}

	@Override
	public void playAudio() {
		System.out.println("Mp4Player is playing mp3 file.");
	}
}
