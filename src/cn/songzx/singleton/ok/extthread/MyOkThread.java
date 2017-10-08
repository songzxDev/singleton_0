/**   
* @Title: MyOkThread.java 
* @Package cn.songzx.singleton.ok.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午9:46:40 
* @version V1.0   
*/
package cn.songzx.singleton.ok.extthread;

import cn.songzx.singleton.ok.test.MyDCLObject;
import cn.songzx.singleton.ok.test.MyOkObject;

/**
 * @ClassName: MyOkThread
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午9:46:40
 * 
 */
public class MyOkThread extends Thread {
	public void run() {
		// System.out.println(MyOkObject.getInstance().hashCode());
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		// System.out.println(MyOkObject.getInstanceA().hashCode());
		// System.out.println(MyOkObject.getInstanceB().hashCode());
		System.out.println(MyDCLObject.getInstance().hashCode());
	}
}
