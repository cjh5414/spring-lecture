






## SLF4J and Logback

### logging 이란
Application 실행 과정에 대해 console, files, a database 등에 메세지를 기록한다.  
debugging 하기 위해, user interaction 를 기록하기 위해
정확한 문맥을 제공한다.  

Logging 은 사용자의 개입이 필요 없다. 운용 중에도 기록된다. 데이터를 기록할 수 있고 나중에 활용할 수 있다. 
debugging 은 Application 동작에 영향을 준다.  운용중에 사용할 수 없다. 사용자의 개입이 필요하다.


### plain output 과의 차이점
메세지에 등급을 적용할 수 있다. 
특정한 모듈, 특정한 클래스에 대해서만 메세지를 남길 수 있다.
메세지를 어떻게 포맷할 것인지를 제어할 수 있다.
어디로 메세지를 보낼지 정할 수 있다. (file, database console)


### SFL4J (Simple Logging Facade for Java)
- Facade:  건물의 정면
- Facade Pattern 
교통 카드와 같은 개념. 충전기와 같은 개념. 삼성 엘지 기기에 같은 충전기를 사용할 수 있다. 
Facade 가 제공하는 추상화 된 API 를 사용한다. Facade가 여러 logging 모듈별로 번역해준다. 

### Log Level
trace
debug
info
warn
error


### logback
### log4j
SFL4J보다 먼저 나왔기 때문에 Adaptation layer가 필요하다. 

class path location 하나에 logger만 넣어야 한다. 두개 이상을 binding 할 수 없다.


pom.xml에 logback-classic 만 넣으면 dependency injection에 의해 slf4j, logback-core 를 둘다 프로젝트에 받아준다.  


### bridging module
- jcl-over-slf4j
- log4j-over-slf4j
- SLF4JBridgeHandler

등을 이용해서 통합한다. 궁극적으로 SLF4J API를 이용할 수 있게 된다.  


