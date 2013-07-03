package shc.iautos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "SellerInfo_Iautos")
public class IautosSellerInfo implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8254284734895259457L;

	@Id
	@GeneratedValue(generator = "uuidgenerator")
	@GenericGenerator(name = "uuidgenerator", strategy = "uuid")
	private String seqID;

	@Column(name = "SellerName", nullable = true)
	private String shopName;

	@Column(name = "SellerAddress", nullable = true)
	private String shopAddress;

	@Column(name = "SellerUrl", nullable = true)
	private String shopUrl;

	@Column(name = "SellerPhone", nullable = true)
	private String shopPhone;

	public String getSeqID() {
		return seqID;
	}

	public void setSeqID(String seqID) {
		this.seqID = seqID;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopUrl() {
		return shopUrl;
	}

	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

	public String getShopPhone() {
		return shopPhone;
	}

	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("seqid", this.getSeqID())
				.append("phone", this.getShopPhone())
				.append("address", this.getShopAddress())
				.append("name", this.getShopName()).toString();
	}
}