package info.inetsolv.AllInOneMOC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);
		JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);

		int update = jdbcTemplate.update("insert into emp_tbl values(10,'munni',15000)");
		System.out.println(update);

		container.close();
		
	}
}
