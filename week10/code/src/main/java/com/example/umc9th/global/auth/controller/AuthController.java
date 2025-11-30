package com.example.umc9th.global.auth.controller;

import com.example.umc9th.domain.member.dto.res.MemberResDTO;
import com.example.umc9th.domain.member.exception.code.MemberSuccessCode;
import com.example.umc9th.domain.member.service.MemberService;
import com.example.umc9th.global.apiPayload.ApiResponse;
import com.example.umc9th.global.auth.dto.KakaoResDTO;
import com.example.umc9th.global.auth.service.KakaoService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final KakaoService kakaoService;
    private final MemberService memberService;


    @Operation(
            summary = "카카오 소셜 로그인 API",
            description = "https://kauth.kakao.com/oauth/authorize?client_id=fc96b5b695d36b6cd576b67c9fdf0085&redirect_uri=http://localhost:8080/api/auth/kakao/callback&response_type=code."
    )
    @GetMapping("/kakao/callback")
    public ApiResponse<MemberResDTO.LoginDTO> kakaoLogin(@RequestParam("code") String code){
        // 1. 인가 코드로 카카오 액세스 토큰 발급
        String accessToken = kakaoService.getAccessToken(code);

        // 2. 카카오 액세스 토큰으로 사용자 정보 조회
        KakaoResDTO.UserInfoDTO kakaoUserInfo = kakaoService.getUserInfo(accessToken);

        // 3. 우리 서비스 로그인/회원가입 후 AccessToken 발급
        return ApiResponse.onSuccess(MemberSuccessCode.FOUND, memberService.loginOrSignup(kakaoUserInfo));
    }
}
