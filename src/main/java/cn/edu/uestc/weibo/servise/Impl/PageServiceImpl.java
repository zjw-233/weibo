/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.servise.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.uestc.weibo.dao.PageDao;
import cn.edu.uestc.weibo.servise.Interface.PageService;
import cn.edu.uestc.weibo.type.Page;
import cn.edu.uestc.weibo.type.Weibo;

/**
 * @author Administrator
 * weibo
 * @下午4:50:49  2016
 */

@Service
public class PageServiceImpl implements PageService {

	@Autowired
	private PageDao pageDao;
	
	
	@Override
	public Page p(int accountId, int current) {
		
		Page p = new Page(current);
		
		int num = pageDao.num(accountId);
		
		List<Weibo> list = pageDao.findById(accountId,p.getStart(),p.getSize());

		p.setNum(num);
		p.setShow(list);
		
		return p;
	}

}
