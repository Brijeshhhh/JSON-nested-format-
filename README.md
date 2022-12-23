# JSON-nested-format-
here I've made data into a nested JSON format . the data has been extracted from the database MYSQL server . 2 types of get methods are there to show the result one for fetching all the records from the table and another for getting records from each row using id .

Example :

{  "isbn": "123-456-222",
   "author":
   {    
        "lastname": "Doe", 
        "firstname": "Jane" 
    }, 
   "editor": 
   {   
        "lastname": "Smith",
        "firstname": "Jane" 
    },
   "title": "The Ultimate Database Study Guide",
   "category": ["Non-Fiction", "Technology"]
 }
