package Repository;

import model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoInt extends JpaRepository<Model,Integer> {
}
