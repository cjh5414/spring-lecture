# Spring MVC Web Form






## Data Binding
### 1.Naive solution
doCreate(@RequestParam("name") String name, ..)


### 2.Spring Data Binding
"form bean" (command object)
Data coming from the form could be automatically bound to an object
doCreate(Offer offer) 

- 1. offer 객체를생성
- 2. offer 객체에 request param을 읽어서 데이터를 넣는다.
- 3. offer를 model에 넣는다. 

model에 들어가기 있기 때문에 controller 에서도, view 에서도 사용할 수 있다.


## Data Validation
사용자가 하는 실수 혹은 고의적으로 보안 공격을 예방하기 위해 데이터를 검증한다. 

### Hibernate Validator
제약 조건 명시.
- @NotNull, @Pattern, @Size
- @Email (Custom)

- Pattern(regexp="^[A-Z]{1}[a-z]+$") Regular Expression

### Validating Object
- @Valid
먼저 검증을 거치고 그 다음에 model에 넣어진다.  
검증의 결과는 BindingResult 에 담긴다. 
hasErrors()
ObjectError error
error.getDefaultMessage()

## Data buffering
- 1. 검증에 실패하면 사용자가 입력했던 데이터 제공
- 2. 에러 메세지 출력

### Spring from tag library
<%@ taglib prefix="sf" uri="...tags/form" %>

get method 에서는 처음에 offer 객체를 생성해줘야 한다.


