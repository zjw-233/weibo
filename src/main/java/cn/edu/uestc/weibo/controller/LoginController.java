/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.uestc.weibo.servise.Interface.AccountService;
import cn.edu.uestc.weibo.type.Account;

/**
 * @author Administrator
 * weibo
 * @下午5:08:36  2016
 */

@Controller
public class LoginController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/login")
	public String login(Account account,HttpSession session){

		Account a;
		try {
			a = accountService.login(account);
			
			session.setAttribute("a", a);		
			System.out.println("a="+a);

			if(a == null){			
				return "forward:/index.jsp";
			}else if(!(a.getPassword().equals(account.getPassword()))){
				return "forward:/index.jsp";	
			}else{
				return "redirect:/u/" + a.getAccountId() + "/1/home";
			}
	
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return null;
		}

		
	}
	
}
