package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import jdk.jfr.Name;
import org.springframework.context.annotation.Bean;

public class ContextConfiguration {
    @Bean
    @Name("board")
    public BoardDTO board() {
        return new BoardDTO(2L, "스프링 수업이 앞으로 많이 어려워질까요?", "맞아요", "나");
    }
}
