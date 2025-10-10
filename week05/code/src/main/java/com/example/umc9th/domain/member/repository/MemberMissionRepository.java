package com.example.umc9th.domain.member.repository;

import com.example.umc9th.domain.member.entity.mapping.MemberMission;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MemberMissionRepository extends JpaRepository<MemberMission, Long> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("DELETE FROM MemberMission mm WHERE mm.member.id = :memberId")
    void deleteAllByMemberIdInBatch(@Param("memberId") Long memberId);

    @Query(value = "SELECT mm FROM MemberMission mm " +
            "JOIN FETCH mm.mission m " +
            "JOIN FETCH m.store " +
            "WHERE mm.member.id = :memberId " +
            "ORDER BY m.createdAt DESC ",
            countQuery = "SELECT count(mm) FROM MemberMission mm WHERE mm.member.id = :memberId")
    Page<MemberMission> findMemberMissionsByMemberIdWithDetails(Long memberId, Pageable pageable);



}
