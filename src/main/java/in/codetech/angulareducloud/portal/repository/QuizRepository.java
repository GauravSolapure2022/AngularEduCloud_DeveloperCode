package in.codetech.angulareducloud.portal.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import in.codetech.angulareducloud.portal.model.exam.Category;
import in.codetech.angulareducloud.portal.model.exam.Question;
import in.codetech.angulareducloud.portal.model.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
	List<Quiz> findByCategory(Category category);
    List<Quiz> findByActive(boolean active);
    List<Quiz> findByCategoryAndActive(Category category, boolean active);
}
