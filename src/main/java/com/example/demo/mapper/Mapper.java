package com.example.demo.mapper;

import com.example.demo.domain.BoardVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Mapper {

    String getTime();

    void insert(BoardVO boardVO);

    List<BoardVO> selectAll();

    BoardVO selectOne(Long bno);

    void remove(Long bno);

    void update(BoardVO boardVO);
}
