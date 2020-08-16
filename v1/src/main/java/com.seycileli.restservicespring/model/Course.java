package com.seycileli.restservicespring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private String courseId;
    private String courseName;
    private String courseDescription;

    @ManyToOne //many courses but 1 topic
    private Topic topic;
    /* Created for convenience but isn't really required.
    Creating this to make it easy to create new Course objects with given Topic */

    public Course() { }

    public Course(String courseId, String courseName, String courseDescription,
                  String topicId) {
        super();
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.topic = new Topic(topicId, "", "");
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return courseDescription;
    }

    public void setDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
