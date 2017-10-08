/**   
* @Title: MyEnumObject.java 
* @Package cn.songzx.singleton.enums.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午11:42:57 
* @version V1.0   
*/
package cn.songzx.singleton.enums.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName: MyEnumObject
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午11:42:57
 * 
 */
public class MyEnumObject {
	public enum MyEnumSingleton {
		connectionFactory;
		private Connection connection;

		private MyEnumSingleton() {
			try {
				System.out.println("创建MyEnumObject对象");
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
