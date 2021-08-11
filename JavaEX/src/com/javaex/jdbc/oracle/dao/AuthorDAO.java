package com.javaex.jdbc.oracle.dao;

import java.util.List;

public interface AuthorDAO {
	public List<AuthorVO> getList();  //전체목록
	public List<AuthorVO> search(long keyword); // 검색목록
	public AuthorVO get(Long id);  //저자 정보 확인
	public boolean insert(AuthorVO vo); //삽입
	public boolean update(AuthorVO vo); //갱신
	public boolean delete(Long id); //삭제
}
