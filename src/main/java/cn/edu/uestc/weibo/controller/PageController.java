/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.uestc.weibo.servise.Interface.PageService;
import cn.edu.uestc.weibo.type.Page;

/**
 * @author Administrator
 * weibo
 * @下午5:19:06  2016
 */

@Controller
@RequestMapping("/u")
public class PageController {

	@Autowired
	private PageService pageService;
	
	@RequestMapping("/{accountId}/{current}/home")
	
	private String weibo(@PathVariable("accountId") int accountId,@PathVariable("current") int current,Model model){
		
		if(current == 0 ||"".equals(current)){
			
			current = 1;
		}
		
		Page p = pageService.p(accountId, current);

		model.addAttribute("p",p);
		
		return "home";
		
	}
	
}
