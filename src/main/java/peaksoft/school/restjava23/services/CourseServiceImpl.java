package peaksoft.school.restjava23.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.school.restjava23.dto.CourseResponse;
import peaksoft.school.restjava23.entities.Course;
import peaksoft.school.restjava23.repository.CourseRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{
    private final CourseRepository courseRepository;

    @Override
    public List<CourseResponse> getAll() {
        List<Course> courses = courseRepository.findAll();
        List<CourseResponse> courseResponses = new ArrayList<>();
        for (Course course : courses) {
            CourseResponse courseResponse = new CourseResponse();
            courseResponse.setId(course.getId());
            courseResponse.setName(course.getName());
            courseResponse.setDescription(course.getDescription());
            courseResponse.setImage(course.getImage());
            courseResponse.setDate(course.getDateOfStart());
            courseResponses.add(courseResponse);
        }
        return courseResponses;
    }
}
