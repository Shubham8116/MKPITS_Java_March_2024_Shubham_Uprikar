package test;

public class TransactionEntity {
	private String userid;
	private String transdate;
	private int amount;
	private String transtype;
	
	public TransactionEntity(String userid,String transdate,int amount, String transtype)
	{
		this.userid=userid;
		this.transdate=transdate;
		this.amount =amount;
		this.transtype=transtype;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTransdate() {
		return transdate;
	}
	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTranstype() {
		return transtype;
	}
	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}
	
	

}
