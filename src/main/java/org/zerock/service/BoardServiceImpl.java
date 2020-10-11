package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
@Repository
public class BoardServiceImpl implements BoardService {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	

	@Override
	public void register(BoardVO board) {

		log.info("register......" + board);

		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(Long bno) {
		// TODO Auto-generated method stub
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		// TODO Auto-generated method stub
		
		mapper.update(board);
		
		return false;
	}

	@Override
	public boolean remove(Long bno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BoardVO> getList(Criteria cri) {
		
		log.info("getList ...............");
		
		return mapper.getListWithPaging(cri);
	}
	
	@Override
	public int getTotal(Criteria cri) {
		
		log.info("get total count");
		return mapper.getTotalCount(cri);
		
	}

}






//package org.zerock.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.zerock.domain.BoardVO;
//import org.zerock.mapper.BoardMapper;
//
//import lombok.AllArgsConstructor;
//import lombok.Setter;
//import lombok.extern.log4j.Log4j;
//import lombok.extern.log4j.Log4j2;
//
//
//
//@Log4j2
//@Service
//@AllArgsConstructor
//public abstract class BoardServiceImpl implements BoardService {
//
//	@Setter(onMethod_ = @Autowired)
//	private BoardMapper mapper;
//	
//	@Override
//	public void register(BoardVO board) {
//		
//		
//		log.info(board);
//		
//		mapper.insertSelectKey(board);
//	}
//
//}
