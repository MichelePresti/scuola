package it.bitsrl.scuola.services.abstraction;

import it.bitsrl.scuola.entities.Corso;
import it.bitsrl.scuola.entities.Lesson;

import java.util.Collection;
import java.util.List;

public interface AbstractSchedulerService {

    Collection<Corso> getCourses(String titleLike);
    Corso addCourse(Corso corso);
    void deleteCourseById(int id);
    Corso updateCourse(Corso corso);
    Collection<Lesson> getLessonByCourseEdition(int courseEditionId);
}
