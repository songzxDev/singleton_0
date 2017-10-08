/**   
* @Title: MyRun.java 
* @Package cn.songzx.singleton_0.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午9:14:32 
* @version V1.0   
*/
package cn.songzx.singleton_0.test;

import cn.songzx.singleton_0.extthread.MyThread;

/**
 * @ClassName: MyRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午9:14:32
 * 
 */
public class MyRunB {

	/**
	 * @Date: 2017年10月8日上午9:14:32
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
