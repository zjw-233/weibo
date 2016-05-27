/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.servise.Interface;

import cn.edu.uestc.weibo.type.Page;

/**
 * @author Administrator
 * weibo
 * @下午4:47:23  2016
 */


public interface PageService {

	Page p(int accountId,int current);
	
}
