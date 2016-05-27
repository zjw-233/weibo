/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.dao;

import cn.edu.uestc.weibo.type.Account;

/**
 * @author Administrator
 * weibo
 * @上午11:35:27  2016
 */
public interface AccountDao {

	Account FindById(String account);
	
	
	boolean Insert(Account account);
	
}
