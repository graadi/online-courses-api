package edu.graadi.repository;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import edu.graadi.dto.OnlineCourseDTO;

@Repository
public class OnlineCoursesRepository {

  public List<OnlineCourseDTO> getAllOnlineCourses(String fileLocationClassPath) {
    
    Gson gson = new Gson();
    Type objectType = new TypeToken<List<OnlineCourseDTO>>() {}.getType();

    JsonReader reader = null;
    
    try {

      File file = ResourceUtils.getFile(fileLocationClassPath);
      reader = new JsonReader(new FileReader(file.getAbsolutePath()));
    } catch (Exception ex) {
      return Collections.emptyList();
    }

    return gson.fromJson(reader, objectType);
  }
}
