/**   
* @Title: MyOkRun.java 
* @Package cn.songzx.singleton.ok.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午9:48:19 
* @version V1.0   
*/
package cn.songzx.singleton.ok.test;

import cn.songzx.singleton.ok.extthread.MyOkThread;

/**
 * @ClassName: MyOkRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午9:48:19
 * 
 */
public class MyOkRun {

	/**
	 * @Date: 2017年10月8日上午9:48:19
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyOkThread t1 = new MyOkThread();
		MyOkThread t2 = new MyOkThread();
		MyOkThread t3 = new MyOkThread();
		/*
		 * 此方法加入同步synchronized关键字得到相同实例的对象，但此种方法的运行效率非常低下，是同步
		 * 
		 * 运行的，下一个线程想要取得对象，必须等上一个线程释放锁之后，才可以继续进行。
		 */
		t1.start();
		t2.start();
		t3.start();
	}

}
