package in.codetech.angulareducloud.portal.dto;

import java.util.HashSet;
import java.util.Set;


import java.util.Set;

public class CategoryDTO {
    private long cId;
    private String title;
    private String description;
    private Set<Long> quizIds;

    // Constructors
    public CategoryDTO() {}

    public CategoryDTO(long cId, String title, String description, Set<Long> quizIds) {
        this.cId = cId;
        this.title = title;
        this.description = description;
        this.quizIds = quizIds;
    }

    // Getters and setters
    public long getcId() { return cId; }
    public void setcId(long cId) { this.cId = cId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Set<Long> getQuizIds() { return quizIds; }
    public void setQuizIds(Set<Long> quizIds) { this.quizIds = quizIds; }
}
