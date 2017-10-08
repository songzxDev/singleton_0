/**   
* @Title: MyStaticThread.java 
* @Package cn.songzx.singleton.stati.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午11:36:02 
* @version V1.0   
*/
package cn.songzx.singleton.stati.extthread;

import cn.songzx.singleton.stati.test.MyStaticObject;

/**
 * @ClassName: MyStaticThread
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午11:36:02
 * 
 */
public class MyStaticThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(MyStaticObject.getInstance().hashCode());
		}
	}
}
