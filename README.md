
## Estrutura de uma Aplicação RESTfull MVC com Spring Boot

Tem 4 pacotes: Web Request --> @RestController --> @Service --> @Repository --> @Entity  

// Usar este padrão no projeto:  

@RestController:  
@Service: lógica de negócio  
@Entity: entidade salva no banco  
@Repository: camada de acesso aos dados  

Tem que ter 3 instâncias de serviços rodando.  

Dependências:  

. Config Client  
. Config Server (configuração salva no servidor/git)  
. Cloud LoadBalancer  
. Eureka Discovery Client  
. Eureka Server  
. OpenFeign  
. Spring Boot DevTools  
. Spring Boot Actuator (Ops)  
. Spring Cloud (Configuration Server)  
. Spring Discovery Service  

// Será cobrado no projeto:  

. Microservice patterns: The Big Picture (slide 33, 36).  
. Service-based architecture - Application services: are stateless. No projeto fazer 3 (guardar o estado no banco de dados).  


