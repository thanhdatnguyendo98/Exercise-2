package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
import java.util.List;
 
/**
 * Created by Turreta.com on 8/7/2017.
 */
@Component
public class StudentListBean
{
    @Autowired
    private List<StudentBean> listOfStudents;

	public List<StudentBean> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<StudentBean> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
   
}