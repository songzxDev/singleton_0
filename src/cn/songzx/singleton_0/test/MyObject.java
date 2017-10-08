/**   
* @Title: MyObject.java 
* @Package cn.songzx.singleton_0.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午9:09:25 
* @version V1.0   
*/
package cn.songzx.singleton_0.test;

/**
 * @ClassName: MyObject
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午9:09:25
 * 
 */
public class MyObject {

	private static MyObject myObject = new MyObject();// 立即加载，饿汉模式

	private MyObject() {
	}

	public static MyObject getInstance() {
		/*
		 * 此代码版本为立即加载
		 * 
		 * 此版本代码的缺点是不能有其他实例变量
		 * 
		 * 因为getInstance() 方法没有同步
		 * 
		 * 所以有可能出现非线程安全问题
		 */
		return myObject;
	}
}
