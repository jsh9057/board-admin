package com.jsh.boardadminproject.controller.advice;

import com.jsh.boardadminproject.service.VisitCounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@RequiredArgsConstructor
@ControllerAdvice
public class VisitCountControllerAdvice {

    private final VisitCounterService visitCounterService;

    @ModelAttribute("visitCount")
    public Long visitCount(){
        return visitCounterService.visitCount();
    }
}
