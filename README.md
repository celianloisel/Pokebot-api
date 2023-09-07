# Pokebot API (Under Development)

The Pokebot API is an ongoing development project designed to support the core functionalities of Pokebot. Please note
that this API is currently in active development and is not yet ready for production use. Use it with caution and feel
free to report any issues or suggestions on the project's GitHub repository.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Configuring the .env File](#configuring-the-env-file)
- [Contributing](#contributing)

## Features

- [ ] Basic command handling
- [ ] Pokémon card data lookup
- [ ] Pokédex card integration
- [ ] Pokemon booster opening
- [ ] Battling system
- [ ] and more to come!

## Getting Started

### Prerequisites

Before you begin, ensure you have the following prerequisites installed:

- [Docker](https://www.docker.com/products/docker-desktop/)
- [Java](https://www.java.com/fr/)

### Installation

To use Pokebot on your Discord server, follow these steps:

1. Clone this repository:

   ```sh
   git clone https://github.com/celianloisel/pokebot-api.git

## Configuring the .env File

To configure Pokebot for your Discord server, you'll need to set up the `.env` file. By default, a template file
named `.env.exemple` is provided. You should rename this file to `.env` and fill in the necessary values.

**Follow these steps to configure your `.env` file:**

1. Rename `.env.exemple` to `.env`:

   ```sh
   mv .env.exemple .env

2. Open the .env file in a text editor of your choice and edit the values.

## Start project

To start the project.

1. Start the database on docker with: 
   ```sh
   make start-db
   ```
   
   or
   
   ```sh
   docker-compose -f dev/docker-compose.yml --env-file .env up --build --detach
   ```

2. run the project with :
    ```sh
   ./gradlew bootRun

## Contributing

We welcome contributions to help improve and expand the Pokebot project. If you'd like to contribute, please follow
these guidelines:

1. Fork the repository.

2. Create a new branch for your feature or bugfix.

3. Make your changes and ensure the code is well-documented.

4. Test your changes thoroughly.

5. Submit a pull request.

