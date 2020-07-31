package application.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlRootElement(name = "Sale")
@XmlType(propOrder = { "id","date", "book", "quantity", "user", "buyer" } )
public class Sale {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(columnDefinition = "BINARY(16)")
	private UUID id;
    
    
    private String date;
    private Book book;
    private int quantity;
    private User user;
    private String buyer;

    public Sale(){}

    @XmlAttribute(name = "id", required = true)
    public void setId(UUID id) {
        this.id = id;
    }

    @XmlElement(name = "date", required = true)
    public void setDate(String date) {
        this.date = date;
    }

    @XmlElement(name = "book", required = true)
    public void setBook(Book book) {
        this.book = book;
    }

    @XmlElement(name = "quantity", required = true)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @XmlElement(name = "user", required = true)
    public void setUser(User user) {
        this.user = user;
    }

    @XmlElement(name = "buyer", required = true)
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public UUID getId() {
        return id;
    }
    
    @Column(name="date")
    public String getDate() {
        return date;
    }

    @Column(name="book")
    public Book getBook() {
        return book;
    }

    @Column(name="quantity")
    public int getQuantity() {
        return quantity;
    }
    @Column(name="user")
    public User getUser() {
        return user;
    }
    @Column(name="buyer")
    public String getBuyer() {
        return buyer;
    }
}
