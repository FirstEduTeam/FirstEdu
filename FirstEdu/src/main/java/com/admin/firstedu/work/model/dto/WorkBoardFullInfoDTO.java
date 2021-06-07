package com.admin.firstedu.work.model.dto;

import java.util.List;

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
public class WorkBoardFullInfoDTO implements java.io.Serializable {

	private static final long serialVersionUID = 7763407432531553019L;
	
	private int boardNo;
	private String title;
	private int creator;
	private String isFavorite;
	private List<WorkBoardMemberFullInfoDTO> memberList;
}
