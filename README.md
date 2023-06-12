# gifted
This application consume RSS Feeds from http://feeds.feedburner.com/experiment_podcast

# improvements
Exception Handling
Authorization and Authentication

# ToDo
Unit Testing

# Rest End Points

Retrieving the 10 newest items
Example: GET http://<host>:<port>/items
  
Paginated, with direction based on a given field
Example: GET http://<host>:<port>/items?page=1&size=2&sort=updated_date&direction=asc

