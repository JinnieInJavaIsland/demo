package com.example.demo.service;

import com.example.demo.domain.BoardVO;
import com.example.demo.dto.BoardDTO;
import com.example.demo.mapper.Mapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final Mapper mapper;
    private final ModelMapper modelMapper;
    @Override
    public void register(BoardDTO boardDTO) {
        log.info(modelMapper);
        BoardVO vo = modelMapper.map(boardDTO, BoardVO.class);
        log.info(vo);
        mapper.insert(vo);

    }

    @Override
    public List<BoardDTO> getAll() {

        List<BoardDTO> dtoList = mapper.selectAll().stream()
                .map(vo-> modelMapper.map(vo,BoardDTO.class))
                .collect(Collectors.toList());

        return dtoList;
    }

    @Override
    public BoardDTO getOne(Long bno) {
        BoardDTO dto = modelMapper.map(mapper.selectOne(bno),BoardDTO.class);
        return dto;
    }

    @Override
    public void delete(Long bno) {
        mapper.remove(bno);
    }

    @Override
    public void update(BoardDTO boardDTO) {
        BoardVO vo = modelMapper.map(boardDTO,BoardVO.class);
        log.info(vo);
        mapper.update(vo);
    }
}
