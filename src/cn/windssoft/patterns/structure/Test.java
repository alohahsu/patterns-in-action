package cn.windssoft.patterns.structure;

public class Test {

	public static void main(String[] args) {

		//初始化一个德国插座对象， 用一个德标接口引用它
		DBSocketInterface dbSocket = new DBSocket();

		//创建一个旅馆对象
		Hotel hotel = new Hotel(dbSocket);

		//在旅馆中给手机充电
		hotel.charge();
	}
}
