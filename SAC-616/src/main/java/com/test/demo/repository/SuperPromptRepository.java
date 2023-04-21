@Repository
public interface SuperPromptRepository extends JpaRepository<SuperPrompt, Integer> {
 
    List<SuperPrompt> findByApplication(String application);
 
    List<SuperPrompt> findByUserExperience(String userExperience);
 
    List<SuperPrompt> findByUserInteraction(String userInteraction);
 
    SuperPrompt findByApplicationAndUserExperienceAndUserInteraction(String application, String userExperience, String userInteraction);
 
}