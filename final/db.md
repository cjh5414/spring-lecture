JDBC Driver : 데이터 베이스와 연결하기 위한 Driver
 - msyql-connector-java (Mysql)

DataSource : DB 와 통신하기 위해 논리적, 소프트웨어 적인 관점에서 Connection 을 관리한다.  논리적, 소프트웨어 적인 관점에서. ip, port, 접근 가능한 사용자 정보 등의 데이터를 설정.
DB 별로 여러 개의 DataSource가 존재할 수 있다. 
 - commons-dbcp (Apache)

JDBC Template: DataSource를 주입. Database의 정보를 바탕으로 Database 에 접근.
 - spring-jdbc (Spring)


BasicDataSource: DB Connection Pool 기능 제공. Database Connections 를 열고 닫는 오버헤드를 줄이기 위해 미리 Pool에 만들어 놓는다. 
bean 설정파일을 작성해주면 spring container에 의해서 bean이 singleton으로 하나만 만들어진다.



DAO(Data Access Object): CRUD의 API를 Service 객체에게 제공하는 객체. Service는 SQL를 몰라도 DAO를 통하면 Data에 접근할 수 있다. DAO가 SQL을 사용해서 DB에 질의를 한다. 

```java
    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
```  

의존성 주입이 된 dataSource를 이용하여 JdbcTemplate 객체를 생성한다. JdbcTemplate는 datasource 객체를 이용하여 DB에 접근한다.  DAO는 이 JdbcTemplate 객체를 이용한다.  

### JdbcTemplate

Spring 에서 JDBC를 제공하는 이유, Plain JDBC와의 차이점 
Plain: connection 을 열고 닫고, 예외처리를 해줘야 한다.

Spring JDBC가 대신 해주는 일
- connection 연결
- statement 준비해서 실행
- 예외 처리
- transactions 처리
- connection 닫기


jdbcTemplateObject.query(sql문장, RowMapper);
- RowMapper 를 사용해서 결과를 객체로 반환
- RowMapper 는 결과 record를 받아서 객체로 Mapping 해준다. 
- 익명 클래스를 이용하면 편리.


1. xml 이용하는 방법
bean 을 생성한다. 
setDataSource, <property>를 이용하여 의존성 주입

2. Annotation 이용하는 방법
@Component bean 을 등록. context:component-scan 을 지정해주면 해당하는 패키지만 스프링이 스캔해서 @Component를 찾아서 bean으로 등록해준다.  
@Autowired 이용하여 의존성 주입

### JdbcTemplate class 사용법
#### Select
1. Querying for an integer
2. Querying for a String
3. Querying and returning an object: RowMapper interface 구현해야 한다. queryForObject() 사용.
4. Querying and returning multiple objects: query() 사용. 

#### Insert, Update, Delete
update() 사용.

## DB Exceptions

SQLExcepion(in plain JDBC): too general and doesn't give us the real picture of what is happening. Necessary to write a catch block
DataAccessException(in Spring): SQLException is translated to a more expressivce sub-class of DataAccessException. subClass: BadSQLGrammarException, CannotGetJdbcConnectionException.
Unnecessary to write a catch block.



@Autowired: Data Type에 의해 자동으로 의존성을 주입한다.   

Thread pool : Request 이 들어 올 때마다 thread 를 생성하고 제거하는 오버헤드를 줄이기 위해 미리 thread를 만들어 놓고 요청이 들어오면 할당해준다. 트래픽은 일정하게 꾸준히 들어오는 것이 아니라 특정 시간에 몰려서 들어오는 것이 특징이다.  

Maven: 하나의 라이브러리를 다운 받으면 그 라이브러리를 사용하기 위해 의존되어 있는 여러 라이브러리들이 있는데 그것들 Maven은 다 알고 있어서 한 번에 받아준다.  그 과정에서 같은 라이브러리이지만 버전이 다른 라이브러리들이 여러개 생길 수 있는데 이것 또한 관리해준다.  


