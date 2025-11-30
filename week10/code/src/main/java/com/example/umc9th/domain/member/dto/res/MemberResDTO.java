package com.example.umc9th.domain.member.dto.res;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

public class MemberResDTO {

    @Getter
    @Builder
    public static class Delete{
        private Long memeberId;

    }

    @Builder
    public record JoinDTO(
            Long memberId,
            LocalDateTime createAt
    ){}

    // 로그인
    @Builder
    public record LoginDTO(
            Long memberId,
            String accessToken,
            String refreshToken
    ){}

    @Builder
    public record ReissueDTO(
            String accessToken
    ){
        public static ReissueDTO of(String accessToken){
            return ReissueDTO.builder()
                    .accessToken(accessToken)
                    .build();
        }
    }

}
