package com.admin.firstedu.work.model.dto;

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
public class WorkBoardMemberFullInfoDTO implements java.io.Serializable {

	private static final long serialVersionUID = -7584589745206635289L;

	private String favoriteYn;
	private WorkBoardDTO board;
	private TeacherDTO teacher;
}
