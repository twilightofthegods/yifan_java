public class Hello {
	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String insert = buildInsertSql(table, fields);
		System.out.println(insert);
		String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
		System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
	}
	
	static String buildInsertSql(String table, String[] fields) {
		String s1 = "";
		for (int i = 0; i < fields.length - 1; i++) {
			s1 = s1 + fields[i] + ", ";
		}
		s1 = s1 + fields[fields.length - 1];
		StringBuilder sb = new StringBuilder(50);
		sb.append("INSERT INTO ")
						.append(table)
						.append(" (")
						.append(s1)
						.append(")")
						.append(" VALUES (?, ?, ?)");
		return "" + sb;
	}
}
