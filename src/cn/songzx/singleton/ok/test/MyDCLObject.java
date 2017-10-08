/**   
* @Title: MyDCLObject.java 
* @Package cn.songzx.singleton.ok.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午10:00:44 
* @version V1.0   
*/
package cn.songzx.singleton.ok.test;

/**
 * @ClassName: MyDCLObject
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午10:00:44
 * 
 */
public class MyDCLObject {
	private volatile static MyDCLObject myObject;

	private MyDCLObject() {
	}

	/**
	 * 
	 * @Date: 2017年10月8日上午10:03:41
	 * @Title: getInstance
	 * @Description: TODO(此版本的代码为双重检查 Double-Check-Locking)
	 * @return
	 * @return MyDCLObject 返回值类型
	 */
	public static MyDCLObject getInstance() {
		try {
			if (myObject != null) {
				System.out.println("☆☆☆☆☆【NULL】☆☆☆☆☆");
			} else {
				// 模拟在创建对象之前做一些准备性工作
				Thread.sleep(3000L);
				synchronized (MyDCLObject.class) {
					if (myObject == null) {
						myObject = new MyDCLObject();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
