package com.example.umc9th.domain.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -1769383136L;

    public static final QMember member = new QMember("member1");

    public final com.example.umc9th.global.entity.QBaseEntity _super = new com.example.umc9th.global.entity.QBaseEntity(this);

    public final EnumPath<com.example.umc9th.domain.member.enums.Address> address = createEnum("address", com.example.umc9th.domain.member.enums.Address.class);

    public final DatePath<java.time.LocalDate> birth = createDate("birth", java.time.LocalDate.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> deletedAt = createDateTime("deletedAt", java.time.LocalDateTime.class);

    public final StringPath detailAddress = createString("detailAddress");

    public final StringPath email = createString("email");

    public final EnumPath<com.example.umc9th.domain.member.enums.Gender> gender = createEnum("gender", com.example.umc9th.domain.member.enums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<com.example.umc9th.domain.member.entity.mapping.MemberFood, com.example.umc9th.domain.member.entity.mapping.QMemberFood> memberFoodList = this.<com.example.umc9th.domain.member.entity.mapping.MemberFood, com.example.umc9th.domain.member.entity.mapping.QMemberFood>createSet("memberFoodList", com.example.umc9th.domain.member.entity.mapping.MemberFood.class, com.example.umc9th.domain.member.entity.mapping.QMemberFood.class, PathInits.DIRECT2);

    public final SetPath<com.example.umc9th.domain.member.entity.mapping.MemberMission, com.example.umc9th.domain.member.entity.mapping.QMemberMission> memberMissionList = this.<com.example.umc9th.domain.member.entity.mapping.MemberMission, com.example.umc9th.domain.member.entity.mapping.QMemberMission>createSet("memberMissionList", com.example.umc9th.domain.member.entity.mapping.MemberMission.class, com.example.umc9th.domain.member.entity.mapping.QMemberMission.class, PathInits.DIRECT2);

    public final SetPath<com.example.umc9th.domain.review.entity.Review, com.example.umc9th.domain.review.entity.QReview> memberReviewList = this.<com.example.umc9th.domain.review.entity.Review, com.example.umc9th.domain.review.entity.QReview>createSet("memberReviewList", com.example.umc9th.domain.review.entity.Review.class, com.example.umc9th.domain.review.entity.QReview.class, PathInits.DIRECT2);

    public final SetPath<com.example.umc9th.domain.member.entity.mapping.MemberTerm, com.example.umc9th.domain.member.entity.mapping.QMemberTerm> memberTermList = this.<com.example.umc9th.domain.member.entity.mapping.MemberTerm, com.example.umc9th.domain.member.entity.mapping.QMemberTerm>createSet("memberTermList", com.example.umc9th.domain.member.entity.mapping.MemberTerm.class, com.example.umc9th.domain.member.entity.mapping.QMemberTerm.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

