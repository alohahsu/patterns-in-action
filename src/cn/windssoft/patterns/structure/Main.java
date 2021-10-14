package cn.windssoft.patterns.structure;

public class Main {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new Mp3Player();
		audioPlayer.playAudio();

		VideoAudioPlayer mp4Player = new Mp4Player();
		VideoAudioPlayer vlcPlayer = new VlcPlayer();

		mp4Player.playAudio();
		mp4Player.playVideo();

		vlcPlayer.playAudio();
		vlcPlayer.playVideo();
	}
}
