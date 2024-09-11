<p align="center">
  <img src="https://img.shields.io/static/v1?label=SpringExpert - Dev Superior&message=Testes Automatizados&color=8257E5&labelColor=000000" alt="Testes automatizados na prática com Spring Boot" />
</p>

# Competências

- Modelo de dados de usuários e perfis
- Validação com Bean Validation
  - Annotations
  - Customizando a resposta HTTP
  - Validações personalizadas com acesso a banco
- Login e controle de acesso
  - Spring Security
  - OAuth 2.0
  - Token JWT
  - Autorização de rotas por perfil

# Tópicos



# Objetivo

Essa sessão por sua vez pode ser um pouco repetiviva pelo que já aprendemos no Spring Professional, mas rever nunca é
demais, correto?

# UML

![img.png](img.png)

## Implementando User e Role

De sempre, só inserir as entidades e seus atributos.

Como o User para role é direcional, somente o User terá um Set de Roles (roles não terá user importado).

## Mapeamento objeto-relacional + seed banco

Fazer o mapeamento padrão ManyToMany com a tabela de associação e fazer o seed do banco:

```mysql
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Alex', 'Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Maria', 'Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
```

## CRUD Users

Criar repository, service e controller de User e fazer as subtituições necessárias.

E para dar o encode na senha? Usaremos o BCrypt.

1. Criar um UserInsertDto, ele herdará (extends UserDTO)
2. Ela terá uma String password (getter e setter)

^ Usar dentro do insert do UserService.

Aproveitar pra inserir SpringSecurity, OAuth2 (server/resource) e implementar as interfaces advindas do mesmo.

Qualquer dúvida, veja os meus estudos [aqui](https://olavo-moreira.gitbook.io/studies/v/login-e-controle-de-acesso/inserindo-oauth2-e-jwt-em-um-projeto)

Criar endpoints!

## Bean Validation




