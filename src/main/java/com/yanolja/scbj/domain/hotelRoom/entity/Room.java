package com.yanolja.scbj.domain.hotelRoom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.time.LocalTime;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Room {

    @Column(length = 50, nullable = false)
    @Comment("객실 이름")
    private String roomName;

    @Column(nullable = false)
    @Comment("체크인 시간")
    private LocalTime checkIn;

    @Column(nullable = false)
    @Comment("체크아웃 시간")
    private LocalTime checkOut;

    @Column(length = 30, nullable = false)
    @Comment("침대 구성")
    private String bedType;

    @Column(nullable = false)
    @Comment("기준 인원")
    private int standardPeople;

    @Column(nullable = false)
    @Comment("최대 인원")
    private int maxPeople;

    @OneToOne
    @JoinColumn(name = "room_theme_id", nullable = false)
    @Comment("객실 테마")
    private RoomTheme roomTheme;

    @Builder
    private Room(String roomName, LocalTime checkIn, LocalTime checkOut, String bedType,
        int standardPeople, int maxPeople, RoomTheme roomTheme) {
        this.roomName = roomName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.bedType = bedType;
        this.standardPeople = standardPeople;
        this.maxPeople = maxPeople;
        this.roomTheme = roomTheme;
    }
}
