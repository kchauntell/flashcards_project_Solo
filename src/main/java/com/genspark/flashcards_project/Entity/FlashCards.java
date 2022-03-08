package com.genspark.flashcards_project.Entity;

import javax.persistence.*;

@Entity
@Table(name = "FLASHCARDS")
public class FlashCards {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "course", columnDefinition="varchar(50)")
  private String course;

  @Column(name = "question", columnDefinition="TEXT")
  private String question;

  @Column(name = "answer", columnDefinition="TEXT")
  private String answer;

  @Column(name = "reference", columnDefinition="TEXT")
  private String urlLink;

  @Column(name = "userId")
  private long userId;

  // Constructors
  public FlashCards() {
  }

  public FlashCards(long id, String course, String question, String answer, String urlLink, long userId) {

    this.id = id;
    this.course = course;
    this.question = question;
    this.answer = answer;
    this.urlLink = urlLink;
    this.userId = userId;
  }

  // Getters and Setters
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public String getUrlLink() {
    return urlLink;
  }

  public void setUrlLink(String urlLink) {
    this.urlLink = urlLink;
  }

  public long getUserID() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "FlashCard{" +
        "id=" + id +
        ", course='" + course + '\'' +
        ", question='" + question + '\'' +
        ", answer='" + answer + '\'' +
        ", references='" + urlLink + '\'' +
        ", userID='" + userId + '\'' +
        '}';
  }
}
