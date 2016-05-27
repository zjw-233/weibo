/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.servise.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.uestc.weibo.dao.AccountDao;
import cn.edu.uestc.weibo.servise.Interface.InsertService;
import cn.edu.uestc.weibo.type.Account;

/**
 * @author Administrator
 * weibo
 * @下午1:51:52  2016
 */
@Service
public class InsertServiceImpl implements InsertService {

	@Autowired
	private AccountDao accountDao;
	
	
	@Override
	public boolean insert(Account account) throws Exception {
		
		boolean flag = accountDao.Insert(account);
		
		System.out.println(flag);
		
		return flag;
	}

}
