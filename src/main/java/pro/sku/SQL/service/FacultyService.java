package pro.sku.SQL.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sku.SQL.model.Faculty;
import pro.sku.SQL.model.Student;
import pro.sku.SQL.repository.FacultyRepository;

import java.util.Collection;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFaculty(Faculty faculty) {

        return facultyRepository.save(faculty);
    }

    public Faculty findFaculty(long id) {
        return facultyRepository.findById(id).get();
    }

    public Faculty editFaculty(Faculty faculty) {

        return facultyRepository.save(faculty);
    }


    public void deleteFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> findByNameOrColor(String color, String name) {

        return facultyRepository.getByNameIgnoreCaseOrColorIgnoreCase(color, name);
    }

    public Collection<Student> getAllStudentOfFaculty(long id) {
        return facultyRepository.getReferenceById(id).getStudents();
    }

}