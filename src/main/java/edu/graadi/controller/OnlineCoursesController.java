package edu.graadi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.graadi.dto.OnlineCourseDTO;
import edu.graadi.service.OnlineCoursesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/online-courses-api")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Api(value = "List all available Online Course Objects.")
public class OnlineCoursesController {

  @Autowired
  private OnlineCoursesService courseService;
  
  @ApiOperation(value = "Retrieve a list of available online courses")
  @GetMapping("/list")
  public ResponseEntity<List<OnlineCourseDTO>> listOnlineCourses() {
    
    List<OnlineCourseDTO> onlineLearningCourses = courseService.listOnlineCourses();
    return new ResponseEntity<>(onlineLearningCourses, HttpStatus.OK);
  }
}
