package com.example.umc9th.domain.mission.repository;

import com.example.umc9th.domain.mission.entity.Mission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MissionRepository extends JpaRepository<Mission, Long> {

    //4-2. 홈화면 - 도전 가능 미션 목록
    @Query(value = "SELECT m FROM Mission m " +
            "JOIN FETCH m.store s " +
            "WHERE m.store.location.id = :locationId AND " +
            "NOT EXISTS (" +
            "  SELECT 1 FROM MemberMission mm " +
            "  WHERE mm.member.id = :memberId AND mm.mission = m" +
            ")",
            countQuery = "SELECT count(m) FROM Mission m " +    //countQuery 분리(페이징)
                    "WHERE m.store.location.id = :locationId AND " +
                    "NOT EXISTS (" +
                    "  SELECT 1 FROM MemberMission mm " +
                    "  WHERE mm.member.id = :memberId AND mm.mission = m" +
                    ")")
    Page<Mission> findAvailableMissions(Long locationId, Long memberId, Pageable pageable);


}
