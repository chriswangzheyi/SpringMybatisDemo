package com.wzy.controller;




import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	 private static Logger logger = Logger.getLogger(HomeController.class);

	
	@RequestMapping(value="/")
	public String Home() {

		logger.info("home page is entered");
		
		return "index";
	}
	
	
	/*restful风格*/
	@RequestMapping(value="/user/{userId}/roles/{roleId}",method = RequestMethod.GET)  
    public String getLogin(@PathVariable("userId") String userId,  
        @PathVariable("roleId") String roleId){  
        System.out.println("User Id : " + userId);  
        System.out.println("Role Id : " + roleId);  
        return "index";  
    }  
    @RequestMapping(value="/product/{productId}",method = RequestMethod.GET)  
    public String getProduct(@PathVariable("productId") String productId){  
          System.out.println("Product Id : " + productId);  
          return "index";  
    }  
    @RequestMapping(value="/javabeat/{regexp1:[a-z-]+}",  
          method = RequestMethod.GET)  
    public String getRegExp(@PathVariable("regexp1") String regexp1){  
          System.out.println("URI Part 1 : " + regexp1);  
          return "index";  
    }  
	
	

}
