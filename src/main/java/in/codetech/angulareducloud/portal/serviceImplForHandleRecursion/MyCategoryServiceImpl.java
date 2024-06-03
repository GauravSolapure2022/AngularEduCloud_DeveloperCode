package in.codetech.angulareducloud.portal.serviceImplForHandleRecursion;
//package in.codetech.angulareducloud.portal.serviceImpl;
//
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import in.codetech.angulareducloud.portal.module.Exam.Category;
//import in.codetech.angulareducloud.portal.repository.CategoryRepository;
//import in.codetech.angulareducloud.portal.service.CategoryService;
//import in.codetech.angulareducloud.portal.service.MyCategoryService;
//import in.codetech.angulareducloud.portal.dto.CategoryDTO;
//
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import in.codetech.angulareducloud.portal.dto.CategoryDTO;
//import in.codetech.angulareducloud.portal.module.Exam.Category;
//import in.codetech.angulareducloud.portal.repository.CategoryRepository;
//import in.codetech.angulareducloud.portal.service.CategoryService;
//
//@Service
//public class MyCategoryServiceImpl implements MyCategoryService {
//
//    @Autowired
//    private CategoryRepository categoryRepository;
//
//    @Override
//    public CategoryDTO addCategory(CategoryDTO categoryDTO) {
//        Category category = mapToEntity(categoryDTO);
//        Category savedCategory = categoryRepository.save(category);
//        return mapToDTO(savedCategory);
//    }
//
//    @Override
//    public CategoryDTO updateCategory(CategoryDTO categoryDTO, long cId) {
//        Category existingCategory = categoryRepository.findById(cId).orElse(null);
//        if (existingCategory != null) {
//            updateEntityFromDTO(existingCategory, categoryDTO);
//            Category updatedCategory = categoryRepository.save(existingCategory);
//            return mapToDTO(updatedCategory);
//        }
//        return null;
//    }
//
//    @Override
//    public Set<CategoryDTO> getCategories() {
//        Set<Category> categories = new LinkedHashSet<>(categoryRepository.findAll());
//        return categories.stream().map(this::mapToDTO).collect(Collectors.toSet());
//    }
//
//    @Override
//    public CategoryDTO getCategory(Long cId) {
//        java.util.Optional<Category> optionalCategory = categoryRepository.findById(cId);
//        return optionalCategory.map(this::mapToDTO).orElse(null);
//    }
//
//    @Override
//    public void deleteCategory(Long cId) {
//        categoryRepository.deleteById(cId);
//    }
//
//    private CategoryDTO mapToDTO(Category category) {
//        Set<Long> quizIds = category.getQuizes().stream().map(quiz -> quiz.getqId()).collect(Collectors.toSet());
//        return new CategoryDTO(
//            category.getcId(),
//            category.getTitle(),
//            category.getDescription(),
//            quizIds
//        );
//    }
//
//    private Category mapToEntity(CategoryDTO categoryDTO) {
//        Category category = new Category();
//        category.setcId(categoryDTO.getcId());
//        category.setTitle(categoryDTO.getTitle());
//        category.setDescription(categoryDTO.getDescription());
//        // Assuming that quizzes are set elsewhere, or add logic to fetch and set quizzes
//        return category;
//    }
//
//    private void updateEntityFromDTO(Category category, CategoryDTO categoryDTO) {
//        category.setTitle(categoryDTO.getTitle());
//        category.setDescription(categoryDTO.getDescription());
//        // Update other fields as necessary
//    }
//}
