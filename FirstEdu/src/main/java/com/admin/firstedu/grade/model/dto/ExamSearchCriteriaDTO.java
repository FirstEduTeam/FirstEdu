package com.admin.firstedu.grade.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ExamSearchCriteriaDTO implements java.io.Serializable {

	private static final long serialVersionUID = -2216788908845122216L;

	private int refCategory;
	private String name;
	private java.sql.Date beginDate;
	private java.sql.Date endDate;
	private int grade;
	private int subject;
}
