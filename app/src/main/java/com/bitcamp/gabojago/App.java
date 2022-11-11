package com.bitcamp.gabojago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableTransactionManagement
@SpringBootApplication
public class App {

  public static void main(String[] args) {
    System.out.println("비트캠프 프로젝트!");
    SpringApplication.run(App.class, args);
  }

  @GetMapping("/")
  public String welcome(@CookieValue(name = "id", defaultValue = "") String id, Model model) {
    model.addAttribute("id", id);
    return "main";
  }

  @GetMapping("/recommendation/kakaoTest")
  public void kakaoTest() {
  }

}