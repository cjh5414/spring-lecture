







# Spring MVC

### Dispatcher Servlet (Front Controller)
사용자가 request를 보내면 처음 받는 객체.
URL을 Handler Mapping 객체에 넘겨서 URL에 해당하는 controller 를 알아내서 그 conroller 로 요청을 넘겨준다.  

### Handler Mapping 
Mapping table 을 보고 어떤 controller에게 보내야할지 알아낸다. 

### Controller
request 를 Model을 이용하여 처리한다. 
@RequestMapping 을 사용해서 method 와 URL을 mapping 한다.
@RequestParam method의 매개변수로 Get의 파라미터를 받을 수 있다.

### View Resolver
view name으로 실제 view가어디에 있는지 찾아서 반환해준다.  


### ContextLoadListener 
DAO, DataSource, Service 등의 공유되는 Beans 을 관리한다.   
contextConfigLocation 에 설정된 파일들을 읽는다.  

### InternalViewResolver
Controller 가 return 하는 Spring 값에 prefix, suffix를 붙여서 실제 view 가 존재하는 위치를 제공한다. 

### Model
key, value 로 구성된 객체로 controller 와 view 간에 데이터를 교환할 때 사용한다. controller 와 view 는 model 을 이용하여 communication을 한다. 

1. java.util.map -> Map<String, Ojbect> model, model.put()
2. Model interface provided by Spring 
model.addAttribute() 사용. 이름(key)를 지정해주지 않아도 된다. 알아서 지정해준다. 
3. ModelMap object provided by Spring
chained call 가능. model.addAttribute().addAttribute()

### JSTL
JSP Standard Tag Library



### Spring Container : Bean 을 생성하고 관리한다. 의존성 주입도 한다. 
