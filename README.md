# Form3-Clean-TDD

The following example is based on the Tech Test supplied by Form 3.


The code architecture is based on the  "Clean Design Pattern" then using 
TDD to implement the usercases.

Rest Architecture : 

![Task Document](https://github.com/MadMouse/Form3-Clean-TDD/blob/master/Documents/back-end_developer_-_api_coding_exercise.pdf)

![Rest Architecture](https://github.com/MadMouse/Form3-Clean-TDD/blob/master/Documents/payments-architector.pdf)

![Clean Architecture Diagram](https://github.com/MadMouse/Form3-Clean-TDD/blob/master/Documents/clean_arch.png)

#### Notes : 
This is a basic raw Spring-boot project designed to prove the architecture.

I implemented the Jackson JSON parser to help with speeding up test data. 

#### Libraries

ModelMapper - 
ObjectMapper - 
JacksonJson - 


#### Project Stucture

    Main 
        --- Core / Domain
            --- Entities / Models
                Base data models for use internally  
            --- Use Case
                -- <Use Case Interfaces> / interacters
                    --Impl
                        Implementation of the Use Case these define the DataProvider / Repository capabilities in 
                        the outer ring. 
        
        --- dataproviders
            --- database 
                Providers where the actual database work needs to be done using the Use cases to define capabilities.
            --- Network
                --- Converters
                    This is where the conversion Tools used to convert from internal models to external models.
                    and visa versa.                        
    
        
        --- Endpoints  (Presenters)
            This is where  the external interface and Rest API are presented.
    
    test
        -- The tests follow the same structure as main.
        -- Test naming should be based on the "What" "When" and "Then" design <What I am testing>_<When suppiled with>_<then this happens>    
        
#### Next Steps for the project
    
    1.) Seperate the core, databases, network and endpoints into there own modules containing there own tests.
    2.) Rudimentary test have been implemented and need to be completed.
    3.) Impliment tests for Dataprovider.
    4.) Impliment tests for Add/Delete/Update.
         
