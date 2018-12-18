






## Spring Security

### Authentication
username, password
생체인식

### Autorization 
Access control

### Confidentiality
암호화

### 특징 
손쉽고 강력한 customizing
de-facto standard - 표준은 아니지만 매우 많이 사용되어 표준과 같다. (표준 위원회에서 만들어진 것은 아니다.)

### Filter 기반(Spring 에서 제공)
#### Filter란
request를 가로채서 pre-process, post-process 을 수행한다. 
- encoding
- spring security 에 사용.

dispatcher servlet으로 request가 가기 전에 filter를 거친다. 
권한이 있는 request 인지 확인.
권한이 없으면 로그인 창을 띄어준다.


## 사용 과정
### 1. pom.xml
### 2. filter 등록 
DelegatingFilterProxy !!!! - filter를 등록할 때 사용하는 filter class 
### 3. security-context.xml 작성
Authentication - 회원을 관리.
Authorization - 권한을 관리. URL 패턴별로 사용자의 권한에 맞도록 권한을 부여한다. 
특정 URL에 대해서 어떤 사용자 권한이 필요한지 지정한다. 


### auto-config='true'
enables from based login, basic authentication and logout mechanism
로그인 처리, 로그아웃 처리 등을 알아서 해준다. 
로그인 하면 등록된 사용자인지 체크하고 로그아웃 하면 세션을 닫고 세션동안 사용한 쿠키 등을 제거해주는 등의 일을 spring이 알아서 해준다. 


권한이 있는 경우
user reqyest -> DelegatingFilterProxy(filter) -> dispatcher servlet -> controller -> service -> dao -> DB

권한이 없는 경우
user reqyest -> DelegatingFilterProxy(filter) -> redirect to '/login' -> 
1. spring이 처리 하는 방법(default)
2. customizing

### Authorization. Expression-based Access Control
- hasRole()
- isAuthenticated()
- premitAll
- ...

### <security:form-login login-page="/login" />
login request controller 에서 처리한다. 
login, logout process는 spring에 의해서 처리되고 view 부분은 customizing 할 수 있다. 

### CSRF protextion
request 를 위조하는 공격 방법. 토큰을 주고 받는 방식으로 해결. 






