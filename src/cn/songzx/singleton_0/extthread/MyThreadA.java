/**   
* @Title: MyThreadA.java 
* @Package cn.songzx.singleton_0.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����9:20:34 
* @version V1.0   
*/
package cn.songzx.singleton_0.extthread;

import cn.songzx.singleton_0.test.MyObjectA;

/**
 * @ClassName: MyThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����9:20:34
 * 
 */
public class MyThreadA extends Thread {
	public void run() {
		System.out.println(MyObjectA.getInstance().hashCode());
	}
}
