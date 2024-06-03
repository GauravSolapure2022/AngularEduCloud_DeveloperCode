package in.codetech.angulareducloud.portal.controllerForHandleRecursion;
//package in.codetech.angulareducloud.portal.controller;
//
//
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import in.codetech.angulareducloud.portal.dto.CategoryDTO;
//import in.codetech.angulareducloud.portal.service.CategoryService;
//import in.codetech.angulareducloud.portal.service.MyCategoryService;
//
//@RestController
//@RequestMapping("/api/category")
//public class MyCategoryController {
//
//    @Autowired
//    private MyCategoryService categoryService;
//    
//    @PostMapping("/")
//    public CategoryDTO addCategory(@RequestBody CategoryDTO categoryDTO) {
//        return categoryService.addCategory(categoryDTO);
//    }
//    
//    @PutMapping("/{cId}")
//    public CategoryDTO changeCategory(@RequestBody CategoryDTO categoryDTO, @PathVariable long cId) {
//        return categoryService.updateCategory(categoryDTO, cId);
//    }
//    
//    @GetMapping("/")
//    public Set<CategoryDTO> getAllCategory(){
//        return categoryService.getCategories();
//    }
//    
//    @GetMapping("/{cId}")
//    public CategoryDTO getCategoryByCategoryId(@PathVariable long cId) {
//        return categoryService.getCategory(cId);
//    }
//}
