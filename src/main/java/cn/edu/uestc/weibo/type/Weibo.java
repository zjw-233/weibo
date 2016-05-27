/**
 * 版权所有Administrator----2016
 */
package cn.edu.uestc.weibo.type;

import java.util.Date;

/**
 * @author Administrator
 * weibo
 * @下午1:57:03  2016
 */
public class Weibo {

	private String text;
	
	private int wid;
	
	private Date date;
	
	private int like;
	
	private int comment;
	
	private Account account;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getComment() {
		return comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Weibo [text=" + text + ", wid=" + wid + ", date=" + date + ", like=" + like + ", comment=" + comment
				+ ", account=" + account + "]";
	}
	
}
