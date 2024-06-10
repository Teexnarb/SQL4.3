package pro.sku.SQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sku.SQL.model.Faculty;

import java.util.Collection;


public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Collection<Faculty> getByNameIgnoreCaseOrColorIgnoreCase(String name, String color);
}