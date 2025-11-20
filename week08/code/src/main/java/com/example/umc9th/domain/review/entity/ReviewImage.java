package com.example.umc9th.domain.review.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ReviewImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 사용자가 업로드한 원래 파일명 (예: my_photo.jpg)
//    @Column(nullable = false)
//    private String originalFileName;

    // 서버/S3에 저장될 때 겹치지 않게 변환된 파일명 (예: UUID.jpg)
//    @Column(nullable = false)
//    private String storedFileName;

    // 이미지 접근 전체 URL (필요에 따라 저장하거나, storedFileName으로 조합해서 사용)
    @Column(nullable = false)
    private String imageUrl;

    // N:1 관계 설정 (여러 이미지가 하나의 리뷰에 속함)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_id")
    private Review review;

}
