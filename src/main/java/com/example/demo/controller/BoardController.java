package com.example.demo.controller;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/board")
@Log4j2
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public void list(Model model){
        log.info("list .............");
        model.addAttribute("dtolist",boardService.getAll());
    }

    @GetMapping("/register") //등록화면
    public void registerGET(){
        log.info("GET board register.............");
    }

    @PostMapping("/register") //등록처리
    public String registerPOST(BoardDTO boardDTO){
        log.info("POST board register...........");
        log.info(boardDTO);
        boardDTO.setDate(LocalDate.now());
        boardService.register(boardDTO);

        return "redirect:/board/list"; //등록과 동시에 리스트 화면으로 가기
    }

    @GetMapping("/read")
    public void readGET(Model model, String bno){
        log.info("GET board read...............");
        Long no = Long.parseLong(bno);
        model.addAttribute("dto",boardService.getOne(no));
    }

    @GetMapping("/delete")
    public String deleteGET(String bno){

        log.info("GET board delete....................");

        boardService.delete(Long.parseLong(bno));

        return "redirect:/board/list";
    }

    @GetMapping("/update")
    public void updateGET(String bno, Model model){
        Long no = Long.parseLong(bno);
        log.info(no);
        model.addAttribute("bno",no);
    }

    @PostMapping("/update")
    public String updatePOST(BoardDTO boardDTO){

        log.info("POST update ...........................");

        log.info(boardDTO);

        boardService.update(boardDTO);

        return "redirect:/board/list";

    }
}
