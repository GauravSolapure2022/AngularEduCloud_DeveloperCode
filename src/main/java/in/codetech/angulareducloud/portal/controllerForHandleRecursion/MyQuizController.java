package in.codetech.angulareducloud.portal.controllerForHandleRecursion;
//package in.codetech.angulareducloud.portal.controller;
//
//
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import in.codetech.angulareducloud.portal.dto.QuizDTO;
//import in.codetech.angulareducloud.portal.module.Exam.Category;
//import in.codetech.angulareducloud.portal.service.MyQuizService;
//import in.codetech.angulareducloud.portal.service.QuizService;
//
//@RestController
//@RequestMapping("/api/quiz")
//public class MyQuizController {
//
//    @Autowired
//    private MyQuizService quizService;
//
//    @PostMapping("/")
//    public QuizDTO addQuiz(@RequestBody QuizDTO quizDTO) {
//        return quizService.addQuiz(quizDTO);
//    }
//
//    @PutMapping("/{qId}")
//    public QuizDTO updateQuiz(@RequestBody QuizDTO quizDTO, @PathVariable long qId) {
//        return quizService.updateQuiz(quizDTO, qId);
//    }
//
//    @GetMapping("/{qId}")
//    public QuizDTO getQuiz(@PathVariable long qId) {
//        return quizService.getQuiz(qId);
//    }
//
//    @DeleteMapping("/{qId}")
//    public void deleteQuiz(@PathVariable long qId) {
//        quizService.deleteQuiz(qId);
//    }
//
//    @GetMapping("/category")
//    public List<QuizDTO> getQuizzesByCategory(@RequestBody Category category) {
//        return quizService.getQuizzesOfCategory(category);
//    }
//
//    @GetMapping("/active")
//    public List<QuizDTO> getActiveQuizzes() {
//        return quizService.getActiveQuizzes();
//    }
//
//    @GetMapping("/active/category")
//    public List<QuizDTO> getActiveQuizzesByCategory(@RequestBody Category category) {
//        return quizService.getActiveQuizzesOfCategory(category);
//    }
//}
//
