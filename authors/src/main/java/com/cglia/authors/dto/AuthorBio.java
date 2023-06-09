package com.cglia.authors.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

//Generated 09-Jun-2023, 9:53:22 am by Hibernate Tools 4.3.6.Final

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * AuthorBio generated by hbm2java
 */
@Entity
@Table(name = "author_bio", catalog = "umamahesh")
public class AuthorBio implements java.io.Serializable {

	private int authorbioId;
	private Author author;
	private String authorQualification;
	private String authorRewards;
	private String authorAddress;

	public AuthorBio() {
	}

	public AuthorBio(int authorbioId) {
		this.authorbioId = authorbioId;
	}

	public AuthorBio(int authorbioId, Author author, String authorQualification, String authorRewards,
			String authorAddress) {
		this.authorbioId = authorbioId;
		this.author = author;
		this.authorQualification = authorQualification;
		this.authorRewards = authorRewards;
		this.authorAddress = authorAddress;
	}

	@Id

	@Column(name = "authorbio_id", unique = true, nullable = false)
	public int getAuthorbioId() {
		return this.authorbioId;
	}

	public void setAuthorbioId(int authorbioId) {
		this.authorbioId = authorbioId;
	}
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id")
	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Column(name = "author_qualification", length = 45)
	public String getAuthorQualification() {
		return this.authorQualification;
	}

	public void setAuthorQualification(String authorQualification) {
		this.authorQualification = authorQualification;
	}

	@Column(name = "author_rewards", length = 45)
	public String getAuthorRewards() {
		return this.authorRewards;
	}

	public void setAuthorRewards(String authorRewards) {
		this.authorRewards = authorRewards;
	}

	@Column(name = "author_address", length = 45)
	public String getAuthorAddress() {
		return this.authorAddress;
	}

	public void setAuthorAddress(String authorAddress) {
		this.authorAddress = authorAddress;
	}

}
