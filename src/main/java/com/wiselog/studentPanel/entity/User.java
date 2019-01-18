package com.wiselog.studentPanel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class User {
    @Column(name ="user_id")
    private Long userId;
    @Column(name = "first_name")
    private  String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "mobile_no")
    private String mobileNo;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "college_name")
    private String collegeName;
    @Column(name = "current_college_year")
    private int year;
    @Column(name = "semester")
    private int semester;
    @Column(name = "branch")
    private String branch;

}
