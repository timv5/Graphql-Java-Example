# Sample java graphql application
This is a sample graphql application implemented in java

## Presequences
- Maven, java
- postgres database (configurations located in application.properties) 

## Run
- mvn clean install
- java -jar graphql-java-example-1.0-SNAPSHOT.jar

## Usage (example)
POST request: http://localhost:8081/graphql

query: 
    query getUser($id: String!) {
        getUser(id: $id) {
            id
            username
        }
    }
    
graphql variables:
    {
    	"id": "1"
    }
    
response: 
    {
        "data": {
            "getUser": {
                "id": "1",
                "username": "test"
            }
        }
    }
