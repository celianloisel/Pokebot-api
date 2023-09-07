start-db:
	docker-compose -f dev/docker-compose.yml --env-file .env up --build --detach

stop-db:
	docker-compose -f dev/docker-compose.yml --env-file .env down