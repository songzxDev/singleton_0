/**   
* @Title: MyInnerThread.java 
* @Package cn.songzx.singleton.inner.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����10:12:42 
* @version V1.0   
*/
package cn.songzx.singleton.inner.extthread;

import cn.songzx.singleton.inner.test.MyInnerObject;

/**
 * @ClassName: MyInnerThread
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����10:12:42
 * 
 */
public class MyInnerThread extends Thread {
	public void run() {
		System.out.println(MyInnerObject.getInstance().hashCode());
	}
}
