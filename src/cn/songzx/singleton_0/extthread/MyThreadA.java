/**   
* @Title: MyThreadA.java 
* @Package cn.songzx.singleton_0.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午9:20:34 
* @version V1.0   
*/
package cn.songzx.singleton_0.extthread;

import cn.songzx.singleton_0.test.MyObjectA;

/**
 * @ClassName: MyThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午9:20:34
 * 
 */
public class MyThreadA extends Thread {
	public void run() {
		System.out.println(MyObjectA.getInstance().hashCode());
	}
}
