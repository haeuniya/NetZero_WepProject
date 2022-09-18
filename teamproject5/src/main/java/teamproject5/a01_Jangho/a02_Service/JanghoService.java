package teamproject5.a01_Jangho.a02_Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teamproject5.a01_Jangho.a03_DAO.JanghoDao;
import teamproject5.a01_Jangho.a04_VO.FreeBoard;


@Service
public class JanghoService {
	@Autowired(required = false)
	private JanghoDao dao;
	
	public List<FreeBoard> getFreeBoardList(FreeBoard sch){
		return dao.getFreeBoardList(sch);
	}
	public void insertFreeBoard(FreeBoard ins) {
		dao.insertFreeBoard(ins);
	}
	public FreeBoard getFreeBoardDetail(int freeNum) {
		dao.readCountup(freeNum);
		return dao.getFreeBoardDetail(freeNum);
	}
	public void deleteFreeBoard(int freeNum) {
		dao.deleteFreeBoard(freeNum);
	}
	public FreeBoard getFreeBoardDetailUpdate(int freeNum) {
		return dao.getFreeBoardDetailUpdate(freeNum);
	}
	public FreeBoard updateFreeBoard(FreeBoard upt) {
		dao.updateFreeBoard(upt);
		return dao.getFreeBoardDetail(upt.getFreeNum());
	}
	

}
