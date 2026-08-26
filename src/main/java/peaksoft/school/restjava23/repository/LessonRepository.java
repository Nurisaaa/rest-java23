package peaksoft.school.restjava23.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.school.restjava23.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
