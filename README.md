# gifted
This Spring Boot application consume RSS Feeds from http://feeds.feedburner.com/experiment_podcast

# improvements
- Exception Handling
- Authorization and Authentication

# ToDo
- Unit Testing
- Need to implement Cron Jobs for polls RSS feed every 5 minutes

# Rest End Points

- Retrieving the 10 newest items
Example: GET http://<host>:<port>/items
  
- Paginated, with direction based on a given field
Example: GET http://<host>:<port>/items?page=1&size=2&sort=updated_date&direction=asc

