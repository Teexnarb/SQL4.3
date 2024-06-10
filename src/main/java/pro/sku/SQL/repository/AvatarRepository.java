package pro.sku.SQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sku.SQL.model.Avatar;

public interface AvatarRepository extends JpaRepository<Avatar,Long> {
    Avatar findByStudentId(long id);

}
