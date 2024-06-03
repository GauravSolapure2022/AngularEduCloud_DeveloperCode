package in.codetech.angulareducloud.portal.model.Exam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long qId;
	@Column(length = 5000)
	private String title;
	private String description;
	private String maxMarks;
	private String noOfQuestion;
	private boolean active = false;
	@ManyToOne
	private Category category;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "quiz")
	private Set<Question> questions = new HashSet<>();
	public Quiz(long qId, String title, String description, String maxMarks, String noOfQuestion, boolean active,
			Category category, Set<Question> questions) {
		super();
		this.qId = qId;
		this.title = title;
		this.description = description;
		this.maxMarks = maxMarks;
		this.noOfQuestion = noOfQuestion;
		this.active = active;
		this.category = category;
		this.questions = questions;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getqId() {
		return qId;
	}
	public void setqId(long qId) {
		this.qId = qId;
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
	public String getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(String maxMarks) {
		this.maxMarks = maxMarks;
	}
	public String getNoOfQuestion() {
		return noOfQuestion;
	}
	public void setNoOfQuestion(String noOfQuestion) {
		this.noOfQuestion = noOfQuestion;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Set<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "Quiz [qId=" + qId + ", title=" + title + ", description=" + description + ", maxMarks=" + maxMarks
				+ ", noOfQuestion=" + noOfQuestion + ", active=" + active + ", category=" + category + ", questions="
				+ questions + "]";
	}
	
	
}
