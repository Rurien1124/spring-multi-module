# 스프링 멀티 모듈 프로젝트

- 개발 환경
```text
Java 21
Spring boot 3.4.1
Gradle
Yaml
Thymeleaf
H2 (MS-SQL)
```

- 관리자/사용자 웹의 공통된 부분과 다른 부분을 모듈로 분리
```text
project-root/
├── core/                # 핵심 기능 정의
├── domain/              # Service, Repository, Domain 정의
├── common/              # 공통 Type, Util 정의
├── admin/               # 관리자 웹, API 정의
│   └── src/main/resources/
│       ├── templates/
│       └── static/
└── user/                # 사용자 웹, API 정의
    └── src/main/resources/
        ├── templates/
        └── static/
```

- jar 빌드 시 예상 결과
```text
1. 관리자 웹 모듈
  - common
  - admin

2. 사용자 웹 모듈
  - common
  - user
```