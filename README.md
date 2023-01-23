# week4HomeWorkRest

# Insert a provider 

Request Url : /userinfo

Request method : POST

Request Body :


    {
        "provider" : {
            "firstName" : "R",
            "lastName" : "A",
            "middleName" : "T",
            "dob" : "xx"
         }
    }
  
Response Body:

    {
        "provider" : {
            "firstName" : "R",
            "lastName" : "A",
            "middleName" : "T",
            "dob" : "xx"
         }
    }
     
 
# Get a provider

Request Url : /userinfo/{id}

Request method : Get

Request Parameter: id
  
Response Body:

    {
        "provider" : {
            "firstName" : "R",
            "lastName" : "A",
            "middleName" : "T",
            "dob" : "xx"
         }
    }
    
    
    
# Delete a provider by id

Request Url : /userinfo/{id}

Request method : Delete

Request Parameter: id
  
Response Body: NO content
    


# Delete a provider

Request Url : /userinfo

Request method : Delete

Request Body :


    {
        "provider" : {
            "firstName" : "A",
            "lastName" : "B",
            "middleName" : "C",
            "dob" : "xx"
         }
    }
  
Response Body: NO content


# Update a provider 

Request Url : /userinfo

Request method : PUT

Request Body :


    {
        "provider" : {
            "firstName" : "R",
            "lastName" : "A",
            "middleName" : "T",
            "dob" : "xx"
         }
    }
  
Response Body:

    {
        "provider" : {
            "firstName" : "R",
            "lastName" : "A",
            "middleName" : "T",
            "dob" : "xx"
         }
    }
