package in.codetech.angulareducloud.portal.serviceImplForHandleRecursion;
//package in.codetech.angulareducloud.portal.serviceImpl;
//
//import java.util.LinkedHashSet;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import org.apache.el.stream.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import in.codetech.angulareducloud.portal.dto.QuestionDTO;
//import in.codetech.angulareducloud.portal.dto.QuizDTO;
//import in.codetech.angulareducloud.portal.module.Exam.Question;
//import in.codetech.angulareducloud.portal.module.Exam.Quiz;
//import in.codetech.angulareducloud.portal.repository.QuestionRepository;
//import in.codetech.angulareducloud.portal.repository.QuizRepository;
//import in.codetech.angulareducloud.portal.service.MyQuestionService;
//
//@Service
//public class MyQuestionServiceImpl implements MyQuestionService {
//
//    @Autowired
//    private QuestionRepository questionRepository;
//
//    @Autowired
//    private QuizRepository quizRepository; // Assuming this repository exists
//
//    @Override
//    public QuestionDTO addQuestion(QuestionDTO questionDTO) {
//        Question question = mapToEntity(questionDTO);
//        Question savedQuestion = questionRepository.save(question);
//        return mapToDTO(savedQuestion);
//    }
//
//    @Override
//    public QuestionDTO updateQuestion(QuestionDTO questionDTO, long quesId) {
//        Question existingQuestion = questionRepository.findById(quesId).orElse(null);
//        if (existingQuestion != null) {
//            updateEntityFromDTO(existingQuestion, questionDTO);
//            Question updatedQuestion = questionRepository.save(existingQuestion);
//            return mapToDTO(updatedQuestion);
//        }
//        return null;
//    }
//
//    @Override
//    public Set<QuestionDTO> getQuestions() {
//        Set<Question> questions = new LinkedHashSet<>(questionRepository.findAll());
//        return questions.stream().map(this::mapToDTO).collect(Collectors.toSet());
//    }
//
//    @Override
//    public QuestionDTO getQuestion(Long quesId) {
//        java.util.Optional<Question> optionalQuestion = questionRepository.findById(quesId);
//        return optionalQuestion.map(this::mapToDTO).orElse(null);
//    }
//
//    @Override
//    public Set<QuestionDTO> getQuestionsOfQuiz(QuizDTO quizDTO) {
//        Quiz quiz = mapToEntity(quizDTO);
//        Set<Question> questions = questionRepository.findByQuiz(quiz);
//        return questions.stream().map(this::mapToDTO).collect(Collectors.toSet());
//    }
//
//    @Override
//    public void deleteQuestion(Long quesId) {
//        questionRepository.deleteById(quesId);
//    }
//
//    private QuestionDTO mapToDTO(Question question) {
//        return new QuestionDTO(
//            question.getQuesId(),
//            question.getContent(),
//            question.getImage(),
//            question.getOption1(),
//            question.getOption2(),
//            question.getOption3(),
//            question.getOption4(),
//            question.getAnswer(),
//            question.getQuiz() != null ? question.getQuiz().getqId() : null
//        );
//    }
//
//    private Question mapToEntity(QuestionDTO questionDTO) {
//        Question question = new Question();
//        question.setQuesId(questionDTO.getQuesId());
//        question.setContent(questionDTO.getContent());
//        question.setImage(questionDTO.getImage());
//        question.setOption1(questionDTO.getOption1());
//        question.setOption2(questionDTO.getOption2());
//        question.setOption3(questionDTO.getOption3());
//        question.setOption4(questionDTO.getOption4());
//        question.setAnswer(questionDTO.getAnswer());
//        
//        if (questionDTO.getQuizId() != null) {
//            Quiz quiz = quizRepository.findById(questionDTO.getQuizId()).orElse(null);
//            question.setQuiz(quiz);
//        }
//        return question;
//    }
//
//    private Quiz mapToEntity(QuizDTO quizDTO) {
//        Quiz quiz = new Quiz();
//        // map fields from QuizDTO to Quiz entity
//        return quiz;
//    }
//
//    private void updateEntityFromDTO(Question question, QuestionDTO questionDTO) {
//        question.setContent(questionDTO.getContent());
//        question.setImage(questionDTO.getImage());
//        question.setOption1(questionDTO.getOption1());
//        question.setOption2(questionDTO.getOption2());
//        question.setOption3(questionDTO.getOption3());
//        question.setOption4(questionDTO.getOption4());
//        question.setAnswer(questionDTO.getAnswer());
//        
//        if (questionDTO.getQuizId() != null) {
//            Quiz quiz = quizRepository.findById(questionDTO.getQuizId()).orElse(null);
//            question.setQuiz(quiz);
//        }
//    }
//}
