package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.*;

@SpringBootApplication
public class DemoApplication {
	

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		StudentListBean dept = context.getBean("studentListBean", StudentListBean.class);
		StudentBean stu = new StudentBean();

		// show students
		for (StudentBean student : dept.getListOfStudents()) {
			System.out.println(student.toString());
		}

		// find student who has the largest GPA
			for (StudentBean student : dept.getListOfStudents()) {
				for (int i = 0; i < dept.getListOfStudents().size(); i++) {
					if (dept.getListOfStudents().get(i).getGPA() > stu.getGPA()) {
						stu = dept.getListOfStudents().get(i);
						
					}
				}
			}
			System.out.println("Student has the largest GPA: " + stu.getName());

		// find student who has the smallest GPA
			for (StudentBean student : dept.getListOfStudents()) {
				for (int i = 0; i < dept.getListOfStudents().size(); i++) {
					if (dept.getListOfStudents().get(i).getGPA() < stu.getGPA()) {
						stu = dept.getListOfStudents().get(i);
					}
				}
			}
			System.out.println("Student has the smallest GPA: " + stu.getName());

	}

}
