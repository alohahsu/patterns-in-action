package cn.windssoft.patterns.structure;

public class VlcPlayer implements VideoAudioPlayer {
	@Override
	public void playVideo() {
		System.out.println("VlcPlayer is playing vlc file.");
	}

	@Override
	public void playAudio() {
		System.out.println("VlcPlayer is playing mp3 file.");
	}
}
