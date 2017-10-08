/**   
* @Title: MyInnerRun.java 
* @Package cn.songzx.singleton.inner.run 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午10:13:30 
* @version V1.0   
*/
package cn.songzx.singleton.inner.run;

import cn.songzx.singleton.inner.extthread.MyInnerThread;

/**
 * @ClassName: MyInnerRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午10:13:30
 * 
 */
public class MyInnerRun {

	/**
	 * @Date: 2017年10月8日上午10:13:30
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyInnerThread t1 = new MyInnerThread();
		MyInnerThread t2 = new MyInnerThread();
		MyInnerThread t3 = new MyInnerThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
