package com.example.umc9th.domain.review.dto.req;

import jakarta.validation.constraints.*;

public class ReviewReqDTO {

    public record AddDTO(
            @NotBlank
            @Size(min = 1, max = 1000)
            String content,
            @NotNull
            @Min(value = 0, message = "별점은 0점 이상이어야 합니다.")
            @Max(value = 5, message = "별점은 5점 이하여야 합니다.")
            Float star,
            @NotNull
            Long memberId,
            @NotNull
            Long storeId
    ){}
}
