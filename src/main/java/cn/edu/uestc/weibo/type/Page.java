package cn.edu.uestc.weibo.type;

import java.util.List;

public class Page {

	

	private int current;//当前页

	private int inAll;//总共页
	
	private int num;//总共条数
	
	private int size = 5;//每页条数
	
	private int start;//起始条数
	
	private List<Weibo> show;//显示结果
	
	
	public Page() {}

	public Page(int current) {
		
		this.current = current;
		
		this.start = (current - 1) * this.size; 
	}

	public List<Weibo> getShow() {
		return show;
	}

	public void setShow(List<Weibo> show) {
		this.show = show;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
		
		this.start = (current - 1) * this.size;
	}

	public int getInAll() {
		return inAll;
	}

	public void setInAll(int inAll) {
		this.inAll = inAll;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
		
		this.inAll = num / this.size + ((num % this.size > 0 ) ? 1 : 0);
	}

	public int getSize() {
		return size;
	}
	
	public int getStart() {
		return start;
	}

	
	@Override
	public String toString() {
		return "Page [current=" + current + ", inAll=" + inAll + ", num=" + num + ", size=" + size + ", show=" + show
				+ "]";
	}
}
