/**   
* @Title: MyInnerThread.java 
* @Package cn.songzx.singleton.inner.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午10:12:42 
* @version V1.0   
*/
package cn.songzx.singleton.inner.extthread;

import cn.songzx.singleton.inner.test.MyInnerObject;

/**
 * @ClassName: MyInnerThread
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午10:12:42
 * 
 */
public class MyInnerThread extends Thread {
	public void run() {
		System.out.println(MyInnerObject.getInstance().hashCode());
	}
}
