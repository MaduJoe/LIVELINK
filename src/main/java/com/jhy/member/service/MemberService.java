package com.jhy.member.service;

import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpSession;

public interface MemberService {

	public List select(Map map);

	//public int delete(Map map);

	public int update(Map map);

	public int selectCnt(Map map);

	public String idCheck(String id);

	public int memberRegist(Map map);

	public Map logincheck(Map map);

	public List selectMyReview(Map detailForm);

	public Map select2(Map map);

	public List myFavorite(Map map);

	public List myLib(Map lib_seq);

	public Integer deleteMyLib(Map map);
	
	public List reservation(Map map);
	
	public int updatepw(Map map);

	public int insertreser(Map map);
	
	public int deletebook(Map map);
	
	public int total_cnt(Map map);
	
	public List reserselect(Map map);
}