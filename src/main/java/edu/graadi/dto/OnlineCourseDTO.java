package edu.graadi.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class OnlineCourseDTO {
  
  public String courseName;
  
  public String courseAuthor;
  
  public String courseSummary;
  
  public String courseLength;
  
  public Double coursePrice;
  
  public Double courseRating;
  
  public String courseLogo;
}
