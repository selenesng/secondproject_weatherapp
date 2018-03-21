

# A clear problem statement from the client

Building a accessbile weather app that has a search function and save search history function.

# What business problem are you trying to solve with technology?

1. Being able to easily search world weather information.
2. Save user's search history

# Clearly present technical requirements of solving the business problem

1. Get a data that updates real-time
2. Have a search bar to input city name
3. Save user's search history

# A solution for a monolithic existing service and explain how to breakdown the monolithic service

Applying microservice to separate a weather-search feature and a save-history-feature

# The pros/cons of implementing a monolithic problem

Cons. It requires longer development cycle. Hard to manage or adjust small parts. 
May need to re-write a code of an application completely.
It can be costly in terms of budget and time.

Pros. Unlike microservices that is a chunk of loosly connected seperated units, monolithic is tightly coupled, 
and interdependent to changes. In other words, it's more suitable to synchronization compare to microservices.

# How the microservice will solve the companies problems

Saving user's search history, and weather-search function can be managed seperately as a two seperate features.

With the microesrvices approach, an application with complex structure can be divided into
smaller part which makes seperated management possible. It's also easier to add another service to existing service.


