package com.example.umc9th.domain.store.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStore is a Querydsl query type for Store
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStore extends EntityPathBase<Store> {

    private static final long serialVersionUID = 135584498L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStore store = new QStore("store");

    public final com.example.umc9th.global.entity.QBaseEntity _super = new com.example.umc9th.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath detailAddress = createString("detailAddress");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLocation location;

    public final NumberPath<Long> managerNumber = createNumber("managerNumber", Long.class);

    public final SetPath<com.example.umc9th.domain.mission.entity.Mission, com.example.umc9th.domain.mission.entity.QMission> missionList = this.<com.example.umc9th.domain.mission.entity.Mission, com.example.umc9th.domain.mission.entity.QMission>createSet("missionList", com.example.umc9th.domain.mission.entity.Mission.class, com.example.umc9th.domain.mission.entity.QMission.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final SetPath<com.example.umc9th.domain.review.entity.Review, com.example.umc9th.domain.review.entity.QReview> reviewList = this.<com.example.umc9th.domain.review.entity.Review, com.example.umc9th.domain.review.entity.QReview>createSet("reviewList", com.example.umc9th.domain.review.entity.Review.class, com.example.umc9th.domain.review.entity.QReview.class, PathInits.DIRECT2);

    public final StringPath sortKey = createString("sortKey");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QStore(String variable) {
        this(Store.class, forVariable(variable), INITS);
    }

    public QStore(Path<? extends Store> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStore(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStore(PathMetadata metadata, PathInits inits) {
        this(Store.class, metadata, inits);
    }

    public QStore(Class<? extends Store> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.location = inits.isInitialized("location") ? new QLocation(forProperty("location")) : null;
    }

}

