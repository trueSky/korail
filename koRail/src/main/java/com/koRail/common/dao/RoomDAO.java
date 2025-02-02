package com.koRail.common.dao;

import java.util.List;

import com.koRail.common.to.RoomBean;

public interface RoomDAO {

	/*******************************************
	 * 예약을 위해 선택한 승차권에 대한 호실정보 조회
	 * @param roomBean
	 * @return
	 *******************************************/
	public List<RoomBean> selectTcktRommList(RoomBean roomBean);
	
	/***************************
	 * 호실 등록
	 * @param roomBean
	 ***************************/
	public void insertRoom(RoomBean roomBean);

	/*****************************
	 * 호실 삭제
	 * @param roomCode
	 ****************************/
	public void deleteRoom(String roomCode);
}
