package edu.graadi.service;

import java.util.List;

import edu.graadi.repository.OnlineCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.graadi.dto.OnlineCourseDTO;

@Service
public class OnlineCoursesServiceImpl implements OnlineCoursesService {

  private static final String FILE_LOCATION = "json/source-data.json";
  
  @Autowired
  private OnlineCoursesRepository learningCourseRepository;
  
  @Override
  public List<OnlineCourseDTO> listOnlineCourses() {
    return learningCourseRepository.getAllOnlineCourses(FILE_LOCATION);
  }
}
