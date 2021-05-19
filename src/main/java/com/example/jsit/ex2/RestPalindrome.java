package com.example.jsit.ex2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class RestPalindrome {

    @GetMapping("/{str}")
    public String checkPalindrome(@PathVariable String str){
        for(int i=0;i<=str.length()/2;i++){

            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return "Not palindrome";
            }
        }
        return "Palindrome!";
    }
}
