/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import cn.edu.uestc.weibo.type.Weibo;

/**
 * @author Administrator
 * weibo
 * @下午4:33:55  2016
 */
public interface PageDao {

	int num(int accountId);
	
	List<Weibo> findById(@Param("accountId") int accountId, @Param("start")int start, @Param("size")int size);
}
