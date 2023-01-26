package step.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import org.springframework.jdbc.core.JdbcTemplate;
//
//import utils.JdbcUtils;

public class Pocket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		while(true) {
			String s = sc.next();
			if(s.equals("끝")) break;
			if(s.matches("^[가-힣#](.*?)")) list.add(s);
		}
		list.add(" ");
		sc.close();
		
//		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		String sql = "insert into pocketmon(no, name, type) values(?, ?, ?)";
		
		for(int i=0; i<list.size()-3; i++) {
			int no = 0;
			String name = "";
			String type = "";
			if(list.get(i).equals(list.get(i+1))) {
				no = Integer.parseInt(list.get(i).replace("#", ""));
				name = list.get(i+2);
				type = list.get(i+3);
				if(!(list.get(i+4).startsWith("#"))) {
					type+=list.get(i+4);
				}
				Object[] param = {no, name, type};
//				jdbcTemplate.update(sql, param);
			}
		}
	}
}