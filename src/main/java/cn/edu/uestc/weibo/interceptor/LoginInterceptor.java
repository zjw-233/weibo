/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.uestc.weibo.type.Account;

/**
 * @author Administrator
 * weibo
 * @上午10:40:20  2016
 */
public class LoginInterceptor implements HandlerInterceptor {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		
		HttpSession session = arg0.getSession();
		Account a = (Account)session.getAttribute("a");
		String uri = arg0.getRequestURI();
		
		System.out.println(uri);
		
		System.out.println("account="+a);
		if( a == null){
			
			arg0.getRequestDispatcher("/index.jsp").forward(arg0, arg1);
			return false;
			
		}else if( !(uri.equals("/u/"+a.getAccountId()+"/1/home"))){
			
			arg0.getRequestDispatcher("/index.jsp").forward(arg0, arg1);
			return false;
			
		}else{
			return true;
		}
	}

}
