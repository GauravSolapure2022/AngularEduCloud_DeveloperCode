package in.codetech.angulareducloud.portal.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import in.codetech.angulareducloud.portal.model.exam.Question;
import in.codetech.angulareducloud.portal.model.exam.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long> {
	Set<Question> findByQuiz(Quiz quiz);
}
