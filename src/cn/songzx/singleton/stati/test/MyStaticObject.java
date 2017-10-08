/**   
* @Title: MyStaticObject.java 
* @Package cn.songzx.singleton.stati.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午11:33:48 
* @version V1.0   
*/
package cn.songzx.singleton.stati.test;

/**
 * @ClassName: MyStaticObject
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午11:33:48
 * 
 */
public class MyStaticObject {
	private static MyStaticObject instance = null;

	private MyStaticObject() {
	}

	static {
		instance = new MyStaticObject();
	}

	public static MyStaticObject getInstance() {
		return instance;
	}
}
