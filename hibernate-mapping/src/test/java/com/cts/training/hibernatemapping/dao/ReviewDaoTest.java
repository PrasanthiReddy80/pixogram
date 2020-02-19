package com.cts.training.hibernatemapping.dao;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.training.hibernatemapping.HibernateMappingApplication;
import com.cts.training.hibernatemapping.entity.Course;
import com.cts.training.hibernatemapping.entity.Review;
@RunWith(SpringRunner.class) // Test Runner
@SpringBootTest(classes =  HibernateMappingApplication.class )

public class ReviewDaoTest {
	@Autowired
	private ReviewDao reviewDao;
	@Autowired
	private CourseDao courseDao;
	
	@Test
	public void  testaddReviewAndCourse() {
	    Review review=new Review();
	    review.setReview("good");
	    Course course=new Course();
	    course.setName("map");
	        Review added=this.reviewDao.addReviewAndCourse(review,course);
	        assertEquals("map",added.getCourse());
			
	    }
	@Test
	public void addReviewtoExistingCourse() {
	Course course=this.courseDao.findById(2);
	 Review review=new Review();
	 
	 review.setReview("hello");
	 Review added=this.reviewDao.addReviewtoExistingCourse(review, course);
			 assertEquals("map",added.getCourse().getName());

	}
}
