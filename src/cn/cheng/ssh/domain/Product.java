package cn.cheng.ssh.domain;
/**
 * 商品的实体
 * @author cheng
 *
 */
public class Product {

	private Integer pId;
	private String pName;
	private Double pPrice;
	
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getpPrice() {
		return pPrice;
	}
	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}
	
}
