/**   
* @Title: MyStaticThread.java 
* @Package cn.songzx.singleton.stati.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����11:36:02 
* @version V1.0   
*/
package cn.songzx.singleton.stati.extthread;

import cn.songzx.singleton.stati.test.MyStaticObject;

/**
 * @ClassName: MyStaticThread
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����11:36:02
 * 
 */
public class MyStaticThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(MyStaticObject.getInstance().hashCode());
		}
	}
}
