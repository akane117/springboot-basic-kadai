package com.example.springkadaiform;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@SpringBootApplication
@Data
public class SpringKadaiFormApplication {
	
	 public static void main(String[] args) {
	        SpringApplication.run( SpringKadaiFormApplication .class, args);
	    }
	
	
    @NotBlank(message = "お名前を入力してください。")
    private String name;

    
    @NotBlank(message = "メールアドレスを入力してください。")
    @Email(message =  "メールアドレスの入力形式が正しくありません。")
    private String email;

    // ロールID
    @NotNull(message = "お問い合わせ内容を入力してください。")
    private Integer message;

}
