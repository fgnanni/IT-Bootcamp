--Mostrar o título e o nome do gênero de todas as séries.
SELECT s.title, g.name FROM series s JOIN genres g ON s.genre_id = g.id;

--Mostrar o título dos episódios, o nome e sobrenome dos atores que trabalham em cada um deles.
SELECT e.title, a.first_name, a.last_name FROM actor_episode JOIN actors a ON actor_episode.actor_id = a.id JOIN episodes e ON actor_episode.episode_id = e.id;

--Mostrar o título de todas as séries e o número total de temporadas que cada uma delas possui.
SELECT s.title, COUNT(seasons.number) As total FROM seasons JOIN series s ON seasons.serie_id = s.id GROUP BY s.title;

--Mostrar o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior ou igual a 3.
SELECT g.name, COUNT(m.genre_id) As total  FROM movies m JOIN genres g ON g.id = m.genre_id  GROUP BY g.name HAVING total >= 3;

--Mostrar apenas o nome e sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.
SELECT DISTINCT a.first_name, a.last_name FROM actor_movie JOIN actors a on actor_movie.actor_id = a.id WHERE actor_movie.movie_id IN (SELECT id FROM movies WHERE title LIKE 'La Guerra%');