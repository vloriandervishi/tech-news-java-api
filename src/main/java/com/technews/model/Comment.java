package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table (name="comment")
public class Comment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String commentText;
    private Integer userId;
    private Integer postId;

    public Comment(Integer id, String commentText, Integer userId, Integer postId) {
        this.id = id;
        this.commentText = commentText;
        this.userId = userId;
        this.postId = postId;
    }
}
