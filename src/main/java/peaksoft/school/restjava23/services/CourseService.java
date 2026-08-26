package peaksoft.school.restjava23.services;

import peaksoft.school.restjava23.dto.CourseResponse;

import java.util.List;

public interface CourseService {
    List<CourseResponse> getAll();
}
