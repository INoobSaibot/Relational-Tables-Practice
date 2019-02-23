//package

import java.util.HashSet;
import java.util.Set;

import javax.persisience.Entity;

@Entity
public class Product {
    private Long id;
    private String name;
    private User user;
    private Set<Feature> features = new HashSet<>();
 
    @ID @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
    }
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="product")
    public Set<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(Set<Feature> featres) {
		this.featres = features;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
    }
    @ManyToOne()
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
