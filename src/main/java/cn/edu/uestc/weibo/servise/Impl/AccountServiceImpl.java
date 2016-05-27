/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.servise.Impl;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.uestc.weibo.dao.AccountDao;
import cn.edu.uestc.weibo.servise.Interface.AccountService;
import cn.edu.uestc.weibo.type.Account;

/**
 * @author Administrator
 * weibo
 * @下午1:19:42  2016
 */

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;
	
	@Override
	public Account login(Account account) throws Exception {
		
		
		Account a = accountDao.FindById(account.getAccount());
		
		if(a == null){
			JOptionPane.showMessageDialog(null, "账号不能为空");
		}else if(!(a.getPassword().equals(account.getPassword()))){
			JOptionPane.showMessageDialog(null, "密码错误");
		}else{
			System.out.println("登陆成功");
		}
		
		
		return a;
	}

}
