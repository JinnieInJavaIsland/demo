package com.example.demo.service;

import com.example.demo.domain.BoardVO;
import com.example.demo.dto.BoardDTO;

import java.util.List;

public interface BoardService {

    void register(BoardDTO boardDTO);

    List<BoardDTO> getAll();

    BoardDTO getOne(Long bno);

    void delete(Long bno);

    void update(BoardDTO boardDTO);

}
