package one2many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="item")
public class Item {
	 @Id
	 @Column(name="ITEM")
	 private int itemId;
		
	 @Column(name="OID")
	 private Integer orderId;
	 
	 @Column(name="PID")
	 private Integer productId;
		
	 @Column(name="AP")
	 private float actualPrice;
	 
	 @Column(name="QTY")
	 private int quantity;
	 
	 @Column(name="IT")
	 private float itemTotal;

	 @OneToMany(mappedBy="item", fetch = FetchType.EAGER, cascade = CascadeType.ALL )
		private List<Employee> employeeList;

		public int getitemId() {
			return itemId;
		}

		public void setitemId(int itemId) {
			this.itemId = itemId;
		}
 
	 
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public float getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(float actualPrice) {
		this.actualPrice = actualPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(int itemTotal) {
		this.itemTotal = itemTotal;
	}
	 
	
}
