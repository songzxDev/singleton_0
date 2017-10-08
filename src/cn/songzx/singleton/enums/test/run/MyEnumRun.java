/**   
* @Title: MyEnumRun.java 
* @Package cn.songzx.singleton.enums.test.run 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午11:52:20 
* @version V1.0   
*/
package cn.songzx.singleton.enums.test.run;

import cn.songzx.singleton.enums.extthread.MyEnumThread;

/**
 * @ClassName: MyEnumRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午11:52:20
 * 
 */
public class MyEnumRun {

	/**
	 * @Date: 2017年10月8日上午11:52:20
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyEnumThread t1 = new MyEnumThread();
		MyEnumThread t2 = new MyEnumThread();
		MyEnumThread t3 = new MyEnumThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
