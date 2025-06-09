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
├── common/
│   └── src/main/resources/
│       ├── templates/
│       │   └── common/  # 공통 템플릿
│       └── static/
│           └── common/  # 공통 정적 리소스
├── admin/
│   └── src/main/resources/
│       ├── templates/   # 관리자용 템플릿
│       └── static/      # 관리자용 정적 리소스
└── user/
	└── src/main/resources/
	├── templates/   # 사용자용 템플릿
	└── static/      # 사용자용 정적 리소스
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