/**   
* @Title: MyEnumThread.java 
* @Package cn.songzx.singleton.enums.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����11:51:09 
* @version V1.0   
*/
package cn.songzx.singleton.enums.extthread;

import cn.songzx.singleton.enums.test.MyEnumObject;

/**
 * @ClassName: MyEnumThread
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����11:51:09
 * 
 */
public class MyEnumThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(MyEnumObject.getConnection().hashCode());
		}
	}
}
