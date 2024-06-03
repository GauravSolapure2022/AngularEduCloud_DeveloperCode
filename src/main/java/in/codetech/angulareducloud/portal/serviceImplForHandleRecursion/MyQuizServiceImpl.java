package in.codetech.angulareducloud.portal.serviceImplForHandleRecursion;
//package in.codetech.angulareducloud.portal.serviceImpl;
//
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import in.codetech.angulareducloud.portal.dto.QuizDTO;
//import in.codetech.angulareducloud.portal.module.Exam.Category;
//import in.codetech.angulareducloud.portal.module.Exam.Question;
//import in.codetech.angulareducloud.portal.module.Exam.Quiz;
//import in.codetech.angulareducloud.portal.repository.QuizRepository;
//import in.codetech.angulareducloud.portal.repository.QuestionRepository;
//import in.codetech.angulareducloud.portal.service.MyQuizService;
//import in.codetech.angulareducloud.portal.service.QuizService;
//
//@Service
//public class MyQuizServiceImpl implements MyQuizService {
//
//	@Autowired
//	private QuizRepository quizRepository;
//
//	@Autowired
//	private QuestionRepository questionRepository;
//
//	@Override
//	public QuizDTO addQuiz(QuizDTO quizDTO) {
//		Quiz quiz = mapToEntity(quizDTO);
//		Quiz savedQuiz = quizRepository.save(quiz);
//		return mapToDTO(savedQuiz);
//	}
//
//	@Override
//	public QuizDTO updateQuiz(QuizDTO quizDTO, long qId) {
//		Optional<Quiz> optionalQuiz = quizRepository.findById(qId);
//		if (optionalQuiz.isPresent()) {
//			Quiz existingQuiz = optionalQuiz.get();
//			updateEntityFromDTO(existingQuiz, quizDTO);
//			Quiz updatedQuiz = quizRepository.save(existingQuiz);
//			return mapToDTO(updatedQuiz);
//		}
//		return null;
//	}
//
//	@Override
//	public Set<QuizDTO> getQuizzes() {
//		Set<Quiz> quizzes = new LinkedHashSet<>(quizRepository.findAll());
//		return quizzes.stream().map(this::mapToDTO).collect(Collectors.toSet());
//	}
//
//	@Override
//	public QuizDTO getQuiz(Long quizId) {
//		Optional<Quiz> optionalQuiz = quizRepository.findById(quizId);
//		return optionalQuiz.map(this::mapToDTO).orElse(null);
//	}
//
//	@Override
//	public void deleteQuiz(Long quizId) {
//		quizRepository.deleteById(quizId);
//	}
//
//	@Override
//	public List<QuizDTO> getQuizzesOfCategory(Category category) {
//		List<Quiz> quizzes = quizRepository.findByCategory(category);
//		return quizzes.stream().map(this::mapToDTO).collect(Collectors.toList());
//	}
//
//	@Override
//	public List<QuizDTO> getActiveQuizzes() {
//		List<Quiz> quizzes = quizRepository.findByActive(true);
//		return quizzes.stream().map(this::mapToDTO).collect(Collectors.toList());
//	}
//
//	@Override
//	public List<QuizDTO> getActiveQuizzesOfCategory(Category category) {
//		List<Quiz> quizzes = quizRepository.findByCategoryAndActive(category, true);
//		return quizzes.stream().map(this::mapToDTO).collect(Collectors.toList());
//	}
//
//	private QuizDTO mapToDTO(Quiz quiz) {
//		Set<Long> questionIds = quiz.getQuestions().stream().map(Question::getQuesId).collect(Collectors.toSet());
//		return new QuizDTO(quiz.getqId(), quiz.getTitle(), quiz.getDescription(), quiz.getMaxMarks(),
//				quiz.getNoOfQuestion(), quiz.isActive(), quiz.getCategory().getcId(), questionIds);
//	}
//
//	private Quiz mapToEntity(QuizDTO quizDTO) {
//		Quiz quiz = new Quiz();
//		quiz.setqId(quizDTO.getqId());
//		quiz.setTitle(quizDTO.getTitle());
//		quiz.setDescription(quizDTO.getDescription());
//		quiz.setMaxMarks(quizDTO.getMaxMarks());
//		quiz.setNoOfQuestion(quizDTO.getNoOfQuestion());
//		quiz.setActive(quizDTO.isActive());
//
//		Category category = new Category();
//		category.setcId(quizDTO.getCategoryId());
//		quiz.setCategory(category);
//
//		Set<Question> questions = new LinkedHashSet<>();
//		if (quizDTO.getQuestionIds() != null) {
//			questions = quizDTO.getQuestionIds().stream()
//					.map(questionId -> questionRepository.findById(questionId).orElse(null)).filter(Objects::nonNull)
//					.collect(Collectors.toSet());
//		}
//		quiz.setQuestions(questions);
//
//		return quiz;
//	}
//
//	private void updateEntityFromDTO(Quiz quiz, QuizDTO quizDTO) {
//		quiz.setTitle(quizDTO.getTitle());
//		quiz.setDescription(quizDTO.getDescription());
//		quiz.setMaxMarks(quizDTO.getMaxMarks());
//		quiz.setNoOfQuestion(quizDTO.getNoOfQuestion());
//		quiz.setActive(quizDTO.isActive());
//
//		Category category = new Category();
//		category.setcId(quizDTO.getCategoryId());
//		quiz.setCategory(category);
//
//		Set<Question> questions = new LinkedHashSet<>();
//		if (quizDTO.getQuestionIds() != null) {
//			questions = quizDTO.getQuestionIds().stream()
//					.map(questionId -> questionRepository.findById(questionId).orElse(null)).filter(Objects::nonNull)
//					.collect(Collectors.toSet());
//		}
//		quiz.setQuestions(questions);
//	}
//}
