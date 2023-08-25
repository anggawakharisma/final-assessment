# final-assessment
this is a simple crud using java spring-boot

**
this code allow a merchant to do data collection in case 1 merchant will have many stores

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
