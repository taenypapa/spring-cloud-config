# Spring Cloud Config와 Spring Bus를 활용하여 설정 동기화

## Project Summary
- Spring Bus: rabbitmq를 활용한 config 전달
- Spring Cloud Config Server: github에 있는 config 가져오기
- Spring Cloud Config Client: Config Server의 aplication, profile 조합으로 해당 설정 파일 1개 가져오기
- Spring Cloud Config Client2: 동일한 프로파일을 연속해서 가져오는지 확인
- config: https://github.com/taenypapa/spring-config
