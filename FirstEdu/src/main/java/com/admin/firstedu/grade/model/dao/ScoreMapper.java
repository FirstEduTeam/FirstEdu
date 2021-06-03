package com.admin.firstedu.grade.model.dao;

import java.util.List;

import com.admin.firstedu.grade.model.dto.ModifiedScoreDTO;
import com.admin.firstedu.grade.model.dto.ScoreDTO;
import com.admin.firstedu.grade.model.dto.ScoreListDTO;
import com.admin.firstedu.grade.model.dto.ScoreSearchCriteria;

public interface ScoreMapper {

	public List<ScoreDTO> selectScoreList(ScoreSearchCriteria searchCriteria);

	public int insertScore(ScoreListDTO scoreList);

	public int updateScore(ModifiedScoreDTO modifiedScore);

}
