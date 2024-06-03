package in.codetech.angulareducloud.portal.model.Exam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cId;
	private String title;
	private String description;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "category")
	@JsonIgnore
	private Set<Quiz> quizes=new HashSet();
	public Category(long cId, String title, String description, Set<Quiz> quizes) {
		super();
		this.cId = cId;
		this.title = title;
		this.description = description;
		this.quizes = quizes;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Category [cId=" + cId + ", title=" + title + ", description=" + description + ", quizes=" + quizes
				+ "]";
	}
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Quiz> getQuizes() {
		return quizes;
	}
	public void setQuizes(Set<Quiz> quizes) {
		this.quizes = quizes;
	}
	
	
	
}
