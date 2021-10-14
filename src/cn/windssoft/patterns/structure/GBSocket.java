package cn.windssoft.patterns.structure;

/**
 * 中国插座
 */
public class GBSocket implements GBSocketInterface{

	@Override
	public void powerWithThreeFlat() {
		System.out.println("使用三项扁头插孔供电");
	}
}
