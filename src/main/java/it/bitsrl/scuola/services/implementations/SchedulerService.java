package it.bitsrl.scuola.services.implementations;

import it.bitsrl.scuola.entities.Corso;
import it.bitsrl.scuola.entities.Lesson;
import it.bitsrl.scuola.repositories.CourseRepository;
import it.bitsrl.scuola.services.abstraction.AbstractSchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;

//@Component
@Service
public class SchedulerService implements AbstractSchedulerService {

    @Autowired
    private CourseRepository courseRepo;

    @Override
    public Collection<Corso> getCourses(String titleLike) {
        return (Collection<Corso>) this.courseRepo.findAll();
    }

    @Override
    public Corso addCourse(Corso corso) {
        return null;
    }

    @Override
    public void deleteCourseById(int id) {

    }

    @Override
    public Corso updateCourse(Corso corso) {
        return null;
    }

    @Override
    public Collection<Lesson> getLessonByCourseEdition(int courseEditionId) {
        return null;
    }
}
