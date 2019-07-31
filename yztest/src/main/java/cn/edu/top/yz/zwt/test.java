/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 *
 * 类功能描述：
 * @Title: test.java
 * @Package: cn.edu.top.yz.zwt 
 * @author: YangZong   
 * @date: 2019年7月31日 下午3:11:39
 * @version V1.0   
 * 
 *   
 */


package cn.edu.top.yz.zwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* Copyright: Copyright (c) 2019 
* 
* @ClassName: test.java
* @Description: 该类的功能描述:
*  测试提交代码
* @version: v1.0.0
* @author: YangZong
* @date: 2019年7月31日 下午3:11:39 
*
*/
@RestController
public class test {

	
	/**
	* @Function: test.java
	* @Description: 该方法的功能描述
	*
	* @author: YangZong
	* @date: 2019年7月31日 下午3:11:48 
	* @version: v1.0.0
	* 
	****/
	
	@GetMapping("/index")
	public String pulic() {
		// TODO Auto-generated method stub
		return "git-提交github";
	}
}
