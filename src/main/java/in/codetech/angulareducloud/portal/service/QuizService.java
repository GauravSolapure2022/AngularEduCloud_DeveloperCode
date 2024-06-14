package in.codetech.angulareducloud.portal.service;

import java.util.List;
import java.util.Set;

import in.codetech.angulareducloud.portal.model.exam.Category;
import in.codetech.angulareducloud.portal.model.exam.Quiz;

public interface QuizService {
	public Quiz addQuiz(Quiz quiz);

	public Quiz updateQuiz(Quiz quiz,long qId);

	public Set<Quiz> getQuizzes();

	public Quiz getQuiz(Long quizId);         

	public void deleteQuiz(Long quizId);

	public List<Quiz> getQuizzesOfCategory(Category category);

	public List<Quiz> getActiveQuizzes();

	public List<Quiz> getActiveQuizzesOfCategory(Category c);
}
