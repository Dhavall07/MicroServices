# Hotel-Rating App

The project demonstrates relations between different classes. The application allows to create users, register hotels, and send feedback.
The microservice architecture has separate services for individual functionalities and is facilitated by
client-server communication through Eureka dependency. It has different databases for different services and
the microservices are fault-tolerant using a circuit breaker and rate limiter.

## Endpoints:

### GET
`All Users ` [/users](#post-/users) <br/>
`User By ID ` [/users/{id}](#post-/users/{id}) <br/>
`All Hotels ` [/hotels](#post-/hotels) <br/>
`Hotel By ID ` [/hotels/{id}](#post-/hotels/{id}) <br/>
`All Ratings ` [/ratings](#post-/ratings) <br/>
`Ratings By User ID ` [ratings/users/{id}](#post-ratings/users/{id}) <br/>

### POST
`Create a User `
curl --location --request POST 'http://localhost:0000/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"",
    "email":"@gmail.com",
    "about":""
}'

`Create a Hotel  `
curl --location --request POST 'http://localhost:0000/hotels' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":" ",
    "location":"",
    "about":" "
}'

`Create a Rating `
curl --location --request POST 'http://localhost:0000/ratings' \
--header 'Content-Type: application/json' \
--data-raw '{
    "rating":9,
    "feedback":"",
    "userId":"",
    "hotelId":""
}'

