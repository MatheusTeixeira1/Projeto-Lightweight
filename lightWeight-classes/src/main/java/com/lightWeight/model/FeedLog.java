package com.lightWeight.model;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class FeedLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPost;
	private int idCreator;
	private int textContent;
	private int midaContent;
	private MidiaType midiaType;
	@Temporal(TemporalType.TIMESTAMP)
    private Date postTime;
	
	
	public FeedLog(int idPost, int idCreator, int textContent, int midaContent, MidiaType midiaType, Date postTime) {
		super();
		this.idPost = idPost;
		this.idCreator = idCreator;
		this.textContent = textContent;
		this.midaContent = midaContent;
		this.midiaType = midiaType;
		this.postTime = postTime;
	}
	
	
	
	public int getIdPost() {
		return idPost;
	}
	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}
	public int getIdCreator() {
		return idCreator;
	}
	public void setIdCreator(int idCreator) {
		this.idCreator = idCreator;
	}
	public int getTextContent() {
		return textContent;
	}
	public void setTextContent(int textContent) {
		this.textContent = textContent;
	}
	public int getMidaContent() {
		return midaContent;
	}
	public void setMidaContent(int midaContent) {
		this.midaContent = midaContent;
	}
	public MidiaType getMidiaType() {
		return midiaType;
	}
	public void setMidiaType(MidiaType midiaType) {
		this.midiaType = midiaType;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
}
