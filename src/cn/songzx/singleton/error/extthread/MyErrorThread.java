/**   
* @Title: MyErrorThread.java 
* @Package cn.songzx.singleton.error.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����9:33:06 
* @version V1.0   
*/
package cn.songzx.singleton.error.extthread;

import cn.songzx.singleton.error.test.MyErrorObject;

/**
 * @ClassName: MyErrorThread
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����9:33:06
 * 
 */
public class MyErrorThread extends Thread {
	public void run() {
		System.out.println(MyErrorObject.getInstance().hashCode());
	}
}
