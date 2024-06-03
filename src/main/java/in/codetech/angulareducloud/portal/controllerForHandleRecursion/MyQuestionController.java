package in.codetech.angulareducloud.portal.controllerForHandleRecursion;
//package in.codetech.angulareducloud.portal.controller;
//
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import in.codetech.angulareducloud.portal.dto.QuestionDTO;
//import in.codetech.angulareducloud.portal.dto.QuizDTO;
//import in.codetech.angulareducloud.portal.service.MyQuestionService;
//
//@RestController
//@RequestMapping("/api/question")
//public class MyQuestionController {
//    @Autowired
//    private MyQuestionService questionService;
//
//    @PostMapping("/")
//    public QuestionDTO createQuestion(@RequestBody QuestionDTO questionDTO) {
//        return questionService.addQuestion(questionDTO);
//    }
//
//    @PutMapping("/{quesId}")
//    public QuestionDTO updateQuestion(@RequestBody QuestionDTO questionDTO, @PathVariable long quesId) {
//        return questionService.updateQuestion(questionDTO, quesId);
//    }
//
//    @GetMapping("/")
//    public Set<QuestionDTO> getAllQuestion() {
//        return questionService.getQuestions();
//    }
//
//    @GetMapping("/{quesId}")
//    public QuestionDTO getQuestionById(@PathVariable long quesId) {
//        return questionService.getQuestion(quesId);
//    }
//
//    @GetMapping("/quiz")
//    public Set<QuestionDTO> getAllQuestionByQuiz(@RequestBody QuizDTO quizDTO) {
//        return questionService.getQuestionsOfQuiz(quizDTO);
//    }
//
//    @DeleteMapping("/{quesId}")
//    public void deleteQuestion(@PathVariable long quesId) {
//        questionService.deleteQuestion(quesId);
//    }
//}
