/**   
* @Title: MyInnerObject.java 
* @Package cn.songzx.singleton.inner.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午10:10:02 
* @version V1.0   
*/
package cn.songzx.singleton.inner.test;

/**
 * @ClassName: MyInnerObject
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午10:10:02
 * 
 */
public class MyInnerObject {
	// 内部类方式
	private static class MyInnerObjectHandler {
		private static MyInnerObject myObject = new MyInnerObject();
	}

	private MyInnerObject() {

	}

	public static MyInnerObject getInstance() {
		return MyInnerObjectHandler.myObject;
	}
}
