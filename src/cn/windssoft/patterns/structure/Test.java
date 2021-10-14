package cn.windssoft.patterns.structure;

public class Test {

	public static void main(String[] args) {
		//我带着一个国标充电器到了德国
		GBSocketInterface gbSocket = new GBSocket();

		//我发现了一个德国旅店
		Hotel hotel = new Hotel();

		//我把我的国标充电器和适配器进行组装
		SocketAdapter socketAdapter = new SocketAdapter(gbSocket);

		//把组装好的充电器（带有适配器）插入旅店的插座上
		hotel.setSocket(socketAdapter);

		//酒店的插座马上给我的充电器供电
		hotel.charge();
	}
}
