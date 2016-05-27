/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.type;

/**
 * @author Administrator
 * weibo
 * @上午11:20:16  2016
 */
public class Account {

	private int accountId;
	
	private String account;
	
	private String password;
	
	private String name;
	
	private int follow;
	
	private int fans;
	
	private int weibo;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFollow() {
		return follow;
	}

	public void setFollow(int follow) {
		this.follow = follow;
	}

	public int getFans() {
		return fans;
	}

	public void setFans(int fans) {
		this.fans = fans;
	}

	public int getWeibo() {
		return weibo;
	}

	public void setWeibo(int weibo) {
		this.weibo = weibo;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", account=" + account + ", password=" + password + ", name=" + name
				+ ", follow=" + follow + ", fans=" + fans + ", weibo=" + weibo + "]";
	}
	
}
