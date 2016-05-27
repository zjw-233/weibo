/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.servise.Interface;

import cn.edu.uestc.weibo.type.Account;

/**
 * @author Administrator
 * weibo
 * @下午1:07:06  2016
 */
public interface AccountService{

	Account login (Account account) throws Exception;
	
}
