/**   
* @Title: MyErrorObject.java 
* @Package cn.songzx.singleton.error.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午9:28:03 
* @version V1.0   
*/
package cn.songzx.singleton.error.test;

/**
 * @ClassName: MyErrorObject
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午9:28:03
 * 
 */
public class MyErrorObject {
	private static MyErrorObject myObject;

	private MyErrorObject() {

	}

	public static MyErrorObject getInstance() {
		try {
			if (myObject != null) {

			} else {
				// 模拟在创建对象之前做一些准备工作
				Thread.sleep(3000L);
				myObject = new MyErrorObject();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
