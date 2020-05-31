package com.dv.tutorials.builder.model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class AbstractEmployee implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Long id;

	protected String salutation;

	protected String firstName;

	protected String middleName;

	protected String lastName;

	protected String emailId;

	protected LocalDate dateOfBirth;

	public Long getId() {
		return id;
	}

	public String getSalutation() {
		return salutation;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public String toString() {
		return getObjectStringBuilder().toString();
	}

	public StringBuilder getObjectStringBuilder() {
		return new StringBuilder()
				.append("id=").append(getId()).append("\n")
				.append("salutation=")
				.append(getSalutation()).append("\n")
				.append("firstName=").append(getFirstName()).append("\n")
				.append("middleName=").append(getMiddleName()).append("\n")
				.append("lastName=").append(getLastName())
				.append("\n").append("emailId=").append(getEmailId()).append("\n")
				.append("dateOfBirth=").append(getDateOfBirth()).append("\n");
	}

	interface IBuild<T extends AbstractEmployee> {
		T build();
	}

	public static abstract class AbstractBuilder<T extends AbstractEmployee, B extends AbstractBuilder<T, B>>
			implements IBuild<T> {

		protected T objectBeingBuilt;

		protected abstract B that();

		public abstract T build();

		protected abstract T createEmptyObject();

		public B id(Long id) {
			objectBeingBuilt.id = id;
			return that();
		}

		public B salutation(String salutation) {
			objectBeingBuilt.salutation = salutation;
			return that();
		}

		public B firstName(String firstName) {
			objectBeingBuilt.firstName = firstName;
			return that();
		}

		public B middleName(String middleName) {
			objectBeingBuilt.middleName = middleName;
			return that();
		}

		public B lastName(String lastName) {
			objectBeingBuilt.lastName = lastName;
			return that();
		}

		public B emailId(String emailId) {
			objectBeingBuilt.emailId = emailId;
			return that();
		}

		public B dateOfBirth(LocalDate dateOfBirth) {
			objectBeingBuilt.dateOfBirth = dateOfBirth;
			return that();
		}

		AbstractBuilder() {
			this.objectBeingBuilt = createEmptyObject();
		}

	}

}
