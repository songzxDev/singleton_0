/**   
* @Title: MyStaticRun.java 
* @Package cn.songzx.singleton.stati.test.run 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午11:37:06 
* @version V1.0   
*/
package cn.songzx.singleton.stati.test.run;

import cn.songzx.singleton.stati.extthread.MyStaticThread;

/**
 * @ClassName: MyStaticRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午11:37:06
 * 
 */
public class MyStaticRun {

	/**
	 * @Date: 2017年10月8日上午11:37:06
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyStaticThread t1 = new MyStaticThread();
		MyStaticThread t2 = new MyStaticThread();
		MyStaticThread t3 = new MyStaticThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
