# product-order-service-kotlin

`실전! 스프링부트 상품-주문 API 개발로 알아보는 TDD 강의` 코틀린 버전

---

## 소개

- 인프런 강의 [실전! 스프링부트 상품-주문 API 개발로 알아보는 TDD 강의](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EC%8B%A4%EC%A0%84-%EC%83%81%ED%92%88%EC%A3%BC%EB%AC%B8-tdd) 의 [소스코드](https://github.com/ejoongseok/product-order-service) 를 코틀린으로 번환한 프로젝트입니다.
  - **TDD** 뿐 아니라 **클린 아키텍쳐**도 적용되어있어 굉장히 좋은 강의입니다.
  - `게다가 무료!`

- 자바 to 코틀린, 코틀린 to 자바를 학습하시려는 분들께 도움될까 싶어 만들었습니다.
  - ~~코틀린 쓰는 회사가 늘었으면 좋겠다. 코틀린 짱 좋은데~~

#### 파일 위치를 동일하게 작성하였습니다. 

|java|kotlin|
|---|---|
|![폴더 구조 자바](https://user-images.githubusercontent.com/30148662/226094055-5d339435-9401-44bd-80a0-7004be672a20.PNG)|![폴더 구조 코틀린](https://user-images.githubusercontent.com/30148662/226094062-22287f1e-eac2-4839-a347-6172654ac6e1.PNG)|
|![폴더 구조 자바 2](https://user-images.githubusercontent.com/30148662/226094152-9beca374-edc3-4433-831e-ff40978791cc.PNG)|![폴더 구조 코틀린 2](https://user-images.githubusercontent.com/30148662/226094158-f2021ac0-2593-4981-8e73-7056eb99cddb.PNG)|

#### 원본 코드와 최대한 동일하게 동작하도록 작성하였지만, 코틀린의 언어적 특성으로 인해 생략되거나 변경된 코드들이 있습니다. (ex. 도메인 엔티티)

|java|kotlin|
|---|---|
|![자바 2](https://user-images.githubusercontent.com/30148662/226094316-34f81e81-cc96-484d-b9fc-afdfbf47ce01.PNG)|![코틀린 2](https://user-images.githubusercontent.com/30148662/226094322-82b4c24c-d629-46f0-bc53-b8f549a983a7.PNG)|

- 코틀린에서는 DiscountPolicy에 null이 들어올 수 없어 null check 로직이 없어짐

#### kotlin test framework인 kotest의 편리함을 널리 알리고자, assertThat 대신 shouldBe를 사용하였습니다.

|java|kotlin|
|---|---|
|![테스트 자바 1](https://user-images.githubusercontent.com/30148662/226094509-a0949e09-8f57-4d9c-8523-f43b81d804ab.PNG)|![테스트 코틀린 1](https://user-images.githubusercontent.com/30148662/226094514-4ad05bf0-08f1-414a-96a1-189916e7ae63.PNG)|

## 레퍼런스

- [실전! 스프링부트 상품-주문 API 개발로 알아보는 TDD 강의](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EC%8B%A4%EC%A0%84-%EC%83%81%ED%92%88%EC%A3%BC%EB%AC%B8-tdd)
- [자바 버전 레포지토리 (원본)](https://github.com/ejoongseok/product-order-service)
- [kotest 공식 문서](https://kotest.io/docs/quickstart/)

## 더 알아보기

- [자바 개발자를 위한 코틀린 입문(Java to Kotlin Starter Guide)](https://www.inflearn.com/course/java-to-kotlin)
- [실전! 코틀린과 스프링 부트로 도서관리 애플리케이션 개발하기 (Java 프로젝트 리팩토링)](https://www.inflearn.com/course/java-to-kotlin)
- [Kotlin & Spring :
  리팩토링부터 서비스 구현까지](https://fastcampus.co.kr/dev_online_kopring)

혹시 잘못된 점은 이슈나 pr을 통해서 알려주시면 최대한 빠르게 적용하겠습니다.
