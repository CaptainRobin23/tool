package com.project.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.ShellRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ToolApplication.class)
@WebAppConfiguration
public class ToolApplicationTests {

	@Test
	public void contextLoads() {
	}

	//该配置文件放在src\\main\\resources\\该路径下即可
	@Test
	public  void tets() {
		String[] args = new String[] { "-configfile", "src\\main\\resources\\mybatis-generator.xml", "-overwrite" };
		ShellRunner.main(args);
	}

}
