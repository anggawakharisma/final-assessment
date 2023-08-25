# final-assessment
this is a simple crud using java spring-boot

**
1 merchant can have many store per merchant to do data collection

Endpoint:
//to create merchant
localhost:8080/api/merchant/create
//to update merchant by id
localhost:8080/api/merchant/update/{id}
//to find all merchant
localhost:8080/api/merchant/all
//to delete merchant by id
localhost:8080/api/merchant/delete/4
//to add store into merchant by id
localhost:8080/store/add/{id}
//to get data page per page
localhost:8080/api/merchant/search?page=0&size=10
