![transparent](https://capsule-render.vercel.app/api?type=waving&fontColor=FFFFFF&text=%%호텔&height=230&fontAlignY=40&fontSize=60&desc=Team.숙취방지&descAlignY=65&descAlign=74&color=FE5E0D&)<br>
<img src="https://avatars.githubusercontent.com/u/154401745?s=200&v=4SCBJ-BE" width=100 alt=숙취방지> [퍼센트 호텔](https://percenthotel.web.app/)
>**무료 예약 취소 불가한 숙소의 양도/거래 플랫폼 "퍼센트 호텔"**

> 일시: 2023.12.06~2024.01.28 ~<br>
> 구성원: PM 5명 / UX/UI 1명 / Frontend 5명 / Backend 4명
## 👨‍👩‍👦‍👦 참여인원
|                                            Backend                                             |                                        Backend                                         |                                         Backend                                         |                                           Backend                                            |
|:----------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------------:|
|    <img src="https://avatars.githubusercontent.com/u/63856521?v=4" width=140px alt="양유림"/>     | <img src="https://avatars.githubusercontent.com/u/59725406?v=4" width=140px alt="심재철"> | <img src="https://avatars.githubusercontent.com/u/111270670?v=4" width=140px alt="김정훈"> |   <img src="https://avatars.githubusercontent.com/u/34360434?v=4" width=140px alt="권민우"/>    |
|                              [양유림](https://github.com/YurimYang)                               |                          [심재철](https://github.com/wocjf0513)                           |                          [김정훈](https://github.com/Aleexender)                           |                             [권민우](https://github.com/Kwonminwoo)                             |
 |                             상품 생성<br/>예약/구매 내역 조회<br/>결제<br/>크롤링                               |                              인프라<br/>CI&CD<br/>알림<br/>회원                               |                      상품 검색<br/>판매/구매 내역 조회<br/>메인 페이지<br/>거래 상세 조회                      |                         상품 상세 조회<br/>상품 삭제<br/> 결제<br/>결제 페이지 조회<br/>크롤링                          |
## :hotel: 개요
`취소·환불이 불가한 숙박 결제건에 대해 양도를 할 수 있는 웹·앱`
## :pencil2: 개발 배경
- 예약 취소에 대한 불만이 많음, 유저의 착각/실수도 있으나 천재지변, 개인적 사유로 인해 어쩔 수 없이 취소수수료가 발생하는 경우 유저의 불만 및 탈퇴로 이어짐 
- 예약 취소의 부정적 경험으로 인해 유저가 탈퇴하는 것을 막을 수 있는 방안으로 예약 취소 불가 상품을 해결할 수 있는 플랫폼 또는 기능 제공
- 공급자와 기존 구매자, 양도자를 모두 고려한 안전하고 신뢰도 높은 예약 취소 거래 기능 구축
- 예약 취소 수수료가 아닌 취소 예약건을 온전히 체크인 완료하면 매출 증대에 기여할 것으로 기대함


## :movie_camera: 시연 영상
[숙취방지 앱 시연 영상](https://github.com/wocjf0513/scbj-accommodation-transfer-system/assets/59725406/6bc59b58-a862-4729-b716-73cb367692ae)

## 💭 프로젝트 후기
[패스트캠퍼스X야놀자: 백엔드 개발 부트캠프 파이널 프로젝트](https://blog.naver.com/wocjf0513/223341119477)

## :alarm_clock: 프로젝트 기간
`2023-12-11 ~ 2024-01-29`

## 🔗 배포 링크

- BE: [백엔드 배포 서버](https://3.35.83.30.nip.io/)
- FE: [배포 서버](https://percenthotel.web.app/)


## 🥺 RestDocs
- [API 명세서](https://3.35.83.30.nip.io/docs/index.html)


## 🛠️ 기술 스택

Backend<br>
<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=SpringBoot&logoColor=white">
<img src="https://img.shields.io/badge/Spring Security-00E47C?style=for-the-badge&logo=SpringSecurity&logoColor=white">
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">

Database<br>
<img src="https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=Redis&logoColor=black">
<img src="https://img.shields.io/badge/MySQL-316192?style=for-the-badge&logo=mysql&logoColor=white">

Infra & ThirdParty</br>
<img src="https://img.shields.io/badge/AWS-FF9900?style=for-the-badge&logo=amazonaws&logoColor=white">
<img src="https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white">
<img src="https://img.shields.io/badge/Firebase-FFAA00?style=for-the-badge&logo=Firebase&logoColor=white">
<img src="https://img.shields.io/badge/Kakao Pay-FFCD00?style=for-the-badge&logo=KakaoTalk&logoColor=white">


## ERD
![(정리용) 숙취방지 최종 ERD - v1 (1)](https://github.com/SCBJ-7/SCBJ-BE/assets/63856521/8a6a60f0-333e-4569-b217-0b9c514d7389)


## ARCHITECTURE
![숙취방지 최종 ARCHITECTURE](https://github.com/SCBJ-7/SCBJ-BE/assets/63856521/74661494-beb8-4ae7-a7d5-d864b4ac64dc)

## 📖 Sprint별 회고
<details>
 <summary>1차 Sprint 회고</summary>
 
 ## Keep

- 월, 수, (금) 대면 회의가 개발 진행에 수월하다.
    - 격일로 모여서 스트레스가 덜 받는다.
- Discussion, Issue, Actions 등 github를 적극적으로 사용해서 좋다.

## Problem

1. 부족한 코드리뷰
2. Issue, PR 범위가 너무 크다.
3. Convention/코드 스타일 통일
4. 모르는 것을 직면했을 때 질문하기 어려웠다. 

## Try

1. 코드리뷰 룰 정의
    
    ```
    ### 📌 PR 진행 시 이러한 점들을 참고해 주세요
    * Reviewer 분들은 코드 리뷰 시 좋은 코드의 방향을 제시하되, 코드 수정을 강제하지 말아 주세요.
    * Reviewer 분들은 좋은 코드를 발견한 경우, 칭찬과 격려를 아끼지 말아 주세요.
    * Review는 특수한 케이스가 아니면 Reviewer로 지정된 시점 기준으로 3일 이내에 진행해 주세요.
    * Comment 작성 시 Prefix로 P1, P2, P3 를 적어 주시면 Assignee가 보다 명확하게 Comment에 대해 대응할 수 있어요
        * P1 : 꼭 반영해 주세요 (Request Changes) - 이슈가 발생하거나 취약점이 발견되는 케이스 등
        * P2 : 반영을 적극적으로 고려해 주시면 좋을 것 같아요 (Comment)
        * P3 : 이런 방법도 있을 것 같아요~ 등의 사소한 의견입니다 (Chore)
    
    ```
    
    1. 선칭찬, 후리뷰(+근거링크)
    2. Pn 룰 적용 ✅
        1. P1 : 꼭 반영해주세요 (Request Changes)
        2. P2 : 반영을 적극적으로 고려해주시면 좋을 것 같아요 (Comment)
        3. P3 : 이런 방법도 있을 것 같아요,사소한 의견 (Chore)
    3. 만약 리뷰할 내용이 없고, 잘 완성된 코드라고 생각시
        1. 맨 마지막 파일의 마지막 코드에 **“칭찬”** 남겨주기 ! 
    4. D-n 룰 적용 🚫
        
        → 하루 단위로 모두 체크를 해주고 있기에 추가하지 않기로 결정
        
    
    🔗 https://devocean.sk.com/blog/techBoardDetail.do?ID=165255
    
    🔗 https://techblog.woowahan.com/7152/
    
2. 서로 합의 하에 PR 범위를 쪼개자
    - Issue : 큰 개발 범위를 작성
        - 기획 변동으로 인한 개발 수정 : 새로운 ISSUE 화
        - 내 실수로 인한 수정 : 기존 ISSUE에 추가
    - PR : Issue를 쪼개서 올리기
        1. 비즈니스 로직
        2. 테스트 로직
        
        → 비즈니스 로직을 좀 더 쪼개려고 했으나, merge가 되지 않으면 개발하지 못할 수 있는 상황을 없애고자 일단 비즈니스 ↔ 테스트만 쪼갠다.
        
        최소한 테스트, 비즈니스 로직은 쪼개기
        
3. 코드 스타일 통일 | 컨벤션 통일
    - Record 사용
        - DTO 사용시 Setter 사용 금지, Getter 만 사용해왔음
        - 그러므로, 현재 사용하는 dto와 Record의 차이가 많이 없다고 판단
        - 또한, 오히려 Record는 자동으로 Getter를 생성해주고, equals, hashcode, toString을 자동으로 생성해준다는 점에서 훨씬 이점이 있다고 느껴졌습니다.
        - ✅ 결과 : DTO → Record 사용하자 -!!!
        
        🔗 https://s7won.tistory.com/2
        
    - Controller ResponseEntity + Message 통일
        
        ```
        @ResponseStatus(Ok)
        
        ResponseEntity.body(ResponseDTO.res
        (productService.postProduct(securityUtil.getCurrentMemberId(), 
        reservationId, productPostRequest),"성공적으로 비밀번호를 변경했습니다."))
        ```
        
        - Message : ~을/를/에 성공했습니다.
4. 질문은 최대한 Discussion을 활용하자
    1. 페어 프로그래머에게 많이 해주자
</details>
<details>
 <summary>2차 Sprint 회고</summary>

 ## Keep

- P1, P2, P3 체계가 좋습니다.
- 페어 프로그래밍 진행

## Problem

1. 늦은 pr 확인 속도
2. PR 올릴 때 포맷팅 확인하기 
    1. Ctrl  + alt + L
    2. Ctrl + alt + O 

## Try

1. PR 확인, Discussion 확인 시간대 확정
    1. 월, 수, (금) : 11시 10분, 18시
    2. 화, 목 , (금) : 10 시 15분, 18시 
    3. 토~일 : 금요일 22시까지 PR 체크 모두 완료시 토,일은 선택
        
        만약 안될 경우, 토~일 중 PR 확인 언급 
        
2. Discussion 은 언급이 필요한 상대에게 언급해주기 
3. 로직 & 테스트를 같이 올려야 하는 이유
    1. 테스트 작성시, 로직 코드 변경 ISSUE
    2. 로직 변경시, 로직 올리고 & 테스트 올리고 하면서 이전 PR들의 테스트가 안될 수 있음
    
    ⇒ 로직 & 테스트 같이 올리기 ⚠️
    
4. PR 올릴 때는 주요로 봐야하는 파일 명시해주기 !!! 
5. 카톡 [공지] → 체크 이모지 ✅
6. application.prod 파일 만들기 → 재철님 
7. response type에 대해서 fe와 합의하기 → 12:30 데일리스크럼에서 회의 시간 잡자고 언급하기
</details>
<details>
 <summary>3차 Sprint 회고</summary>

 ## Keep

- 정한 시간에 pr 확인하는 것 좋습니다.
- 다양한 시도하는 것 좋았다.
- pr 리뷰마다 p1, p2, p3 단계 지정하기

## Problem

1. 4주차 Sprint 부터 hotfix를 어떻게 할지

## Try

1. 브랜치 명에 Hotfix 도입
    1. Hotfix는 pr시 1명만 체크해도 가능하게 진행 (4차 스프린트는 모두 pr 1명만 진행)
    2. Hotfix pr 올리고 카톡에 언급하기 (pr링크를 같이 올리기)
</details>

## :100: 숙취 방지의 자랑
![image](https://github.com/wocjf0513/scbj-accommodation-transfer-system/assets/59725406/89899760-ae93-4b62-aa88-1273a7068e6c)
> 숙취 방지는 사용저 경험을 고려해서 위와 같은 서비스를 제공합니다!

### :alarm_clock: FCM 선택 이유
![image](https://github.com/wocjf0513/scbj-accommodation-transfer-system/assets/59725406/476dbc2d-bda0-4ff0-bc69-310418a949cf)
> 숙취 방지 푸쉬 알림 특징
1. 어느 정도의 지연 시간이 허용됨.
2. 서버 -> 클라이언트 (단방향 통신)

![image](https://github.com/wocjf0513/scbj-accommodation-transfer-system/assets/59725406/0545181d-cd29-48de-96e5-b1012d5e5ac6)
> 단방향 통신의 대표적인 방법인 FCM과 SSE를 비교
- SSE보다는 FCM이 호환성이 좋기에 확장성에서 뛰어남.
- 네트워크 연결된 상태를 유지하지 않아 서버 리소스를 효율적이게 사용.


## :mountain: 추후 고도화 사항
- 심재철
  - 멤버 도메인 (Spring Security + JWT)
  
  ![img.png](src%2Fmain%2Fresources%2Fstatic%2Fimg%2Fimg.png)
  ```markdown
  이번 프로젝트에서 사용되는
  Filter가 여러 가지가 될 수 있음에도 (추후 개발을 하면서)
  
  위와 같은 구조를 두지 않고
  JWT Filter를 하나만 등록해 사용했다.
  
  그러다보니 Filter가 생길 수록 관리하기 힘들어졌고
  확장성면에서 좋지 않은 구조로 짰다.
  
  프로젝트를 끝내고, 24. 02. 10일부터 다시하기로 했으니
  위와 같은 구조로서 확장성을 확보하고자 한다.
  ```
  - 알람 도메인
  ```markdown
  PM측의 부탁으로
  알림에 대한 추가 구현 사항이 생겼다.
  
  결제된 상품에 대한 체크인 임박 푸쉬 알림을 보내는 것이었다.
  이를 위해 매 분 스케줄링을 하며, 체크인 임박이 된 상품을 조회했다.
  그러다보니, 서버 리소스를 많이 잡게 됐고,
  
  알림 도메인만 따로 구성한 서버를 둬, MSA구조를 두고자 한다.
  또한, SpringBatch를 통해 효율적으로 일괄 처리가 되게끔 한다. 
  ```
### :thinking: [숙취방지가 있기위한 Discussions](https://github.com/SCBJ-7/SCBJ-BE/discussions)

## ⌨️ 설정
- 자바 버전: 17

- 스프링 버전: 6.0

- 스프링 부트 버전: 3.2.1


<details><summary>✨의존성</summary>

- Spring Boot Starter

  - `org.springframework.boot:spring-boot-starter-data-jpa`
  - `org.springframework.boot:spring-boot-starter-validation`
  - `org.springframework.boot:spring-boot-starter-web`
  - `org.springframework.boot:spring-boot-starter-test`
  - `org.springframework.boot:spring-boot-starter-mail`

- DB
  - `com.mysql:mysql-connector-j`
  - `com.h2database:h2`

- QueryDSL
  - `com.querydsl:querydsl-jpa:5.0.0:jakarta`
  - `com.querydsl:querydsl-apt:5.0.0:jakarta`
  - `jakarta.annotation:jakarta.annotation-api`
  - `jakarta.persistence:jakarta.persistence-api`

- JWT
  - `io.jsonwebtoken', name: 'jjwt-api', version: '0.11.5`
  - `io.jsonwebtoken', name: 'jjwt-impl', version: '0.11.5`
  - `io.jsonwebtoken', name: 'jjwt-jackson', version: '0.11.5`

- Crawling
  - `org.seleniumhq.selenium:selenium-java`
  - `org.seleniumhq.selenium:selenium-api`
  - `org.seleniumhq.selenium:selenium-chrome-driver`

- FCM
  - `com.google.firebase:firebase-admin:9.2.0`

- Thymeleaf
  - `org.springframework.boot:spring-boot-starter-thymeleaf`

- Redisson
  - `org.redisson:redisson-spring-boot-starter:3.21.1`

- Deserialize
  - `com.fasterxml.jackson.datatype:jackson-datatype-jsr310`
  - `com.fasterxml.jackson.core:jackson-databind`

- Scheduling
  - `org.quartz-scheduler:quartz:2.3.0`
</details>



## 📚 API Docs 
   <details>
    <summary>회원 API</summary>
    <div id="content">
<div class="sect1">
<h2 id="_member_rest_api_docs">Member REST API Docs</h2>
<div class="sectionbody">

</div>
</div>
<div class="sect1">
<h2 id="sign-up">회원 가입</h2>
<div class="sectionbody">
<div class="paragraph">
<p>회원 가입하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">POST /v1/members/signup HTTP/1.1
Content-Type: application/json;charset=UTF-8
Content-Length: 163
Host: localhost:8080

{
  "email" : "test@gmail.com",
  "password" : "test1234@",
  "name" : "test",
  "phone" : "010-1234-5678",
  "privacyPolicy" : null,
  "termOfUse" : null
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.id</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 식별자</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.email</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이메일</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.name</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.phone</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 핸드폰 번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.accountNumber</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 계좌 번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.bank</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 계좌</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.linkedToYanolja</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">야놀자 연동 여부</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 259

{
  "message" : "회원가입에 성공했습니다.",
  "data" : {
    "id" : 1,
    "email" : "test@gmail.com",
    "name" : "test",
    "phone" : "010-1234-5678",
    "accountNumber" : null,
    "bank" : null,
    "linkedToYanolja" : false
  }
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.id</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 식별자</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.email</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이메일</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.name</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.phone</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 핸드폰 번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.accountNumber</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 계좌 번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.bank</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 계좌</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.linkedToYanolja</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">야놀자 연동 여부</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="sign-in">로그인</h2>
<div class="sectionbody">
<div class="paragraph">
<p>로그인하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_2">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">POST /v1/members/signin HTTP/1.1
Content-Type: application/json;charset=UTF-8
Content-Length: 85
Host: localhost:8080

{
  "email" : "test@gmail.com",
  "password" : "test1234@",
  "fcmToken" : null
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>email</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이메일</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>password</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 비밀번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>fcmToken</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 기기 식별자 토큰</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_2">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 390

{
  "message" : "로그인에 성공했습니다.",
  "data" : {
    "memberResponse" : {
      "id" : 1,
      "email" : "test@gmail.com",
      "name" : "test",
      "phone" : "010-1234-5678",
      "accountNumber" : null,
      "bank" : null,
      "linkedToYanolja" : false
    },
    "tokenResponse" : {
      "accessToken" : "",
      "refreshToken" : ""
    }
  }
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.memberResponse.id</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 식별자</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.memberResponse.email</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이메일</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.memberResponse.name</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.memberResponse.phone</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 핸드폰 번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.memberResponse.accountNumber</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 계좌 번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.memberResponse.bank</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 계좌</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.memberResponse.linkedToYanolja</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">야놀자 연동 여부</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.tokenResponse.accessToken</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">액세스 토큰</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.tokenResponse.refreshToken</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">리프레쉬 토큰</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="logout">로그아웃</h2>
<div class="sectionbody">
<div class="paragraph">
<p>로그아웃 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_3">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">POST /v1/members/logout HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization: ACCESS_TOKEN
Content-Length: 64
Host: localhost:8080

{
  "accessToken" : "Bearer ",
  "refreshToken" : "Refresh"
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Name</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Authorization</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">JWT 액세스 토큰</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_3">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 75

{
  "message" : "로그아웃에 성공했습니다.",
  "data" : null
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="get-current-member">회원 정보 조회</h2>
<div class="sectionbody">
<div class="paragraph">
<p>사용자 본인의 회원 정보를 조회하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_4">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">GET /v1/members HTTP/1.1
Authorization: ACCESS_TOKEN
Host: localhost:8080</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Name</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Authorization</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">JWT 액세스 토큰</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_4">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 266

{
  "message" : "회원정보 조회에 성공했습니다.",
  "data" : {
    "id" : 1,
    "email" : "test@gmail.com",
    "name" : "test",
    "phone" : "010-1234-5678",
    "accountNumber" : null,
    "bank" : null,
    "linkedToYanolja" : false
  }
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.id</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 식별자</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.email</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이메일</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.name</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.phone</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 핸드폰 번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.accountNumber</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 계좌 번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.bank</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 계좌</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.linkedToYanolja</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">야놀자 연동 여부</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="link-up-yanolja">야놀자 계정 연동</h2>
<div class="sectionbody">
<div class="paragraph">
<p>야놀자 계정을 연동하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_5">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">POST /v1/members/yanolja HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization: ACCESS_TOKEN
Content-Length: 34
Host: localhost:8080

{
  "email" : "test@gmail.com"
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Name</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Authorization</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">JWT 액세스 토큰</p></td>
</tr>
</tbody>
</table>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>email</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이메일</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_5">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 86

{
  "message" : "야놀자 계정 연동에 성공했습니다.",
  "data" : null
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="update-password">비밀번호 업데이트</h2>
<div class="sectionbody">
<div class="paragraph">
<p>비밀번호를 업데이트하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_6">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">PATCH /v1/members/password HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization: ACCESS_TOKEN
Content-Length: 51
Host: localhost:8080

{
  "email" : null,
  "password" : "test1234@"
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Name</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Authorization</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">JWT 액세스 토큰</p></td>
</tr>
</tbody>
</table>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>password</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 비밀번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>email</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이메일</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_6">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 82

{
  "message" : "비밀번호 변경에 성공했습니다.",
  "data" : null
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="update-account">계좌번호 등록/ 수정</h2>
<div class="sectionbody">
<div class="paragraph">
<p>계좌번호를 등록/ 수정하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_7">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">PATCH /v1/members/account HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization: ACCESS_TOKEN
Content-Length: 60
Host: localhost:8080

{
  "accountNumber" : "1233456783",
  "bank" : "농협"
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Name</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Authorization</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">JWT 액세스 토큰</p></td>
</tr>
</tbody>
</table>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>accountNumber</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 계좌 번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>bank</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 계좌</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_7">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 89

{
  "message" : "계좌번호 등록/수정에 성공했습니다.",
  "data" : null
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="update-phone">핸드폰 번호 업데이트</h2>
<div class="sectionbody">
<div class="paragraph">
<p>핸드폰 번호를 업데이트하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_8">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">PATCH /v1/members/phone HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization: ACCESS_TOKEN
Content-Length: 33
Host: localhost:8080

{
  "phone" : "010-1234-5678"
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Name</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Authorization</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">JWT 액세스 토큰</p></td>
</tr>
</tbody>
</table>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>phone</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 핸드폰 번호</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_8">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 86

{
  "message" : "핸드폰 번호 변경에 성공했습니다.",
  "data" : null
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="update-name">이름 업데이트</h2>
<div class="sectionbody">
<div class="paragraph">
<p>이름을 업데이트하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_9">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">PATCH /v1/members/name HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization: ACCESS_TOKEN
Content-Length: 23
Host: localhost:8080

{
  "name" : "test"
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Name</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Authorization</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">JWT 액세스 토큰</p></td>
</tr>
</tbody>
</table>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>name</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 이름</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_9">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 76

{
  "message" : "이름 변경에 성공했습니다.",
  "data" : null
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="refresh-access-token">액세스 토큰 재발급</h2>
<div class="sectionbody">
<div class="paragraph">
<p>액세스 토큰을 재발급하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_10">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">POST /v1/token/refresh HTTP/1.1
Content-Type: application/json;charset=UTF-8
Content-Length: 64
Host: localhost:8080

{
  "accessToken" : "Bearer ",
  "refreshToken" : "Refresh"
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>accessToken</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">만료된 액세스 토큰</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>refreshToken</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">리프레쉬 토큰</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_10">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 145

{
  "message" : "토큰 재발급에 성공했습니다.",
  "data" : {
    "accessToken" : "Bearer ",
    "refreshToken" : "Refresh"
  }
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.accessToken</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">재발급된 액세스 토큰</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.refreshToken</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">리프레쉬 토큰</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
</div>
   </details>
   <details>
    <summary>상품 API</summary>
    <div id="content">
<div class="sect1">
<h2 id="_product_rest_api_docs">Product REST API DOCS</h2>
<div class="sectionbody">

</div>
</div>
<div class="sect1">
<h2 id="Product-Post">상품(양도글) 작성</h2>
<div class="sectionbody">
<div class="paragraph">
<p>상품(양도글)을 작성하는 API입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">POST /v1/products/1 HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization: ACCESS_TOKEN
Content-Length: 316
Host: localhost:8080

{
  "firstPrice" : 250000,
  "secondPrice" : 200000,
  "bank" : "신한은행",
  "accountNumber" : "110-499-519198",
  "secondGrantPeriod" : 5,
  "isRegistered" : true,
  "standardTimeSellingPolicy" : true,
  "totalAmountPolicy" : true,
  "sellingModificationPolicy" : true,
  "productAgreement" : true
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<caption class="title">Table 1. /v1/products/{reservation_id}</caption>
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Parameter</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>reservation_id</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">예약내역 식별자</p></td>
</tr>
</tbody>
</table>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>firstPrice</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">1차 양도 가격</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>secondPrice</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">2차 양도 가격</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>bank</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">정산 은행</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>accountNumber</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">정산 계좌</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>secondGrantPeriod</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">2차 양도 시점</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>isRegistered</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">2차 양도 가격 설정 여부</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>standardTimeSellingPolicy</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">체크인 기준 판매 자동 완료 방침</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>totalAmountPolicy</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">정산 총액 확인 방침</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>sellingModificationPolicy</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">판매가 수정 불가 방침</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>productAgreement</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">판매 진행 동의 방침</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 201 Created
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 102

{
  "message" : "양도글 작성을 성공했습니다.",
  "data" : {
    "productId" : 1
  }
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.productId</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">상품 식별자</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="Get-detail-produt">상품 상세 조회</h2>
<div class="sectionbody">
<div class="paragraph">
<p>상품 상세 조회 API입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_2">HttpRequest</h3>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Name</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Authorization</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">JWT 액세스 토큰</p></td>
</tr>
</tbody>
</table>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">GET /v1/products/1 HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization:
Host: localhost:8080</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<caption class="title">Table 2. /v1/products/{productId}</caption>
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Parameter</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>productId</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">상품 식별자</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_2">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 841

{
  "message" : "상품 상세 조회에 성공했습니다.",
  "data" : {
    "hotelName" : "호텔인 나인 강남",
    "hotelImageUrlList" : [ "https://yaimg.yanolja.com/v5/2023/03/23/15/1280/641c76db5ab761.18136153.jpg" ],
    "roomName" : "스탠다드 더블",
    "checkIn" : "2024-01-29T11:50:01.2054366",
    "checkOut" : "2024-01-29T11:50:01.2054366",
    "originalPrice" : 200000,
    "sellingPrice" : 100000,
    "standardPeople" : 2,
    "maxPeople" : 4,
    "bedType" : "킹",
    "roomTheme" : {
      "parkingZone" : true,
      "breakfast" : false,
      "pool" : true,
      "oceanView" : false
    },
    "hotelAddress" : "서울특별시 강남구 테헤란로 99길 9",
    "hotelInfoUrl" : "https://place-site.yanolja.com/places/3001615",
    "saleStatus" : true,
    "isSeller" : false
  }
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.hotelName</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">호텔 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.hotelImageUrlList[]</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Array</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">호텔 사진 리스트</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.roomName</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">객실 명</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.checkIn</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">체크인</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.checkOut</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">체크아웃</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.originalPrice</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">원가</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.sellingPrice</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">판매가</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.standardPeople</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">기준 인원</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.maxPeople</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">최대 인원</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.bedType</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">침대 타입</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.roomTheme</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">객실 테마</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.roomTheme.parkingZone</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">주차 가능</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.roomTheme.breakfast</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">조식 제공</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.roomTheme.pool</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">수영장</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.roomTheme.oceanView</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">오션 뷰</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.hotelAddress</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">호텔 주소</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.hotelInfoUrl</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">호텔 상세 정보 Url</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.saleStatus</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">판매 상태</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.isSeller</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">판매자 여부</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="delete-produt">상품 삭제</h2>
<div class="sectionbody">
<div class="paragraph">
<p>상품 삭제 API입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_3">HttpRequest</h3>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Name</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Authorization</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">JWT 액세스 토큰</p></td>
</tr>
</tbody>
</table>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">DELETE /v1/products/1 HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization:
Host: localhost:8080</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<caption class="title">Table 3. /v1/products/{productId}</caption>
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Parameter</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>productId</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">상품 식별자</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_3">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 204 No Content
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 76

{
  "message" : "상품 삭제에 성공했습니다.",
  "data" : null
}</code></pre>
</div>
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="main-page-product">메인 페이지 API 문서화</h2>
<div class="sectionbody">
<div class="paragraph">
<p>메인 페이지에 표시될 상품들을 조회하는 API입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_4">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">GET /v1/products/main?size=10&amp;cityNames=%EC%84%9C%EC%9A%B8&amp;cityNames=%EA%B0%95%EC%9B%90&amp;cityNames=%EB%B6%80%EC%82%B0&amp;cityNames=%EC%A0%9C%EC%A3%BC&amp;cityNames=%EA%B2%BD%EC%83%81&amp;cityNames=%EC%A0%84%EB%9D%BC&amp;page=1 HTTP/1.1
Content-Type: application/json;charset=UTF-8
Host: localhost:8080</code></pre>
</div>
</div>
<div class="paragraph">
<p>Unresolved directive in product-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/product-rest-controller-docs-test/main-page-product/request-parameters.adoc[]</p>
</div>
</div>
<div class="sect2">
<h3 id="_httpresponse_4">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 3491

{
  "message" : "조회에 성공하였습니다",
  "data" : {
    "seoul" : [ {
      "id" : 1,
      "city" : "서울",
      "imageUrl" : "image_url_seoul.jpg",
      "hotelName" : "서울 호텔",
      "roomType" : "더블",
      "originalPrice" : 200000,
      "salePrice" : 180000,
      "salePercentage" : 10.0,
      "checkInDate" : "2024-01-29T11:50:00.8883298",
      "checkOutDate" : "2024-01-30T11:50:00.8883298"
    } ],
    "gangwon" : [ {
      "id" : 1,
      "city" : "서울",
      "imageUrl" : "image_url_seoul.jpg",
      "hotelName" : "서울 호텔",
      "roomType" : "더블",
      "originalPrice" : 200000,
      "salePrice" : 180000,
      "salePercentage" : 10.0,
      "checkInDate" : "2024-01-29T11:50:00.8883298",
      "checkOutDate" : "2024-01-30T11:50:00.8883298"
    } ],
    "busan" : [ {
      "id" : 1,
      "city" : "서울",
      "imageUrl" : "image_url_seoul.jpg",
      "hotelName" : "서울 호텔",
      "roomType" : "더블",
      "originalPrice" : 200000,
      "salePrice" : 180000,
      "salePercentage" : 10.0,
      "checkInDate" : "2024-01-29T11:50:00.8883298",
      "checkOutDate" : "2024-01-30T11:50:00.8883298"
    } ],
    "jeju" : [ {
      "id" : 1,
      "city" : "서울",
      "imageUrl" : "image_url_seoul.jpg",
      "hotelName" : "서울 호텔",
      "roomType" : "더블",
      "originalPrice" : 200000,
      "salePrice" : 180000,
      "salePercentage" : 10.0,
      "checkInDate" : "2024-01-29T11:50:00.8883298",
      "checkOutDate" : "2024-01-30T11:50:00.8883298"
    } ],
    "gyeongsang" : [ {
      "id" : 1,
      "city" : "서울",
      "imageUrl" : "image_url_seoul.jpg",
      "hotelName" : "서울 호텔",
      "roomType" : "더블",
      "originalPrice" : 200000,
      "salePrice" : 180000,
      "salePercentage" : 10.0,
      "checkInDate" : "2024-01-29T11:50:00.8883298",
      "checkOutDate" : "2024-01-30T11:50:00.8883298"
    } ],
    "jeolla" : [ {
      "id" : 1,
      "city" : "서울",
      "imageUrl" : "image_url_seoul.jpg",
      "hotelName" : "서울 호텔",
      "roomType" : "더블",
      "originalPrice" : 200000,
      "salePrice" : 180000,
      "salePercentage" : 10.0,
      "checkInDate" : "2024-01-29T11:50:00.8883298",
      "checkOutDate" : "2024-01-30T11:50:00.8883298"
    } ],
    "weekend" : {
      "content" : [ {
        "id" : 2,
        "hotelName" : "주말 호텔",
        "roomType" : "스위트",
        "imageUrl" : "image_url_weekend.jpg",
        "originalPrice" : 300000,
        "salePrice" : 270000,
        "salePercentage" : 10.0,
        "checkInDate" : "2024-02-03",
        "checkOutDate" : "2024-02-04",
        "isBrunchIncluded" : true,
        "isPoolIncluded" : false,
        "isOceanViewIncluded" : true,
        "roomThemeCount" : 3
      } ],
      "pageable" : {
        "pageNumber" : 1,
        "pageSize" : 10,
        "sort" : {
          "empty" : true,
          "sorted" : false,
          "unsorted" : true
        },
        "offset" : 10,
        "paged" : true,
        "unpaged" : false
      },
      "totalElements" : 11,
      "totalPages" : 2,
      "last" : true,
      "size" : 10,
      "number" : 1,
      "sort" : {
        "empty" : true,
        "sorted" : false,
        "unsorted" : true
      },
      "first" : false,
      "numberOfElements" : 1,
      "empty" : false
    }
  }
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">메인 페이지 상품 데이터</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.seoul</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Array</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">서울 지역 상품 목록</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.gangwon</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Array</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">강원 지역 상품 목록</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.busan</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Array</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">부산 지역 상품 목록</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.weekend</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">주말 특가 상품 목록</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="search-product">검색 조회 API 문서화</h2>
<div class="sectionbody">
<div class="paragraph">
<p>사용자가 요청한 조건에 맞는 상품들을 검색하여 반환하는 API입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_5">HttpRequest</h3>
<div class="paragraph">
<p>include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/product-rest-controller-docs-test/</p>
</div>
<div class="paragraph">
<p>Unresolved directive in product-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/product-rest-controller-docs-test/search-product/http-request.adoc[]
Unresolved directive in product-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/product-rest-controller-docs-test/search-product/request-fields.adoc[]
Unresolved directive in product-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/product-rest-controller-docs-test/search-product/request-parameters.adoc[]</p>
</div>
</div>
<div class="sect2">
<h3 id="_httpresponse_5">HttpResponse</h3>
<div class="paragraph">
<p>Unresolved directive in product-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/product-rest-controller-docs-test/search-product/http-response.adoc[]
Unresolved directive in product-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/product-rest-controller-docs-test/search-product/response-fields.adoc[]</p>
</div>
</div>
</div>
</div>
</div>
   </details>
   <details>
    <summary>예약 내역 API</summary>
    <div id="content">
<div class="sect1">
<h2 id="_reservation_rest_api_docs">Reservation REST API Docs</h2>
<div class="sectionbody">

</div>
</div>
<div class="sect1">
<h2 id="Reservation-Get">야놀자 예약 내역 조회</h2>
<div class="sectionbody">
<div class="paragraph">
<p>야놀자 예약 내역을 조회하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">GET /v1/reservations HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization: ACCESS_TOKEN
Host: localhost:8080</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="_httpresponse">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 1364

{
  "message" : "예약 내역 조회에 성공했습니다.",
  "data" : [ {
    "reservationId" : 31,
    "hotelName" : "SR 호텔 서울 마곡",
    "imageUrl" : "https://yaimg.yanolja.com/v5/2022/09/20/13/1280/6329c608da8fb4.46198346.jpg",
    "roomName" : "체크인 시 배정",
    "startDate" : "2024-02-06T11:00:00",
    "endDate" : "2024-02-08T22:00:00",
    "refundPrice" : 216000,
    "purchasePrice" : 216000,
    "remainingDays" : 10,
    "remainingTimes" : 260
  }, {
    "reservationId" : 275,
    "hotelName" : "UH FLAT the 송도",
    "imageUrl" : "https://yaimg.yanolja.com/v5/2023/02/15/16/1280/63ed0f80af0cb7.13475065.png",
    "roomName" : "1C-1 TYPE 또는 1C TYPE 랜덤배정",
    "startDate" : "2024-02-19T18:00:00",
    "endDate" : "2024-02-21T11:00:00",
    "refundPrice" : 368000,
    "purchasePrice" : 368000,
    "remainingDays" : 24,
    "remainingTimes" : 279
  }, {
    "reservationId" : 279,
    "hotelName" : "오크우드 프리미어 인천",
    "imageUrl" : "https://yaimg.yanolja.com/v5/2023/04/13/08/1280/6437c13b5d8c65.25779609.png",
    "roomName" : "스튜디오 슈페리어 룸",
    "startDate" : "2024-02-07T15:00:00",
    "endDate" : "2024-02-09T11:00:00",
    "refundPrice" : 279000,
    "purchasePrice" : 279000,
    "remainingDays" : 12,
    "remainingTimes" : 288
  } ]
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Array</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].reservationId</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">예약 식별자</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].hotelName</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">호텔 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].imageUrl</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">이미지 url</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].roomName</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">객실 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].startDate</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">시작일</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].endDate</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">종료일</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].refundPrice</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">환불가</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].purchasePrice</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">구매가</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].remainingDays</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">남은 날짜</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].remainingTimes</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">남은 시간</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
</div>
   </details>
   <details>
    <summary>결제 API</summary>
    <div id="content">
<div class="sect1">
<h2 id="_payment_rest_api_docs">Payment REST API Docs</h2>
<div class="sectionbody">

</div>
</div>
<div class="sect1">
<h2 id="prepare-payment">결제 요청</h2>
<div class="sectionbody">
<div class="paragraph">
<p>결제를 요청하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">POST /v1/products/1/payments?paymentType=kakaoPaymentService HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization: ACCESS_TOKEN
Content-Length: 260
Host: localhost:8080

{
  "isAgeOver14" : true,
  "customerName" : "김양도",
  "customerEmail" : "email@naver.com",
  "customerPhoneNumber" : "010-1234-1234",
  "useAgree" : true,
  "cancelAndRefund" : true,
  "collectPersonalInfo" : true,
  "thirdPartySharing" : true
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<caption class="title">Table 1. /v1/products/{product_id}/payments</caption>
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Parameter</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>product_id</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">상품 식별자</p></td>
</tr>
</tbody>
</table>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Parameter</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>paymentType</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">결제 타입</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 143

{
  "message" : "결제에 요청에 성공했습니다.",
  "data" : {
    "url" : "https://percenthotel.web.app/payment/66/cancel"
  }
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.url</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">카카오페이 결제 url</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="Payment-Success">결제 성공</h2>
<div class="sectionbody">
<div class="paragraph">
<p>결제를 성공하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_2">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">GET /v1/products/pay-success?memberId=1&amp;paymentType=kakaoPaymentService&amp;pg_token=pg_token1234567890 HTTP/1.1
Content-Type: application/json;charset=UTF-8
Host: localhost:8080</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="_httpresponse_2">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 69

{
  "message" : "결제에 성공했습니다.",
  "data" : null
}</code></pre>
</div>
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="Payment-Fail">결제 실패</h2>
<div class="sectionbody">
<div class="paragraph">
<p>결제를 실패하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_3">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">GET /v1/products/pay-cancel?memberId=1&amp;paymentType=kakaoPaymentService HTTP/1.1
Content-Type: application/json;charset=UTF-8
Host: localhost:8080</code></pre>
</div>
</div>
</div>
<div class="sect2">
<h3 id="_httpresponse_3">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 69

{
  "message" : "결제에 실패했습니다.",
  "data" : null
}</code></pre>
</div>
</div>
</div>
</div>
</div>
</div>
   </details>
   <details>
    <summary>구매내역 API</summary>
    <div id="content">
<div class="sect1">
<h2 id="_paymenthistory_rest_api_docs">PaymentHistory REST API Docs</h2>
<div class="sectionbody">

</div>
</div>
<div class="sect1">
<h2 id="PaymentHistory-Specific-get">구매내역 상세 조회</h2>
<div class="sectionbody">
<div class="paragraph">
<p>구매내역을 상세 조회하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">GET /v1/members/purchased-history/1 HTTP/1.1
Content-Type: application/json;charset=UTF-8
Authorization: ACCESS_TOKEN
Host: localhost:8080</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<caption class="title">Table 1. /v1/members/purchased-history/{paymentHistory_id}</caption>
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Parameter</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>paymentHistory_id</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">구매내역 식별자</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 687

{
  "message" : "구매 내역 상세 조회를 성공했습니다.",
  "data" : {
    "hotelName" : "SR 호텔 서울 마곡",
    "roomName" : "체크인 시 배정",
    "standardPeople" : 2,
    "maxPeople" : 4,
    "checkIn" : "24.02.06 (일) 15:00",
    "checkOut" : "24.02.08 (월) 11:00",
    "customerName" : "김호텔",
    "customerPhoneNumber" : "010-1234-5678",
    "paymentHistoryId" : 1,
    "paymentType" : "카카오페이",
    "originalPrice" : 216000,
    "price" : 180000,
    "remainingDays" : 10,
    "paymentHistoryDate" : "24.01.26 (금)",
    "hotelImage" : "https://yaimg.yanolja.com/v5/2022/09/20/13/1280/6329c608da8fb4.46198346.jpg"
  }
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.hotelName</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">호텔 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.roomName</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">객실 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.standardPeople</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">기준 인원</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.maxPeople</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">최대 인원</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.checkIn</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">체크인</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.checkOut</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">체크아웃</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.customerName</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">이용자 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.customerPhoneNumber</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">이용자 번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.paymentHistoryId</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">예약 번호</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.paymentType</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">결제 수단</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.originalPrice</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">정가</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.price</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">구매가</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.remainingDays</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">남은 날짜</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.paymentHistoryDate</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">남은 시간</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.hotelImage</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">이미지</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="find-payment-page">결제 페이지 조회</h2>
<div class="sectionbody">
<div class="paragraph">
<p>결제 페이지를 조회하는 API입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_2">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">GET /v1/products/1/payments HTTP/1.1
Authorization: ACCESS_TOKEN
Host: localhost:8080</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<caption class="title">Table 2. /v1/products/{product_id}/payments</caption>
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Parameter</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>product_id</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">상품 식별자</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_2">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 488

{
  "message" : "결제 페이지 조회에 성공했습니다.",
  "data" : {
    "hotelImage" : "https://yaimg.yanolja.com/v5/2023/03/23/15/1280/641c76db5ab761.18136153.jpg",
    "hotelName" : "양도 호텔",
    "roomName" : "호텔 인 나인 강남",
    "standardPeople" : 2,
    "maxPeople" : 4,
    "checkInDateTime" : "2024-01-29T11:49:47.8468055",
    "checkOutDateTime" : "2024-01-30T11:49:47.8468055",
    "originalPrice" : 200000,
    "salePrice" : 150000
  }
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Object</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 데이터</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.hotelImage</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">호텔 이미지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.hotelName</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">호텔 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.roomName</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">객실 이름</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.standardPeople</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">기준 인원</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.maxPeople</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">최대 인원</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.checkInDateTime</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">체크 인</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.checkOutDateTime</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">체크 아웃</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.originalPrice</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">원가</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.salePrice</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">판매가</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="_구매_내역_목록_조회">구매 내역 목록 조회</h2>
<div class="sectionbody">
<div class="paragraph">
<p>사용자의 구매 내역 목록을 조회하는 API입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_3">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">GET /v1/members/purchased-history?page=0&amp;pageSize=10 HTTP/1.1
Authorization: ACCESS_TOKEN
Host: localhost:8080</code></pre>
</div>
</div>
<div class="paragraph">
<p>Unresolved directive in paymentHistory-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/payment-history-rest-controller-docs-test/get-purchased-history/path-parameters.adoc[]</p>
</div>
</div>
<div class="sect2">
<h3 id="_httpresponse_3">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 661

{
  "message" : "조회에 성공하였습니다.",
  "data" : [ {
    "id" : 1,
    "createdAt" : "2024-01-29T11:49:47.9864639",
    "imageUrl" : "wwww.yanolja.com",
    "name" : "A 호텔",
    "roomType" : "디럭스",
    "price" : 20000,
    "checkInDate" : "2024-01-29T11:49:47.9864639",
    "checkOutDate" : "2024-01-31T11:49:47.9864639"
  }, {
    "id" : 2,
    "createdAt" : "2024-01-26T11:49:47.9864639",
    "imageUrl" : "wwww.yanolja.com",
    "name" : "B 호텔",
    "roomType" : "스텐다드",
    "price" : 15000,
    "checkInDate" : "2024-01-28T11:49:47.9864639",
    "checkOutDate" : "2024-01-30T11:49:47.9864639"
  } ]
}</code></pre>
</div>
</div>
<div class="paragraph">
<p>Unresolved directive in paymentHistory-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/payment-history-rest-controller-docs-test/get-purchased-history/response-fields.adoc[]</p>
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="saleHisotry-list">판매 내역 목록 조회</h2>
<div class="sectionbody">
<div class="paragraph">
<p>판매 내역 목록을 조회하는 API입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_4">HttpRequest</h3>
<div class="paragraph">
<p>Unresolved directive in paymentHistory-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/payment-history-rest-controller-docs-test/get-sale-history/http-request.adoc[]
Unresolved directive in paymentHistory-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/payment-history-rest-controller-docs-test/get-sale-history/path-parameters.adoc[]</p>
</div>
</div>
<div class="sect2">
<h3 id="_httpresponse_4">HttpResponse</h3>
<div class="paragraph">
<p>Unresolved directive in paymentHistory-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/payment-history-rest-controller-docs-test/get-sale-history/http-response.adoc[]
Unresolved directive in paymentHistory-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/payment-history-rest-controller-docs-test/get-sale-history/response-fields.adoc[]</p>
</div>
</div>
</div>
</div>
<div class="sect1">
<h2 id="_판매_내역_상세_조회">판매 내역 상세 조회</h2>
<div class="sectionbody">
<div class="paragraph">
<p>특정 판매 내역을 상세 조회하는 API입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_5">HttpRequest</h3>
<div class="paragraph">
<p>Unresolved directive in paymentHistory-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/payment-history-rest-controller-docs-test/get-specific-sale-history/http-request.adoc[]
Unresolved directive in paymentHistory-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/payment-history-rest-controller-docs-test/get-specific-sale-history/path-parameters.adoc[]</p>
</div>
</div>
<div class="sect2">
<h3 id="_httpresponse_5">HttpResponse</h3>
<div class="paragraph">
<p>Unresolved directive in paymentHistory-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/payment-history-rest-controller-docs-test/get-specific-sale-history/http-response.adoc[]
Unresolved directive in paymentHistory-api.adoc - include::C:\Users\wocjf\work\SCBJ-BE\build\generated-snippets/payment-history-rest-controller-docs-test/get-specific-sale-history/response-fields.adoc[]</p>
</div>
</div>
</div>
</div>
</div>
   </details>
   <details>
    <summary>알림 API</summary>
    <div id="content">
<div class="sect1">
<h2 id="_alarm_rest_api_docs">Alarm REST API Docs</h2>
<div class="sectionbody">

</div>
</div>
<div class="sect1">
<h2 id="get-alarms">알람 조회</h2>
<div class="sectionbody">
<div class="paragraph">
<p>알람를 조회하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">GET /v1/alarms HTTP/1.1
Authorization: ACCESS_TOKEN
Host: localhost:8080</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Name</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Authorization</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">JWT 액세스 토큰</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 263

{
  "message" : "알람 조회에 성공했습니다.",
  "data" : [ {
    "id" : null,
    "title" : "알림 TEST 제목입니다.",
    "content" : "알림 TEST 내용입니다.",
    "date" : "2024-01-29T11:49:12.8301092",
    "isRead" : false
  } ]
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].id</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Number</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">사용자 식별자</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].title</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">알림 제목</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].content</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">알림 내용</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].date</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.time.LocalDateTime</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">알림 발생일</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data[].isRead</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">알림 읽음 여부</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
<div class="sect1">
<h2 id="has-non-read-alarm">안 읽은 알림 있는지 여부</h2>
<div class="sectionbody">
<div class="paragraph">
<p>안 읽은 알림이 있는지 확인하는 API 입니다.</p>
</div>
<div class="sect2">
<h3 id="_httprequest_2">HttpRequest</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">GET /v1/alarms/status HTTP/1.1
Authorization: ACCESS_TOKEN
Host: localhost:8080</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 50%;">
<col style="width: 50%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Name</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>Authorization</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">JWT 액세스 토큰</p></td>
</tr>
</tbody>
</table>
</div>
<div class="sect2">
<h3 id="_httpresponse_2">HttpResponse</h3>
<div class="listingblock">
<div class="content">
<pre class="highlight nowrap"><code class="language-http" data-lang="http">HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json;charset=UTF-8
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 122

{
  "message" : "알람 읽음 여부 조회에 성공했습니다.",
  "data" : {
    "hasNonReadAlarm" : true
  }
}</code></pre>
</div>
</div>
<table class="tableblock frame-all grid-all stretch">
<colgroup>
<col style="width: 33.3333%;">
<col style="width: 33.3333%;">
<col style="width: 33.3334%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Path</th>
<th class="tableblock halign-left valign-top">Type</th>
<th class="tableblock halign-left valign-top">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>message</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>String</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">응답 메시지</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>data.hasNonReadAlarm</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock"><code>class java.lang.Boolean</code></p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">안 읽음 알림 있는지 여부</p></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
</div>
   </details>
   
</details>
