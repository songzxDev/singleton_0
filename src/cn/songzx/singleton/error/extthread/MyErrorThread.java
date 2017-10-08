/**   
* @Title: MyErrorThread.java 
* @Package cn.songzx.singleton.error.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午9:33:06 
* @version V1.0   
*/
package cn.songzx.singleton.error.extthread;

import cn.songzx.singleton.error.test.MyErrorObject;

/**
 * @ClassName: MyErrorThread
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午9:33:06
 * 
 */
public class MyErrorThread extends Thread {
	public void run() {
		System.out.println(MyErrorObject.getInstance().hashCode());
	}
}
