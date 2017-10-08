/**   
* @Title: MyObjectA.java 
* @Package cn.songzx.singleton_0.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午9:17:16 
* @version V1.0   
*/
package cn.songzx.singleton_0.test;

/**
 * @ClassName: MyObjectA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午9:17:16
 * 
 */
public class MyObjectA {
	private static MyObjectA myObject;

	private MyObjectA() {

	}
	
	public static MyObjectA getInstance() {
		if(myObject != null) {// 延迟加载
			
		}else {
			myObject = new MyObjectA();
		}
		return myObject;
	}
}
