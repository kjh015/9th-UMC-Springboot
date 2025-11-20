package com.example.umc9th.domain.review.controller;

import com.example.umc9th.domain.review.converter.ReviewConverter;
import com.example.umc9th.domain.review.dto.req.ReviewReqDTO;
import com.example.umc9th.domain.review.dto.res.ReviewResDTO;
import com.example.umc9th.domain.review.entity.Review;
import com.example.umc9th.domain.review.exception.code.ReviewSuccessCode;
import com.example.umc9th.domain.review.service.ReviewQueryService;
import com.example.umc9th.global.apiPayload.ApiResponse;
import com.example.umc9th.global.apiPayload.code.GeneralSuccessCode;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewQueryService reviewQueryService;

    @GetMapping("/reviews/search")  // 리뷰 검색
    public ApiResponse<List<ReviewResDTO.Search>> searchReview(@RequestParam String query, @RequestParam String type) {
        List<Review> result = reviewQueryService.searchReview(query, type);

        List<ReviewResDTO.Search> resultDTO = result.stream().map(ReviewConverter::toSearchDTO).toList();
        GeneralSuccessCode code = GeneralSuccessCode.OK;

        return ApiResponse.onSuccess(code, resultDTO);
    }

    @GetMapping("/reviews/members/{memberId}")  // 회원 리뷰 검색
    public ApiResponse<List<ReviewResDTO.Search>> memberReviews(@PathVariable String memberId, @RequestParam String query, @RequestParam String type) {
        List<Review> result = reviewQueryService.memberReviews(Long.parseLong(memberId), query, type);

        List<ReviewResDTO.Search> resultDTO = result.stream().map(ReviewConverter::toSearchDTO).toList();
        GeneralSuccessCode code = GeneralSuccessCode.OK;

        return ApiResponse.onSuccess(code, resultDTO);

    }

    // 리뷰 추가 API
    @PostMapping(
            value="/reviews",
            consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}

    )
    public ApiResponse<ReviewResDTO.AddDTO> addReview(
            @Parameter(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
            @RequestPart("request") @Valid ReviewReqDTO.AddDTO dto,
            @RequestPart("reviewPicture")MultipartFile reviewPicture
            ) {
        ReviewResDTO.AddDTO result = reviewQueryService.addReview(dto, reviewPicture);

        ReviewSuccessCode code = ReviewSuccessCode.OK;
        return ApiResponse.onSuccess(code, result);
    }
}
