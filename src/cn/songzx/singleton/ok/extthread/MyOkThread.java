/**   
* @Title: MyOkThread.java 
* @Package cn.songzx.singleton.ok.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����9:46:40 
* @version V1.0   
*/
package cn.songzx.singleton.ok.extthread;

import cn.songzx.singleton.ok.test.MyDCLObject;
import cn.songzx.singleton.ok.test.MyOkObject;

/**
 * @ClassName: MyOkThread
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����9:46:40
 * 
 */
public class MyOkThread extends Thread {
	public void run() {
		// System.out.println(MyOkObject.getInstance().hashCode());
		System.out.println("����������������");
		// System.out.println(MyOkObject.getInstanceA().hashCode());
		// System.out.println(MyOkObject.getInstanceB().hashCode());
		System.out.println(MyDCLObject.getInstance().hashCode());
	}
}
