package cn.windssoft.patterns.structure;

public class Main {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new Mp3Player();
		audioPlayer.play();

		AdvancedPlayer mp4Player = new Mp4Player();
		AdvancedPlayer vlcPlayer = new VlcPlayer();

		mp4Player.playAudio();
		mp4Player.playVideo();

		vlcPlayer.playAudio();
		vlcPlayer.playVideo();
	}
}
