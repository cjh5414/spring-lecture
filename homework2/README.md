# 한성 대학교 학점 관리 시스템
## 개발 스택
- IntelliJ
- Spring
- Maven
- Mysql
- Bootstrap 4

<br/>

## 프로젝트 기능
- 현재까지 수강한 총 이수 학점을 학년, 학기 별로 확인할 수 있다.
- 특정 학년, 학기에 이수한 교과목 리스트를 확인할 수 있다.
- 전체 이수한 교과목을 한 번에 확인할 수 있다.
- 2019년도 1학기 수강 신청을 할 수 있다.
- 2019년도 1학기 수강신청 내역을 조회할 수 있다.
- 로그인 로그아웃 할 수 있다.
- Navbar의 메뉴를 통해 위의 기능들을 쉽게 이용할 수 있다.

<br/>

## 프로젝트 구조
### controller
- HomeController: 메인 페이지.
- LoginController: Spring Security 이용. Custom Login 페이지.
- RegisterController: 수강 신청 및 조회 페이지.
- GradeController: 학기별 이수 학점 조회 페이지.

### service
- CourseService

### dao
- CourseDAO: model.Course과 DB의 course 테이블을 맵핑하여 데이터 조회, 추가, 수정, 삭제.

### model
- Course: DB의 courses 테이블과 매핑.
- Grade: 학기별 이수 학점 관리를 위한 모델.

### view
- home.jsp
- nav.jsp
- grades.jsp
- login.jsp
- register.jsp
- registered_courses.jsp
- registration.jsp

### WEB-INF
web.xml, dispatcher-servlet.xml 등 Spring MVC를 위한 환경설정 파일들이 들어있다. jdbc, spring security, view resolver 등의 환경 설정이 되어있다.

<br/>

## Database
### users
| username | password | enabled |
|:--------:|:--------:|:--------:|
| ... | ... | ... |
| cjh5414 | 1234 | 1 |
| asd123 | fjfjd323 | 1 |

### authorities
| username | authority |
|:--------:|:--------:|
| ... | ... |
| cjh5414 | ROLE_ADMIN |
| asd123 | ROLE_ADMIN |

### courses
| ID | year | semester | code | name | section | credit |
|:--------:|:--------:|:--------:|:--------:|:--------:|:--------:|:--------:|
| ... | ... | ... | ... | ... | ... | ... |
| 1 | 2014 | 1 | COM0033 | 자료구조 | 전선 | 3 |
| 1 | 2015 | 1 | GEN0032 | 사회봉사 | 일교 | 2 |
| 1 | 2015 | 2 | COM0045 | 이산수학 | 전기 | 3 |


<br/>

## 인증. Spring Security
DB에 users, authorities table을 생성하여 사용자를 관리하고 인증 기능을 구현. 로그인 폼은 커스터마이징 하였고 로그인에 실패하면 실패 메세지를 보여주고 재시도 할 수 있게 구현하고 로그아웃 시에도 로그아웃 성공 메세지를 표시한다.

인증 유무를 체크하여 메인 페이지를 보는 것 이외의 모든 기능은 인증 후에 사용 가능하다. 인증하지 않고 시도하면 로그인 페이지로 자동으로 이동한다.


<br/>

## WebForm
Hibernate Validation 이용하여 사용자 입력을 검증하고 잘 못된 경우 메세지로 표시해준다. controller에서 form data, error message 등의 데이터를 넘겨주면 spring tag form 및 jstl을 이용하여 페이지에 보여줄 수 있도록 구현되어 있다.

<br/>

## URL Convention
| 역할 | Method | URL |
|:--------|:--------:|:--------|
| 메인 | GET | / |
| 로그인 페이지 보기 | GET | /login |
| 로그인 | POST | /login |
| 로그아웃 | POST | /logout |
| 학년/학기 별 이수 학점 보기| GET | /grades |
| 총 이수 교과목 보기 | GET | /registration |
| 년도, 학기 별 이수 교과목 보기 | GET | /registration?year=2017&semester=1 |
| 수강 신청 페이지 보기 | GET | /register |
| 수강 신청 하기 | POST | /register |
| 수강 신청 내역 보기 | GET | /registered_courses |
