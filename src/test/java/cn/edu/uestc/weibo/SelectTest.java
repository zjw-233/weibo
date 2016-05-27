/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.uestc.weibo.servise.Interface.AccountService;
import cn.edu.uestc.weibo.servise.Interface.InsertService;
import cn.edu.uestc.weibo.servise.Interface.PageService;
import cn.edu.uestc.weibo.type.Account;
import cn.edu.uestc.weibo.type.Page;

/**
 * @author Administrator
 * weibo
 * @下午12:41:06  2016
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-dao.xml"})
public class SelectTest {

	@Autowired
	public AccountService accountService;
	
	@Autowired
	public InsertService insertService;
	
	@Autowired
	public PageService pageService;
	
	@Test
	public void accountTest() throws Exception{
		
		Account a = new Account();
		a.setAccount("ww");
		a.setPassword("159");
		
		Account account = accountService.login(a);
		
		Assert.assertNotNull(account);
		System.out.println(account);
	}
	
	@Test
	public void inserTest() throws Exception {
		
		Account a = new Account();
		a.setAccount("ww");
		a.setName("王五");
		a.setPassword("159");
		
		boolean flag = insertService.insert(a);
		System.out.println(flag);
		
	}
	
	@Test
	public void pageTest() throws Exception{
		Page p = pageService.p(3, 1);
		
		System.out.println(p);
		
		System.out.println(p.getShow());
		
	}
}
