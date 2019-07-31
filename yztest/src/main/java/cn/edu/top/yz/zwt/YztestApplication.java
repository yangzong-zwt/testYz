package cn.edu.top.yz.zwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/***
 * 
* Copyright: Copyright (c) 2019 
* 
* @ClassName: YztestApplication.java
* @Description: 该类的功能描述:
*  springboot 主程序进口
* @version: v1.0.0
* @author: YangZong
* @date: 2019年7月31日 下午3:45:34 
*
 */
@SpringBootApplication
public class YztestApplication {

	public static void main(String[] args) {
		SpringApplication.run(YztestApplication.class, args);
		System.out.println("程序启动主入口");
		
	}

}
