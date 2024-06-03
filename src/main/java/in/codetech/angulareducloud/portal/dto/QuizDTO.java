package in.codetech.angulareducloud.portal.dto;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class QuizDTO {
	private long qId;
    private String title;
    private String description;
    private String maxMarks;
    private String noOfQuestion;
    private boolean active;
    private long categoryId;
    private Set<Long> questionIds=new HashSet<>();

    // Constructors
    public QuizDTO() {}

    public QuizDTO(long qId, String title, String description, String maxMarks, String noOfQuestion, boolean active,
                   long categoryId, Set<Long> questionIds) {
        this.qId = qId;
        this.title = title;
        this.description = description;
        this.maxMarks = maxMarks;
        this.noOfQuestion = noOfQuestion;
        this.active = active;
        this.categoryId = categoryId;
        this.questionIds = questionIds;
    }

    // Getters and setters
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

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public Set<Long> getQuestionIds() {
        return questionIds;
    }

    public void setQuestionIds(Set<Long> questionIds) {
        this.questionIds = questionIds;
    }
}
