# ✍ 배운내용
### 트랜스폼
` 💾 back-visibility ` transform: rotateY(95deg), backface-visibility 사용 <br>
### 트랜지션
` 💾 tr1 ` 애니메이션 종류, 소요시간 설정 transtion-property , transition-duration <br>
` 💾 tr2 `  ... <br>
` 💾 tr-delay `  애니메이션 지연시간 설정 transition-delay <br>
` 💾 tr-3 `  애니메이션 시작시 천천히 진행 ease-in  <br>
` 💾 tr-4 `  ... <br>
### 키프레임
` 💾 ani-keyframes ` @keyframe 사용해보기 <br>
` 💾 ani-name ` ... <br>
` 💾 ani-count ` 애니메이션 양방향으로 설정하기 animation-direction: alternate; animation-iteration-count: infinite; <br>
` 💾 animation` 애니메이션 무한반복하기 animation: 키프레임 이름 1.5s infinite alternate; <br>
### 그리드
` 💾 fixed-layout ` 크기를 px로 지정하면 크기가 고정된다 <br>
` 💾 fluid-grid ` 크기를 %로 변경해서 페이지크기에 따라 바뀌게 <br>
` 💾 fluid-img ` 이미지에 max-width를 적용해서 반응형으로 만들기 <br>
` 💾 fluid-img2 ` <picture> 안에서  <source> 태그를 이용 (source 태그의 media 속성이 핵심) 너비에 따라 다른 이미지 보여주기 <br>
` 💾 fluid-video ` 동영상 넣기 : <video src="./video/cars.mp4" controls></video>     <br>
### 반응형 (미디어쿼리) 
` 💾 mq ` media를 사용해, 너비에 따른 스타일 적용해보기 (예시: @media screen and (max-width:1024px) { ... } ) <br>
` 💾 mq-orientation ` 스마트폰 가로, 세로환경에 따라 스타일 적용해보기 <br>
` 💾 index.html ` , ` 💾 css/index.css ` media 속성사용하기 2 <br>
### 플렉스 (레이아웃)
` 💾 flex1` display:flex 사용해보기 <br>
` 💾 flex2` flex-direction 사용해보기 (배치방향, 기본값은 한줄로만 정렬되는 row)<br>
` 💾 flex3` flex-wrap 사용해보기 (줄바꿈, 기본값은 한줄만 표시되는 nowrap) <br>
` 💾 flex4` flex-wrap을 사용해서 뒤집어보기 flex-wrap: wrap-revers;  <br>
` 💾 flex-order` 순서 정해주기 : flex속성이 적용된 자식요소에게 order: 숫자 <br>
` 💾 flex-align-self ` 세로정렬하기 : align-items 자식요소 모두에게 , align-self 나 자신만 <br>
