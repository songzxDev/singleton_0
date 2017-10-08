/**   
* @Title: MyEnumObject.java 
* @Package cn.songzx.singleton.enums.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����11:42:57 
* @version V1.0   
*/
package cn.songzx.singleton.enums.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName: MyEnumObject
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����11:42:57
 * 
 */
public class MyEnumObject {
	public enum MyEnumSingleton {
		connectionFactory;
		private Connection connection;

		private MyEnumSingleton() {
			try {
				System.out.println("����MyEnumObject����");
				String url = "";
				String usrname = "";
				String pssword = "";
				String driverName = "";
				Class.forName(driverName);
				connection = DriverManager.getConnection(url, usrname, pssword);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		private Connection getConnection() {
			return connection;
		}
	}

	public static Connection getConnection() {
		return MyEnumSingleton.connectionFactory.getConnection();
	}
}
