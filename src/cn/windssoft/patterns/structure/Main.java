package cn.windssoft.patterns.structure;

public class Main {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new Mp3Player();
		audioPlayer.play();

		VideoPlayer mp4Player = new Mp4Player();
		VideoPlayer vlcPlayer = new VlcPlayer();

		mp4Player.play();
		vlcPlayer.play();
	}
}
