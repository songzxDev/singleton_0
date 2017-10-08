/**   
* @Title: MyOkObject.java 
* @Package cn.songzx.singleton.ok 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午9:41:42 
* @version V1.0   
*/
package cn.songzx.singleton.ok.test;

/**
 * @ClassName: MyOkObject
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午9:41:42
 * 
 */
public class MyOkObject {
	private static MyOkObject myObject;

	private MyOkObject() {
	}

	// 设置同步方法效率太低了，整个方法上锁
	synchronized public static MyOkObject getInstance() {
		try {
			if (myObject != null) {

			} else {
				// 模拟在创建对象之前做一些准备工作
				Thread.sleep(3000L);
				myObject = new MyOkObject();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

	public static MyOkObject getInstanceA() {
		synchronized (MyOkObject.class) {
			try {
				// 此种写法和锁方法的效果一样，效率低，全部代码上锁
				if (myObject != null) {

				} else {
					// 模拟在创建对象之前做一些准备工作
					Thread.sleep(3000L);
					myObject = new MyOkObject();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return myObject;
		}
	}

	public static MyOkObject getInstanceB() {
		// 针对某些重要的代码进行单独的同步
		try {
			if (myObject != null) {

			} else {
				// 模拟在创建对象之前做一些准备工作
				Thread.sleep(3000L);
				// 虽然部分代码上锁，但是还是存在非线程安全问题
				synchronized (MyOkObject.class) {
					myObject = new MyOkObject();
				}

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myObject;
	}
	
}
