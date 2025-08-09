package com.in28Minutes.springboot.learn_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//course : id , name ,author
@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(new Course(1, "AWS", "Khushi"),
                new Course(2, "Spring", "in28Mintunes"));
    }
}
