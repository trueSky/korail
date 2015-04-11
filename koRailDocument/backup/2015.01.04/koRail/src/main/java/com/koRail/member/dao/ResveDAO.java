package com.koRail.member.dao;

import java.util.List;

import com.koRail.member.to.ResveBean;
import com.koRail.member.to.TcktBean;

public interface ResveDAO {
	/*******************************
	 * 승차권 예매를 위한 운행정보 조회
	 * @param tcktBean
	 * @return
	 *******************************/
	public List<TcktBean> selectTcktList(TcktBean tcktBean);

	/********************************
	 * 예약 등록
	 * @param resveBean
	 * @return
	 ********************************/
	public int insertResve(ResveBean resveBean);
	
	/*********************************
	 * 결제할 예매 정보 조회
	 * @param resveCode
	 * @return
	 ********************************/
	public ResveBean selectResve(String resveCode);
}
