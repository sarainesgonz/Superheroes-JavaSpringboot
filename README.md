# Superheroes-JavaSpringboot

### Superheroes
#### Get all the superheroes
```
GET /superhero
HTTPResponseStatus: 200, 404, 500
```

#### Insert a new superhero
```
POST /superhero
Body: Information about the superhero
HTTPResponseStatus: 201, 404, 500
```

#### Get a specific superhero
```
GET /superhero/{id} --> /superhero/1
HTTPResponseStatus: 200, 404, 500
```

#### Delete a superhero
```
DELETE /superhero/{id} --> /superhero/1
HTTPResponseStatus: 200, 204, 404, 500
```
### Superpowers
#### Get all the superpowers of a specific superhero
```
GET /superhero/{id}/superpower --> /superhero/1/superpower
```

#### Add a superpower to a superhero
```
POST /superhero/{id}/supeprpower --> /superhero/1/superpower
Body: Information of the superpower to be added
HTTPResponseStatus: 201, 404, 500
```

#### Get a specific superpower 
```
GET /superhero/{id}/superpower/{powerid} --> /superhero/1/superpower/1
HTTPResponseStatus: 200, 404, 500
```