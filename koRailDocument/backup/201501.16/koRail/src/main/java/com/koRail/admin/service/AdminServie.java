package com.koRail.admin.service;

import java.util.List;

import com.koRail.admin.to.OpratBean;
import com.koRail.admin.to.StatnBean;
import com.koRail.admin.to.TcktRcrdBean;
import com.koRail.admin.to.TrainBean;
import com.koRail.admin.to.TrainRcrdBean;
import com.koRail.common.exception.SQLExecutException;
import com.koRail.common.to.CommonBean;
import com.koRail.common.to.MemberBean;

public interface AdminServie {
	/*************************************
						현황
	*************************************/
	
	/*****************************
	 * 승차권 발권 현황 조회
	 * @param tcktRcrdBean
	 * @return
	 *****************************/
	public List<TcktRcrdBean> getTcktRcrdList(TcktRcrdBean tcktRcrdBean);
	
	/*************************************
	 * 열차별 승객 현황 조회
	 * @param trainRcrdBean
	 * @return
	 *************************************/
	public List<TrainRcrdBean> getTrainRcrdList(TrainRcrdBean trainRcrdBean);
	
	/*************************************
	 				역 관리
	 *************************************/
	
	/********************************
	 * 역 조회
	 * @param commonBean
	 * @return
	 ********************************/
	public List<StatnBean> getStatnList(CommonBean commonBean);
	
	/********************************
	 * 역 등록, 수정, 삭제
	 * @param statnBean
	 * @param deleteCodeArray
	 * @throws SQLExecutException
	 *******************************/
	public void setStatn(StatnBean statnBean, String[] deleteCodeArray) throws SQLExecutException;

	/*************************************
				열차 관리
	*************************************/
	
	/****************************
	 * 열차 조회
	 * @param commonBean
	 * @return
	 ***************************/
	public List<TrainBean> getTrainList(CommonBean commonBean);
	
	/*********************************
	 * 열차 등록, 수정, 삭제
	 * @param trainBean
	 * @param deleteCodeArray
	 * @throws SQLExecutException
	 ********************************/
	public void setTrain(TrainBean trainBean, String[] deleteCodeArray) throws SQLExecutException;
	
	/*************************************
				운행일정 관리
	*************************************/
	
	/*********************************
	 * 운행일정, 상세운행일정, 호실 조회
	 * @param commonBean
	 * @return
	 *********************************/
	public List<OpratBean> getOpratList(CommonBean commonBean);
	
	/*********************************
	 * 운행일정 중복체크
	 * @param commonBean
	 * @return
	 *********************************/
	public int getOpratCount(CommonBean commonBean);
	
	/*************************************
	 * 운행일정 등록, 수정, 삭제
	 * 상세운행 등록, 삭제
	 * 호실	 등록,삭제
	 * @param opratBean
	 * @param json
	 * @param deleteCodeArray
	 * @throws SQLExecutException
	 ************************************/
	public void setOprat(OpratBean opratBean, String[] json, String[] deleteCodeArray) throws SQLExecutException;

	/*****************************************
						회원
	*****************************************/
	
	/******************************
	* 회원조회
	* @param memberBean
	* @return
	******************************/
	public List<MemberBean> getMemberList(MemberBean memberBean);

	/*******************************
	 * 회원 삭제
	 * @param deleteCodeArray
	 * @throws SQLExecutException
	 *******************************/
	public void setMember(String[] deleteCodeArray) throws SQLExecutException;
}
