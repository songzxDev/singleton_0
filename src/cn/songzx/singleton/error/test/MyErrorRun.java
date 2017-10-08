/**   
* @Title: MyErrorRun.java 
* @Package cn.songzx.singleton.error.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午9:38:04 
* @version V1.0   
*/
package cn.songzx.singleton.error.test;

import cn.songzx.singleton.error.extthread.MyErrorThread;

/**
 * @ClassName: MyErrorRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午9:38:04
 * 
 */
public class MyErrorRun {

	/**
	 * @Date: 2017年10月8日上午9:38:04
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyErrorThread t1 = new MyErrorThread();
		MyErrorThread t2 = new MyErrorThread();
		MyErrorThread t3 = new MyErrorThread();
		// 控制台打印出三个hasCode，说明创建了三个对象，并不是单例的
		t1.start();
		t2.start();
		t3.start();
	}

}
